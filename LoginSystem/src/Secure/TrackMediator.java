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
public class TrackMediator {
    
    Track_Processor trackP = new Track_Processor();
    
    public String method(String ModCode, int Sid){
         
        String s = trackP.getStatus(ModCode, Sid);
        return s;
        
    } 
    
}
