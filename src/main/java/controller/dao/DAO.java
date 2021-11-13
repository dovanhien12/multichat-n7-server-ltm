/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    protected Connection conn;
    private final String HostName = "127.0.0.1";
    private final String DBName = "multi_chat";
    private final String UserName = "root";
    private final String Password = "123456";
    public String err;
     
    public DAO(){
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String connectionURL = "jdbc:mysql://" + HostName + ":3306/" + DBName+"?zeroDateTimeBehavior=convertToNull";
                this.conn = DriverManager.getConnection(connectionURL, UserName, Password);
            }
            catch(Exception e){
                err = e+"";
                this.conn=null;
            }       
    }
}

