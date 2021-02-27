
import java.sql.*;

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
    public String getdata(String data) throws ClassNotFoundException, ClassNotFoundException, SQLException
    {
        String link = null;
        data=data+" ";
        String[] col=data.split(" ");
        String team1=col[0];
        String team2=col[1];        
        int year=Integer.parseInt(col[2]);        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
        Statement stmt=con.createStatement();      
        try 
        {
            
        {
            String extra=col[3];
            char ch=extra.charAt(0);
            String sql="Select Link from ipl where team1='"+team1+"' AND team2='"+team2+"' AND year="+year+" AND Extra Like '"+ch+"%'";
            System.out.println(sql);
                      System.out.println(sql);
           ResultSet rs=stmt.executeQuery(sql);
           while(rs.next())
           {
               link=rs.getString(1);
           }
 
        }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        
           String sql="Select Link from ipl where team1='"+team1+"' AND team2='"+team2+"' AND year="+year+"";
           System.out.println(sql);
           ResultSet rs=stmt.executeQuery(sql);
           while(rs.next())
           {
               link=rs.getString(1);
           }
        }
       return link;
        
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        getlink obj=new getlink();        
        System.out.println(obj.getdata("Csk RR 2008 final"));
    }
}
