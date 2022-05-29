package experienceFX.FXMLButton;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import experienceFX.model.Categoria;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class FXMLComboBoxController implements Initializable {

	@FXML
	private ComboBox<Categoria> cbCategoria;
	
	private List<Categoria> categoria = new ArrayList<>();
	
	private ObservableList<Categoria> obserCategoria;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
        readCategory();
	}
	
	public void readCategory() {
		
		Categoria c1 = new Categoria();
		c1.setId(1);
		c1.setNome("Tecnologia");
		
		Categoria c2 = new Categoria();
		c2.setId(2);
		c2.setNome("Entreterimento");
		
		Categoria c3 = new Categoria();
		c3.setId(3);
		c3.setNome("Radio astronomia");
		
		categoria.add(c1);
		categoria.add(c2);
		categoria.add(c3);
		
		obserCategoria = FXCollections.observableArrayList(c1,c2,c3);
		
		cbCategoria.setItems(obserCategoria);
		
	}

}
