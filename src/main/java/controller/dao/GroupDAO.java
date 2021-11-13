/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dao;

import model.Group;

/**
 *
 * @author admin
 */
public class GroupDAO extends DAO{

    public GroupDAO() {
        super();
    }
    public void insert(Group g){
        // thêm đối tượng vào bảng    
    }
    public Group getGroupByName(String name){
        //lấy đối tượng bằng tên cảu group
        return null;
    }
    public Group getGroupByUserName(String username){
        //lấy đối tượng bằng tên của 1 user trong group
        return null;
    }
}