package fr.cpe.rest.impl;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.json.Json;

import fr.cpe.model.User;
import fr.cpe.rest.IWebAuth;
import fr.cpe.services.IWebService;


public class WatcherAuth implements IWebAuth{

	
	@Inject
	IWebService webService;
	
	 
	@Override
	public void doPost(User user) {
		webService.afficher(user);
	}
}