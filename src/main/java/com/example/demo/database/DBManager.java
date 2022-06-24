package com.example.demo.database;

import com.example.demo.obj.User;
import com.google.gson.Gson;

import java.sql.*;

public class DBManager {

    Connection con;
    PreparedStatement preStatement;

    // JDBC는 query를 날릴 경우 result set 형식으로 데이터가 날라옴
    public void connector(String host, String port, String schema, String user, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port + "/" + schema , user, password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public Object sendQuery()
    {
        User user = new User();

        try {
            preStatement = con.prepareStatement("select * from user");
            // ResultSet으로 iduser, password, name (key : value) 로 받아옴
            ResultSet rs = preStatement.executeQuery();
                System.out.println("rs is next ");
            if(rs.next()){
                user.iduser = rs.getString(rs.findColumn("iduser"));
                user.password = rs.getString(rs.findColumn("password"));
                user.username = rs.getString(rs.findColumn("username"));

                System.out.println(new Gson().toJson(user));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }


    public void disconnector(){
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
