package Secure;

import javax.swing.JOptionPane;

/**
 *

 */
public class getadmindata{
    // class check if user is suspended or not 
    Login check = new Login();
   
    
    public String getStatus(String username, String password){
       String rs;
        String s = check.CheckStatus( username , password);
         {
                        //if ("1".equals(rs.getString("status")))
                        {
                           
                            //JOptionPane.showMessageDialog(null," staff login");
                            
                            //this.setVisible(false);
                            //new ECS_GUI().setVisible(true);
                        }
        return s;
        
    }
    
}
}
