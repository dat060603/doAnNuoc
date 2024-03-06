
package Controller.LoginController;

import Database.DBS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
    
    public boolean Login(String userName,String passWord) throws Exception{
        Connection cnn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean isValid = false;
        
        try {
            cnn = DBS.getConnection();
            String SQL="SELECT COUNT(A.CCCD) AS Count FROM ACCOUNT A WHERE A.Account_Username=? AND A.Account_Password=? ";
            preparedStatement = cnn.prepareStatement(SQL);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, passWord);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt("Count");
                isValid = count > 0; 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        }
        
        return isValid;
    }
    
    public void UpdateLogin(String CCCD,String userName,String passWord) throws Exception{
        Connection cnn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            cnn=DBS.getConnection();
            String SQL="UPDATE ACCOUNT\n" +
                        "SET Account_Password =?\n" +
                        "WHERE CCCD = ? AND Account_Username = ?";
            preparedStatement=cnn.prepareStatement(SQL);
            preparedStatement.setString(1, passWord);
            preparedStatement.setString(2, CCCD);
            preparedStatement.setString(3, userName);
            preparedStatement.executeUpdate();

        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
