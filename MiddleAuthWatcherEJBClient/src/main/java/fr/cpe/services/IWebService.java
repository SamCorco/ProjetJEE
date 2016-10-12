package fr.cpe.services;

import javax.ejb.Local;

import fr.cpe.model.User;


@Local
public interface IWebService {
	
	void afficher(User user);

}
