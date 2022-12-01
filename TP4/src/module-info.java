/**
 * 
 */
/**
 * @author Eleve
 *
 */
module TP3 {
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
