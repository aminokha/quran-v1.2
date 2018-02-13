package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableView;

public class Tools {

    static Connection connection = null;
    static Statement statement = null;

    public static void createDataBase() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:students_table.sqlite");
            statement = connection.createStatement();
            // create the database if not exist and create the student table
            try {// we use try because if the database is created this statement will throw an sqlException
                statement.executeUpdate("CREATE TABLE student (id INTEGER PRIMARY KEY NOT NULL UNIQUE, Fname TEXT,Lname TEXT, DateIns DATE, de TEXT,jusqua TEXT)");
            } catch (SQLException sQLException) {
                System.out.println("the table is already exist");
            }
            System.out.println("is connected");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public static ResultSet getData() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:students_table.sqlite");
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void executeSQL( String sqlString ) {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:students_table.sqlite");
            statement = connection.createStatement();
            statement.executeUpdate(sqlString);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void fillTable( TableView<Student> table ) {
        try {
            table.getItems().clear();
            ResultSet resultSet = getData();
            while (resultSet.next()) {
                Student student = new Student();
                student.idProperty = new SimpleIntegerProperty(resultSet.getInt("id"));
                
                Main.lastID = resultSet.getInt("id");
                
                student.FnameProperty = new SimpleStringProperty(resultSet.getString("Fname"));
                student.LnameProperty = new SimpleStringProperty(resultSet.getString("Lname"));
                student.DateInsProperty = new SimpleStringProperty(resultSet.getString("DateIns"));
                student.PeriodProperty = new SimpleStringProperty("0");
                student.DeProperty = new SimpleStringProperty(resultSet.getString("de"));
                student.jusquaProperty = new SimpleStringProperty(resultSet.getString("jusqua"));
                student.nbrDe8Property = new SimpleStringProperty("0");
                student.TotalProperty = new SimpleStringProperty("0");
                table.getItems().add(student);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void refresh_LastID( HomeController homeController ) {
        Main.lastID = 0;
        for (int i = 0; i < homeController.tableView.getItems().size(); i++) {
            Main.lastID = homeController.tableView.getItems().get(i).idProperty.get();
        }
    }
}
