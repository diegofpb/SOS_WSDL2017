package sos.t3.a31.demo.client;

import java.rmi.RemoteException;

import sos.t3.a31.demo.client.UserManagementWSStub.PasswordPair;
import sos.t3.a31.demo.client.UserManagementWSStub.Response;
import sos.t3.a31.demo.client.UserManagementWSStub.User;

public class Client {
	public static void main(String[] args) throws RemoteException{

		UserManagementWSStub stub1 = new UserManagementWSStub();
		stub1._getServiceClient().engageModule("addressing");
		stub1._getServiceClient().getOptions().setManageSession(true);
		
		UserManagementWSStub stub2 = new UserManagementWSStub();
		stub2._getServiceClient().engageModule("addressing");
		stub2._getServiceClient().getOptions().setManageSession(true);
		
		Response response1 = new Response();
		Response response2 = new Response();
		boolean res;
		
		// Superuser
		User admin = new User();
		admin.setName("admin");
		admin.setPwd("admin");
		System.out.println("Admin creado");

		// Tester users 
		User user1 = new User();
		user1.setName("user1");
		user1.setPwd("user1");
		System.out.println("Usuario prueba 1 creado");

		User user2 = new User();
		user2.setName("user2");
		user2.setPwd("user2");
		System.out.println("Usuario prueba 2 creado");

		User user3 = new User();
		user3.setName("user3");
		user3.setPwd("user3");
		System.out.println("Usuario prueba 3 creado");
		
// Pruebas servicios	
		
		// Login admin
		response1 = stub1.login(admin);
		res = response1.getResponse();
		System.out.println("Login admin" + res);

		// Change password
		PasswordPair psw = new PasswordPair();
		psw.setOldpwd("admin");
		psw.setNewpwd("newpsw");
		response1 = stub1.changePassword(psw);
		res = response1.getResponse();
		if(res)
			System.out.println("Contraseña cambiada" + res);
		System.out.println("Error cambio contraseña" + res);

		// Attach new users
		stub1.addUser(user1);
		stub1.addUser(user2);
		stub1.addUser(user3);

		stub1.logout();

		// login different instances
		response1 = stub1.login(user1);
		response2 = stub2.login(user1);
		
		stub2.logout();
		


		System.out.println();
	}
}
