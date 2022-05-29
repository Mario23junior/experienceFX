package experienceFX.FXMLButton;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class FXMLCheckBoxController {

	@FXML
	private CheckBox cdJava;

	@FXML
	private CheckBox cdSwift;

	@FXML
	void capturarValores() {
      System.out.println(cdJava.selectedProperty().getValue());
      System.out.println(cdSwift.selectedProperty().getValue());
	}

}
