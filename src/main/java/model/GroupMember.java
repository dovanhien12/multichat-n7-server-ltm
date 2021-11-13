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
public class GroupMember  implements Serializable{
     static final long serialVersionUID = 5L;
     private int id;
     private Group group;
     private User receiver;

    public GroupMember(int id, Group group, User receiver) {
        this.id = id;
        this.group = group;
        this.receiver = receiver;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
     
}
