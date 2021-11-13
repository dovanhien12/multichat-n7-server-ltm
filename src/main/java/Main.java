
import controller.ViewController;
import java.io.IOException;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws IOException {
        JFrame jf = new JFrame();
        ViewController vc = new ViewController(jf);
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jf.setVisible(true);
            }
        });
    }/////////////
}
