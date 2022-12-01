package entite;

public class Personne {
	
	private String nomP;
	
	private String login;
	
	public Personne(String nomP, String login) {
		this.nomP = nomP;
		this.login = login;
	}
	
	public Personne() {
		
	}
	
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}
