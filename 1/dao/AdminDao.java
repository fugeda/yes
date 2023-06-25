package dao;

import bean.Fruitltem;
import tools.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AdminDao {
    public ArrayList<Fruitltem> queryALLData(){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        ArrayList<Fruitltem> list=new ArrayList<Fruitltem>();
       try{ conn= JDBCUtils.getConnection();
        stmt=conn.createStatement();
        String sql="select * from fruit";
        rs=stmt.executeQuery(sql);
        while (rs.next()) {
            Fruitltem fruitltem=new Fruitltem();
            fruitltem.setNumber(rs.getString("number"));
            fruitltem.setName(rs.getString("name"));
            fruitltem.setPrice(String.valueOf(rs.getDouble("price")));
            fruitltem.setUnit(rs.getString("unit"));
            list.add(fruitltem);
        }
    }catch (Exception e){
       e.printStackTrace();
       }
       finally {
           JDBCUtils.release(rs,stmt,conn);
       }
       return list;
    }
}
