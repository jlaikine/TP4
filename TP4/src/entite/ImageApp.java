package entite;


public class ImageApp {
	
	private String nom;
	
	private String url;
	
	public ImageApp(String nom, String url) {
		this.nom = nom;
		this.url = url;
	}
	
	public ImageApp() {
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
