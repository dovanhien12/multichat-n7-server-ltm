/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.User;

/**
 *
 * @author admin
 */
public class UserDAO extends DAO{

    public UserDAO() {
        super();
    }
    public User getByUsername(String username) {
        String sql = "Select * from user where username = ?";
        try{
            PreparedStatement preStatement = this.conn.prepareStatement(sql);
            preStatement.setString(1, username);
            ResultSet rs = preStatement.executeQuery();
            if(rs.next()){
                User u = new User(rs.getInt(1),
                rs.getString(2),
                rs.getString(3));
                return u;
            }
        }catch(SQLException e){
         return null;    
        }
        return null;
    }
    public User[] getFriendsByUserName(String username){
        // lấy những user đã từg nhắn tin cho username
        return null;
    }
     public void insert(User u){
       /// thêm đối tượng vào bảng 
    }
}
