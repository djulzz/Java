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
public class Person {
    public String m_FirstName;
    public String m_LastName;
    
    public static int m_numberReferences = 0;
    
    
    public Person( )
    {
        m_FirstName = "";
        m_LastName = "";
        
        m_numberReferences = m_numberReferences + 1;
    }
}
