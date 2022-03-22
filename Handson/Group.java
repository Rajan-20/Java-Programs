package com.ob.training;

public class Group {
 public static void main(String[] args) {
	User user = new Admin("Rajan",6382644896l);
	user.chat();
	user.video();
	user.share();
	
	Admin admin = (Admin) user;
	admin.addUser();
	admin.removeUser();
	
}
}
