package com.itsc.lab_exam;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class LabExamApplication {

// 	public static void main(String[] args) {
// 		System.out.println("Hello world!");
// 		// SpringApplication.run(LabExamApplication.class, args);
// 	}

// }

// package com.itsc.trail2.employee_mamagment;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database_init {
	public static void main(String[] args) {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/trial_database";
			String username = "root"; // your username
			String password = "rootpass"; // your password
			Class.forName(driver); // optional
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Established Connection");
		} catch (Exception e) {
			e.printStackTrace(); // TODO: handle exception
		}
	}
}
