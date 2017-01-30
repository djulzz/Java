/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdevapp;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author djulzz
 */
public class JDevApp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        java.awt.EventQueue.invokeLater
        (
                new Runnable()
                {
                    public void run()
                    {
                        MainWindow frame = new MainWindow();
                        frame.setVisible(true);
                    }
                }
        );
    }
    
}
