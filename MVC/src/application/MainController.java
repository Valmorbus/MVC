package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class MainController implements Initializable{
	@FXML Button login;
	@FXML Button guest;
	@FXML Button vote;
	
	@FXML ListView<String> list;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		login.setOnAction(e->{
			try {
				changeScene("LoginView.fxml", e);
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		guest.setOnAction(e->{
			changeScene("ListOfExibitorView.fxml", e);
			
		});
		
	}
	
	protected void changeScene(String fxml, Event e){
		try {
			Parent loginScreen = FXMLLoader.load(getClass().getResource(fxml));
			Scene loginScene = new Scene(loginScreen);
			Stage secondStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			secondStage.setScene(loginScene);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

}
