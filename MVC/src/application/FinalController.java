package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class FinalController extends MainController {
	ObservableList<String> entries = FXCollections.observableArrayList("n�got", "n�tt annat");
	@FXML
	private ListView<String> list;
	@FXML
	private Button vote;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list.setItems(entries);

	}

}
