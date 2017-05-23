/**
 * UserManagementWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.fi.sos.t3.usermanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * UserManagementWSSkeleton java skeleton for the axisService
 */
public class UserManagementWSSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @return
	 */

	private static HashMap<String, User> usersDb = new HashMap<String, User>();
	private static List<String> activeUsers = new ArrayList<>();
	private User sessionUser;
	//private static Boolean isAdmin; // Conexión administrador
	private Boolean isLogged; // Conexión usuario


	// Create the admin user when Skeleton starts if db is empty..
	public UserManagementWSSkeleton() {
		if (usersDb.isEmpty()){
			User user = new User();
			user.setName("admin");
			user.setPwd("admin");
			usersDb.put("admin", user);
		}
		//isAdmin = false;
		sessionUser = null;
		this.isLogged = false;
	}


	public void logout() {
		if(isLogged){
			isLogged = false;
			activeUsers.remove(sessionUser.getName());
			sessionUser = null;
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param user
	 * @return response
	 */

	public Response login(User user) {
		Response response = new Response();
		response.setResponse(false);

		// Si vuelve a iniciar sesion a pesar de tenerla iniciada.
		if(sessionUser != null && user.getName().equals(sessionUser.getName()) 
				&& isLogged){
			response.setResponse(true);
			return response;
		}

		// Buscamos si usuario existe.
		User userInDb = usersDb.get(user.getName());
		if(userInDb==null){
			return response;
		}

		// Look if user is equal (name and pass).
		if(!user.getPwd().equals(userInDb.getPwd())){
			return response;
		}

		// Loggeamos usuario.
		if(!isLogged){
			isLogged = true;

			// Anadimos instancia de usuario.
			activeUsers.add(user.getName());

			sessionUser = userInDb;
			response.setResponse(true);
		}
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param user1
	 * @return response2
	 */

	public Response addUser(User user1) {

		Response response = new Response();
		response.setResponse(false);

		// Only a logged admin can perform this operation.
		if(!isLogged || !sessionUser.getName().equals("admin"))
			return response;

		// User1 is at the DB yet.
		if(usersDb.containsKey(user1.getName())){
			return response;
		}

		// At here, we add the user.
		usersDb.put(user1.getName(), user1);

		response.setResponse(true);
		return response;

	}

	/**
	 * Auto generated method signature
	 * 
	 * @param passwordPair
	 * @return response3
	 */

	public Response changePassword(
			PasswordPair passwordPair) {
		Response response = new Response();
		response.setResponse(false);

		if(isLogged){
			if(sessionUser.getPwd().equals(passwordPair.getOldpwd())){
				sessionUser.setPwd(passwordPair.getNewpwd());
				response.setResponse(true);
			}
		}
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param username
	 * @return response4
	 */

	public Response removeUser(Username username) {
		Response response = new Response();
		response.setResponse(false);

		//if(sessionUser == null)
		//return response;
		//if(sessionUser.getName().equals("admin") && isLogged){

		if(!isLogged || !sessionUser.getName().equals("admin"))
			return response;

		// Si nuestra sesion es la misma, no podemos.
		if(sessionUser.getName().equals(username.getUsername()))
			return response;

		// Usuario ha de existir en el sistema.
		if(usersDb.get(username)==null)
			return response;

		// Usuario no puede tener ninguna instancia iniciada
		if(!activeUsers.contains(username)){
			usersDb.remove(username);
			response.setResponse(true);
		}

		return response;
	}

}
