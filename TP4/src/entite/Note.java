package entite;

public class Note {
	
	private int note;
	
	private ImageApp image;
	
	private Personne personne;
	
	public Note(int note, ImageApp image, Personne personne) {
		this.image = image;
		this.personne = personne;
	}
	
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	
	public ImageApp getImage() {
		return image;
	}
	public void setImage(ImageApp image) {
		this.image = image;
	}
	
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
}
