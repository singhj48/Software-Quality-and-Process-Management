/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

/**
 *
 * @author Toshiba
 */
public class Track_Processor {
    
    Db_Repo DbPro = new Db_Repo();
   
    
    public String getStatus(String ModCode, int Sid){
       
        String s = DbPro.CheckStatus(ModCode, Sid);
        return s;
        
    }
    
}
