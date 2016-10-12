package fr.cpe.services.impl;

import javax.ejb.Stateless;

import fr.cpe.model.User;
import fr.cpe.services.IWebService;

@Stateless
public class WebService implements IWebService {

	@Override
	public void afficher (User user) {
		user.show();
			
	}
	
}
