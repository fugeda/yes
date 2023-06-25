package Service;

import bean.Fruitltem;
import dao.AdminDao;

import java.util.ArrayList;

public class AdminService {
    private static AdminDao adminDao=new AdminDao();
    public static ArrayList<Fruitltem> queryFruitItem(){
        ArrayList<Fruitltem> data=adminDao.queryALLData();
        return data;
    }
}
