/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import view.ViewPanel;

/**
 *
 * @author admin
 */
public class ViewController {
    private ViewPanel vp;
    private JFrame jf;
    private String stt;
    private ControllerServer cs;
    public ViewController(JFrame jf) throws IOException {
       
        stt=new String(); 
        cs = new ControllerServer();
        this.jf = jf;
        this.vp=new ViewPanel();
        this.jf.add(this.vp);
        setup();
        this.jf.pack();
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    public ViewController(ViewPanel vp) {
        this.vp = vp;
        
    }
    public void setup(){
        this.vp.getjButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                start();
                updateStatus();
            }
        }
                
        );
        this.vp.getjButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                update();
                updateStatus();
            }
        }
                
        );
    }
    public void start(){
       
        System.out.println(this.stt);
    }
    public void update(){
        stt+="update\n";
    }
    public void updateStatus(){
        this.vp.getjTextArea1().setText(stt);
    }
}
