package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserList {

	ArrayList<User> userList = new ArrayList<User>();
	File file = new File("UserList.txt");
	
	public void saveUserList(User user) {
		addToList();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			for (User u : userList) {
				bw.write(u.toString());
			}
			bw.write(user.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean checkUserFromList(User user) {
		addToList();
		for (User checkUser : userList ){
			if (user.getUserName().equals(checkUser.getUserName()))
				if(user.getPassword().equals(checkUser.getPassword()))
					return true;
		}

		return false;
	}

	private void addToList() {
		String userName, password;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((userName = br.readLine()) != null && (password = br.readLine()) != null){
				userList.add(new User(userName, password));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addNewUser(String userName, String password){
		User user = new User(userName, password);
		saveUserList(user);
	}

}
