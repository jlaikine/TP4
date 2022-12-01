package Service;

import java.util.ArrayList;

import entite.ImageApp;
import entite.Note;
import entite.Personne;

public class Model {
		
	private ArrayList<ImageApp> listImage = new ArrayList<ImageApp>();
	private ArrayList<Personne> listPersonne = new ArrayList<Personne>();
	
	public void data() {
			
		ArrayList<Note> listNote = new ArrayList<Note>();
		
		ImageApp imgParis = new ImageApp("Paris","src/image/paris.jpg");
		ImageApp imgEspace = new ImageApp("Espace","src/image/espace.jpg");
		ImageApp imgCastres = new ImageApp("Castres","src/image/castres.jpg");
		ImageApp imgToulouse = new ImageApp("Toulouse","src/image/toulouse.jpg");
		
		Personne user1 = new Personne("Johan","123");
		Personne user2 = new Personne("Jinx","456");
		
		listImage.add(imgParis);
		listImage.add(imgEspace);
		listImage.add(imgCastres);
		listImage.add(imgToulouse);
		
		listPersonne.add(user1);
		listPersonne.add(user2);
		
	}
	
	public ArrayList<ImageApp> getListeImage() {
		return listImage;
	}
	
	public ArrayList<Personne> getPersonne() {
		return listPersonne;
	}
}
