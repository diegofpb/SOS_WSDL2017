package sos.t3.a31.demo.client;

import java.rmi.RemoteException;

import sos.t3.a31.demo.client.UserManagementWSStub.PasswordPair;
import sos.t3.a31.demo.client.UserManagementWSStub.Response;
import sos.t3.a31.demo.client.UserManagementWSStub.User;
import sos.t3.a31.demo.client.UserManagementWSStub.Username;

public class Client {
	public static void main(String[] args) throws RemoteException{

		UserManagementWSStub stub1 = new UserManagementWSStub();
		stub1._getServiceClient().engageModule("addressing");
		stub1._getServiceClient().getOptions().setManageSession(true);

		UserManagementWSStub stub2 = new UserManagementWSStub();
		stub2._getServiceClient().engageModule("addressing");
		stub2._getServiceClient().getOptions().setManageSession(true);

		Response response = new Response();
		boolean res;

		// Superuser
		User admin = new User();
		admin.setName("admin");
		admin.setPwd("admin");
		System.out.println("Admin creado");

		User adminFalso = new User();
		adminFalso.setName("admin");
		adminFalso.setPwd("pepe");
		System.out.println("Admin creado");

		// Tester users 
		User user1 = new User();
		user1.setName("user1");
		user1.setPwd("user1");
		System.out.println("Usuario prueba 1 creado");

		Username username1 = new Username();
		username1.setUsername("user1");

		Username username2 = new Username();
		username2.setUsername("user2");

		PasswordPair pswd1 = new PasswordPair();
		pswd1.setOldpwd("user1");
		pswd1.setNewpwd("newuser1");

		User user2 = new User();
		user2.setName("user2");
		user2.setPwd("user2");
		System.out.println("Usuario prueba 2 creado");

		User user3 = new User();
		user3.setName("user3");
		user3.setPwd("user3");
		System.out.println("Usuario prueba 3 creado");

		// Pruebas servicios	

		// Login adminFalso
		System.out.println("\nPrueba 1: Logueamos con admin incorrecto (admin,pepe), FALSE");
		response = stub1.login(adminFalso);
		res = response.getResponse();
		System.out.println("Login adminFalso: " + res);

		// Login admin
		System.out.println("\nPrueba 2: Logueamos con admin correcto (admin,admin), TRUE");
		response = stub1.login(admin);
		res = response.getResponse();
		System.out.println("Login admin: " + res);

		// Login usuario inexistente
		System.out.println("\nPrueba 3: Logueamos con user1 inexistente en el sistema (user1,user1), FALSE");
		response = stub2.login(user1);
		res = response.getResponse();
		System.out.println("Login user inexistente: " + res);

		// Desloguear
		System.out.println("\nPrueba 4: Desloguear a admin");
		stub1.logout();


		// Acceder a servicios sin login
		System.out.println("\nPrueba 5: Probamos todos los servicios con admin sin loguear, FALSE");
		response = stub1.addUser(user1);
		System.out.println("Añadimos user1: " + response.getResponse());
		response = stub1.removeUser(username1);
		System.out.println("Borramos user1: " + response.getResponse());
		response = stub1.changePassword(pswd1);
		System.out.println("Cambiamos password user1: " + response.getResponse());


		// Login admin y attach new users
		System.out.println("\nPrueba 7: Logueamos admin y añadimos usuario nuevo, TRUE");
		response = stub1.login(admin);
		System.out.println("Logueamos admin: " + response.getResponse());
		response = stub1.addUser(user1);
		System.out.println("Añadimos user1: " + response.getResponse());
		response = stub1.addUser(user2);
		System.out.println("Añadimos user2: " + response.getResponse());

		// Admin attach user1
		System.out.println("\nPrueba 8: admin y añadimos usuario existente, FALSE");
		response = stub1.addUser(user1);
		System.out.println("Añadimos user1 ya existente: " + response.getResponse());


		// Login user1 con admin logueado (misma sesion)
		System.out.println("\nPrueba 9: Logueamos user1 en misma sesion de admin, FALSE");
		response = stub1.login(user1);
		System.out.println("Login user1 en sesion de admin: " + response.getResponse());


		// Segundo login admin con contraseña incorrecta
		System.out.println("\nPrueba 10: Logueamos segundo admin con pass incorrecta, TRUE");
		response = stub1.login(adminFalso);
		System.out.println("Login admin falso en sesion de admin: " + response.getResponse());


		// Change password admin
		System.out.println("\nPrueba 11: Cambiamos la password a admin, TRUE");
		PasswordPair psw = new PasswordPair();
		psw.setOldpwd("admin");
		psw.setNewpwd("newpsw");
		response = stub1.changePassword(psw);
		System.out.println("Contraseña cambiada " + response.getResponse());


		// Change password admin incorrect oldpsw
		System.out.println("\nPrueba 12: Cambiamos la password a admin metiendo mal antigua, FALSE");
		psw.setOldpwd("admin");
		response = stub1.changePassword(psw);
		System.out.println("Error al cambiar contraseña" + response.getResponse());


		// Test login with old psw
		System.out.println("\nPrueba 13: Deslogueamos admin, lo intentamos loguear con password antigua, FALSE");
		stub1.logout();
		response = stub1.login(admin);
		System.out.println("Contraseña errónea: " + response.getResponse());


		// Test login with new psw
		System.out.println("\nPrueba 14: Intentamos loguear admin con password nueva, TRUE");
		admin.setPwd("newpsw");
		response = stub1.login(admin);
		System.out.println("Login correcto: " + response.getResponse());


		// Change password user1
		System.out.println("\nPrueba 15: Cambiamos la password a user, TRUE");
		stub2.login(user1);
		psw.setOldpwd("user1");
		response = stub2.changePassword(psw);
		System.out.println("Contraseña cambiada: " + response.getResponse());


		// User add user
		System.out.println("\nPrueba 16: Usuario añade usuario, FALSE");
		response = stub2.addUser(user3);
		System.out.println("Usuario1 añade usuario3:  " + response.getResponse());


		// User1 intete borrar usuario
		System.out.println("\nPrueba 17: Usuario intenta borrar a usuario, FALSE");
		response = stub2.removeUser(username2);
		System.out.println("Usuario1 borra usuario2:  " + response.getResponse());


		// Admin intete borrar usuario logueado user1
		System.out.println("\nPrueba 18: Admin intenta borrar a usuario logueado user1, FALSE");
		response = stub1.removeUser(username1);
		System.out.println("Admin borra usuario1:  " + response.getResponse());


		// Admin intete borrar usuario no logueado user2
		System.out.println("\nPrueba 19: Admin intenta borrar a usuario no logueado user2, TRUE");
		response = stub1.removeUser(username2);
		System.out.println("Admin borra user2:  " + response.getResponse());


		// Admin intete borrar usuario no existente
		System.out.println("\nPrueba 20: Admin intenta borrar a usuario inexistente, FALSE");
		response = stub1.removeUser(username2);
		System.out.println("Admin borra user2: " + response.getResponse());


		// Admin intete borrar usuario que no existe
		System.out.println("\nPrueba 21: Admin intenta borrar a admin, FALSE");
		username2.setUsername("admin");
		response = stub1.removeUser(username2);
		System.out.println("Admin borra admin: " + response.getResponse());

		stub1.logout();
		stub2.logout();
	
	}
}
