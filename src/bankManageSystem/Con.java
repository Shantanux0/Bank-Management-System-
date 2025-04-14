package bankManageSystem;

import java.sql.*;


public class Con {
    Connection connection;
    public Statement statement;
    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","Root@123");
            statement=connection.createStatement();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
