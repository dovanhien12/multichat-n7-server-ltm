/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mysql.cj.xdevapi.DatabaseObject;
import controller.dao.DAO;
import controller.dao.UserDAO;
import java.net.Socket;
import java.util.Map;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author admin
 */
public class ControllerClientThread implements Runnable{
    private Map<String,ControllerClientThread> listUser;
    private Socket socket;
    //private DAO dao;
    public ControllerClientThread(Map<String,ControllerClientThread> listUser, Socket socket) {
        this.listUser = listUser;
        this.socket = socket;
       // this.dao = new DAO();
    }
    
    
    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(this.socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(this.socket.getOutputStream());
            
           // ObjectInputStream ois = new ObjectInputStream(this.socket.getInputStream());
           // ObjectOutputStream oos = new ObjectOutputStream(this.socket.getOutputStream());
            User u=null;
            boolean isLogin =false;
            do{
                String request="";
                request = dis.readUTF();
              
                switch (request) {
                    case "login":
                    {
                        String username = dis.readUTF();
                        String password = dis.readUTF();
                        u = loginU(username, password);
                        
                        if(u!=null&&  this.listUser.get(u.getUsername())== null){
                            
                            isLogin=true;
                            dos.writeUTF("success");
                            this.listUser.put(u.getUsername(),this);
                        }else {
                            dos.writeUTF("failure");
                        }
                        break;
                    }
                    
                    case "logout":{
                        isLogin=false;
                        this.listUser.remove(u.getUsername());
                        break;
                    }
                }
            }while(isLogin);
        } catch (IOException ex) {
            Logger.getLogger(ControllerClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static User loginU(String username,String password){
       UserDAO  uDAO = new UserDAO();
       User u = uDAO.getByUsername(username);
       
       if(u!=null&&u.getPassword().equals(password)){
           return u;
       }
       return null;
    }
}
