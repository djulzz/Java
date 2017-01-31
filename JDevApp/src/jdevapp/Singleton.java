package jdevapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author djulzz
 */
public class Singleton<T>
{ 
    private static  Singleton<?> instance = new Singleton<Object>();
    private Singleton()
    {
    }
    
    T variable;
 
    public static Singleton<?> getInstance() { 
        return instance; 
    } 
}
