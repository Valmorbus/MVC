package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegisterController extends MainController {
	@FXML
	private Button register;
	@FXML
	private Button cancel;
	@FXML
	private TextField username;
	@FXML
	private TextField password;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		register.setOnAction(e -> {
			UserList uList = new UserList();
			uList.addNewUser(username.getText(), password.getText());
			changeScene("LoginView.fxml", e);
			
		});
		cancel.setOnAction(e->{
			changeScene("LoginView.fxml", e);
		});
	}

}
