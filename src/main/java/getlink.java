
import java.sql.*;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paresh
 */
public class getlink 
{
    public String[] getdata(String data) throws ClassNotFoundException, ClassNotFoundException, SQLException
    {
        
        String link = null;
        data=data+" ";
        String[] col=data.split(" ");
        String team1=col[0];
        String team2=col[1];        
        int year=Integer.parseInt(col[2]);                
        Connection con=DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_dabc09d301bacbd","bf72ebcdbb48f4","00ca6c8a");
        Statement stmt=con.createStatement();      
        System.out.println("hello1");
           String sql="Select Link,extra from ipl where year="+year+" AND team1='"+team1+"' AND team2='"+team2+"'OR team1='"+team2+"' AND team2='"+team1+"' AND year="+year+"";
           System.out.println(sql);
           ResultSet rs=stmt.executeQuery(sql);           
           String[] ar = {"","","","","","","",""};           
           int ij=0;
           while(rs.next())
           {               
               
               ar[ij]=rs.getString("Extra");
               ij++;
               ar[ij]=rs.getString("link");               
               ij++;
               
           }
           System.out.println(ar[1]);
       return ar;
        
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        getlink obj=new getlink();
        obj.getdata("CSK RCB 2019");
    }
}
