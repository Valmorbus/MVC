package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController extends MainController {
	@FXML
	private Button loginbutton;
	@FXML
	private Button cancel;
	@FXML
	private Button register;
	@FXML TextField loginText;
	@FXML PasswordField passwordText;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		register.setOnAction(e -> {
			changeScene("RegisterUser.fxml", e);
		});
		cancel.setOnAction(e -> {
			changeScene("WelcomeView.fxml", e);
		});
		loginbutton.setOnAction(e -> {
			UserList uList = new UserList();
			if (uList.checkUserFromList(new User(loginText.getText(), passwordText.getText()))){
				changeScene("ListOfExibitorView.fxml", e);
			}
			loginText.clear();
			passwordText.clear();

		});

	}

}
