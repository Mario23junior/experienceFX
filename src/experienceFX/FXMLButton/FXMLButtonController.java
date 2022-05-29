package experienceFX.FXMLButton;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLButtonController implements Initializable{

	@FXML
	private Label labelOlaMundo;
	
	@FXML
	private void acaoDoButton(ActionEvent event) {
		System.out.println("Ola eu fui clicado");
		labelOlaMundo.setText("Ola mundo");
	}
	

	
	public void initialize(URL arg0, ResourceBundle arg1) {
 		
	}

}
