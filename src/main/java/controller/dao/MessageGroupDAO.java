/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dao;

import model.MessageGroup;

/**
 *
 * @author admin
 */
public class MessageGroupDAO extends DAO{

    public MessageGroupDAO() {
        super();
    }
    public MessageGroup getByUserIDGroupID(int userID,int groupID){
        // lấy tin nhắn từ những bảng messageGroup theo 2 điều kiện userid và grouup id
       return null ;
    }
    public void insert(MessageGroup mg){
        // thêm đối tượng vào bảng    
    }
}