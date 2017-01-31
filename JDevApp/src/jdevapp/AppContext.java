/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdevapp;

/**
 *
 * @author djulzz
 */
public class AppContext implements Runnable
{
    @Override public void run()
    {
//        Singleton<MainWindow> s = (Singleton<MainWindow>)Singleton.getInstance();
//        MainWindow frame = s.variable;
        MainWindow frame = new MainWindow();
        frame.setVisible(true);
//        MainWindow mw = ( MainWindow )frame;
    }
}
