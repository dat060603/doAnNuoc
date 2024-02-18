package Controller.ChuHoController;

import Database.DBS;
import Model.ChuHo;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ChuHoDAO {
    public List<ChuHo> getAll() throws Exception{
        List<ChuHo> lstChuHo = new ArrayList();
        String SQL = "SELECT P.CCCD, P.Username, P.DOB, P.Address, P.Phone\n" +
                     "FROM [dbo].[PERSON_INFO] AS P\n" +
                     "JOIN [dbo].[ACCOUNT] AS A\n" +
                     "ON P.CCCD = A.CCCD\n" +
                     "WHERE A.Privilege = 0";
        try(
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while(rs.next()){
                ChuHo chuHo = new ChuHo();
                chuHo.setCCCD(rs.getString("CCCD"));
                chuHo.setUsername(rs.getString("Username"));
                chuHo.setAddress(rs.getString("Address"));
                chuHo.setPhone(rs.getString("Phone"));
                chuHo.setDOB(rs.getDate("DOB"));
                
                lstChuHo.add(chuHo);
            }
        }
        
        return lstChuHo;
    }
}
