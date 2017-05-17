/**
 * UserManagementWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.fi.sos.t3.usermanagement;

import java.util.HashMap;

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
	private User sesionUser;
	private static Boolean isAdmin; // Conexión administrador
	private Boolean isLogged; // Conexión usuario


	// Create the admin user when Skeleton starts if db is empty..
	public UserManagementWSSkeleton() {
		if (usersDb.isEmpty()){
			User user = new User();
			user.setName("admin");
			user.setPwd("admin");
			
			usersDb.put("admin", user);
		}
		isAdmin = false;
		this.isLogged = false;
	}


	public void logout() {
		if(isLogged)
			isLogged = false;
		if(isAdmin)
			isAdmin = false;
		// TODO : fill this with the necessary business logic
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param user
	 * @return response
	 */

	public es.upm.fi.sos.t3.usermanagement.Response login(
			es.upm.fi.sos.t3.usermanagement.User user) {
		Response response = new Response();
		response.setResponse(false);
	
		// Look if user exists.
		if(usersDb.get(user.getName())==null || 
				(user.getName().equals("admin") && isAdmin)){
			return response;
		}
		
		// Get the user in DB.
		User userInDb = usersDb.get(user.getName());
		
		// Look if user is equal (name and pass).
		if(!user.equals(userInDb)){
			return response;
		}
		
		// Only if is admin, then set admin.		
		isAdmin = userInDb.getName().equals("admin");
		
		// Set logged to the user.
		isLogged = true;
		
		sesionUser = userInDb;
		response.setResponse(true);
		return response;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param user1
	 * @return response2
	 */

	public es.upm.fi.sos.t3.usermanagement.Response addUser(
			es.upm.fi.sos.t3.usermanagement.User user1) {
		
		Response response = new Response();
		response.setResponse(false);
		
		// Only a logged admin can perform this operation.
		if(!isLogged || !isAdmin){
			return response;
		}
		
		// User1 name is at the DB yet.
		if(user1.getName().equals(usersDb.get(user1.getName()))){
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

	public es.upm.fi.sos.t3.usermanagement.Response changePassword(
			es.upm.fi.sos.t3.usermanagement.PasswordPair passwordPair) {
		Response response = new Response();
		response.setResponse(false);
		if(isLogged){
			if(sesionUser.getPwd().equals(passwordPair.getOldpwd())){
			sesionUser.setPwd(passwordPair.getNewpwd());
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

	public es.upm.fi.sos.t3.usermanagement.Response removeUser(
			es.upm.fi.sos.t3.usermanagement.Username username) {
		Response response = new Response();
		response.setResponse(false);
		if(isAdmin && isLogged){
			if(usersDb.get(username)!=null){
				usersDb.remove(username);
				response.setResponse(true);
				}
		}
		return response;
	}

}
