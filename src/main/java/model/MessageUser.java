/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class MessageUser implements Serializable{
     static final long serialVersionUID = 4L;
     private int id ;
     private String message;
     private User receiver,sender;

    public MessageUser(int id, String message, User receiver, User sender) {
        this.id = id;
        this.message = message;
        this.receiver = receiver;
        this.sender = sender;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public User getReceiver() {
        return receiver;
    }

    public User getSender() {
        return sender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
     
}
