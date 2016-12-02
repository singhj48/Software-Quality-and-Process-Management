/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs.system;

/**
 *
 * @author Toshiba
 */
public class Track_Processor {
    
    CoverSheet status = new CoverSheet();
    
    public String getStatus(String ModCode, int Sid){
       
        String s = status.CheckStatus(ModCode, Sid);
        return s;
        
    }
    
}
