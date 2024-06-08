package com.itsc.lab_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentRepo {

  public void createDBAndTable() {
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "rootpass")) {
      Statement statement = connection.createStatement();
      String createDatabase = "CREATE DATABASE IF NOT EXISTS StudentDB";
      String useDatabase = "USE StudentDB";
      String createTable = "CREATE TABLE IF NOT EXISTS Students (" +
          "id INT PRIMARY KEY, " +
          "name VARCHAR(50), " +
          "email VARCHAR(50))";
      statement.executeUpdate(createDatabase);
      statement.executeUpdate(useDatabase);
      statement.executeUpdate(createTable);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void insertIntoTable(Student student) {
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root",
        "rootpass")) {
      String query = "INSERT INTO Students (id, name, email) VALUES (" + student.getId() + ", '" + student.getName()
          + "', '" + student.getEmail() + "')";
      Statement statement = connection.createStatement();
      statement.executeUpdate(query);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

// yaredmgmt