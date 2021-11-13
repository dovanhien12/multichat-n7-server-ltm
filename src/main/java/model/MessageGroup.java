/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class MessageGroup {
     static final long serialVersionUID = 6L;
   
     private int id ;
     private String message;
     private User sender;

    public MessageGroup(int id, String message, User sender) {
        this.id = id;
        this.message = message;
        this.sender = sender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
     
     
}
