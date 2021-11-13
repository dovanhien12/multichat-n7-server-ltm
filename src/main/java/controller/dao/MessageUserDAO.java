/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dao;

import model.MessageUser;

/**
 *
 * @author admin
 */
public class MessageUserDAO extends DAO{

    public MessageUserDAO() {
        super();
    }
    public MessageUser getByUserIDGroupID(int senderID,int receiverID){
        // lấy tin nhắn từ những bảng messageGroup theo 2 điều kiện SenderID và ReceiverID
       return null ;
    }
    public void insert(MessageUser mu){
        // thêm đối tượng vào bảng    
    }
}
