package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import Service.Model;
import entite.ImageApp;
import entite.Personne;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class VueController implements Initializable{
	
	@FXML
	private ListView<String> list;
	@FXML
	private ImageView imageView;
	@FXML
	private TextField nom;
	@FXML
	private TextField login;
	
	ObservableList<String> l =FXCollections.observableArrayList();
	private Model model;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.model = new Model();
		model.data();
		
		list.setItems(l);
		for(ImageApp img :model.getListeImage()) {
			list.getItems().add(img.getNom());
		}
		/*
		File file = new File(model.getListeImage().get(0).getUrl());
		Image img = new Image(file.toURI().toString());
		imageView.setImage(img);
		*/
	}
	
	public void changeImage(MouseEvent e) {
		for (ImageApp image : this.model.getListeImage()) {
			if (image.getNom().equals(list.getSelectionModel().getSelectedItem())) {
				File file = new File(image.getUrl());
				Image img = new Image(file.toURI().toString());
				imageView.setImage(img);
			}
		}
	}
	
	public void identification(Event e) {
		String name = nom.getText();
		String mdp = login.getText();
	
		for (Personne prs : this.model.getPersonne()) {
			if (prs.getNomP().equals(name) && prs.getLogin().equals(mdp)) {
				System.out.println("Connecté");
			}else {
				System.out.println("Non connecté");
			}
		}
	}
}
