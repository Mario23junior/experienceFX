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
import javafx.scene.control.ListView;
 
public class FXMLListViewController implements Initializable {
    
	@FXML
	private ListView<Categoria> lvCategorias;
	
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	private ObservableList<Categoria> obsCategorias;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarCategorias();
	}
	
	public void carregarCategorias() {
		
		Categoria c1 = new Categoria();
		c1.setId(1);
		c1.setNome("Comidas");
		
		
		Categoria c2 = new Categoria();
		c2.setId(2);
		c2.setNome("Frutas");
		
		Categoria c3 = new Categoria();
		c3.setId(3);
		c3.setNome("Fritas");
		
		Categoria c4 = new Categoria();
		c4.setId(4);
		c4.setNome("Molho");
		
		categorias.add(c1);
		categorias.add(c2);
		categorias.add(c3);
		categorias.add(c4);


		obsCategorias = FXCollections.observableArrayList(categorias);
		
		lvCategorias.setItems(obsCategorias);
		
	}

}
