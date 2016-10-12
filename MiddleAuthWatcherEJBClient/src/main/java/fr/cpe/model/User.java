package fr.cpe.model;

import org.jboss.logging.Logger;

public class User {
	
	Logger log = Logger.getLogger(User.class);
	
	String login;
	String pwd;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void show(){
		log.info(login + " " + pwd);
	}
}
