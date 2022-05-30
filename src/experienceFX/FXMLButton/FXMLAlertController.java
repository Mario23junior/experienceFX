package experienceFX.FXMLButton;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class FXMLAlertController implements Initializable {

	@FXML
	private Button btnAbrirAlerta;

	@FXML
	void abrirAlert(ActionEvent event) {
       Alert alert = new Alert(AlertType.WARNING);
       alert.setTitle("Informação");
       alert.setHeaderText("Cabeçalho");
       alert.setContentText("Contéudo");
       alert.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
