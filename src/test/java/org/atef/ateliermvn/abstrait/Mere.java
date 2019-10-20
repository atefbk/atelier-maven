package org.atef.ateliermvn.abstrait;

public abstract class Mere {

	private String att1;
	private String att2;
	
	
//	
//	public Mere() {
//	}

	public Mere(String att1, String att2) {
		this.att1 = att1;
		this.att2 = att2;
	}
	
	public abstract void afficher();
	
	
}
