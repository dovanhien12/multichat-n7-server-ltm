/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author admin
 */
public class ControllerServer implements Runnable{
    private ServerSocket socket;
    public ControllerServer() throws IOException {
        Thread th =new Thread(this,"server");
        this.socket = new ServerSocket(10000);
        th.start();
    }
    
    @Override
    public void run() {
        Map<String,ControllerClientThread> list = new HashMap<>();
        while(true){

            try {
               ExecutorService executor = Executors.newFixedThreadPool(100);
                Socket client = this.socket.accept();
               
                executor.execute(new ControllerClientThread(list,client));
            } catch (IOException ex) {
                Logger.getLogger(ControllerServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
