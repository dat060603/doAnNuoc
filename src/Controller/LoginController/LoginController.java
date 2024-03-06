
package Controller.LoginController;

import javax.swing.JOptionPane;

public class LoginController {
    public boolean login(String userName, String passWord) throws Exception{
        return new LoginDAO().Login(userName, passWord);
    }
    public void UpdateLogin(String CCCD,String userName ,String passWord) throws Exception{
        new LoginDAO().UpdateLogin(CCCD, userName, passWord);
    }
}
