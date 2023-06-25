package test;

import Service.AdminService;
import bean.Fruitltem;
import view.AbstractAdminDialog;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;


public class AbstractAdminDialogTest extends AbstractAdminDialog {
    private AdminService adminService=new AdminService();
    public  AbstractAdminDialogTest(){
        super();
        queryFruitItem();
    }
    @Override
    public void queryFruitItem() {
        String[]thead=new String[]{"水果编号","水果名称","水果单价(/元)","计价单位"};
//        String[][]tbody=new String[][]{
//                {"1","苹果","5.0","kg"},
//                {"2","葡萄","3.2","斤"},
//                {"3","雪梨","3.8","斤"},
//                {"4","泰国大榴莲","120","个"}
//        };
        ArrayList<Fruitltem>datalist= AdminService.queryFruitItem();
        String[][] tbody=list2Array(datalist);
        TableModel data=new DefaultTableModel(tbody,thead);
        table.setModel(data);
    }
    public String[][] list2Array(ArrayList<Fruitltem>list){
        String [][] tbody =new String[list.size()][4];
        for (int i = 0; i <list.size() ; i++) {
            Fruitltem fruitltem=list.get(i);
            tbody[i][0]=fruitltem.getNumber();
            tbody[i][1]=fruitltem.getName();
            tbody[i][2]=fruitltem.getPrice()+"";
            tbody[i][3]=fruitltem.getUnit();
        }
        return tbody;
    }

    @Override
    public void addFruitItem() {

    }

    @Override
    public void updateFruitItem() {

    }

    @Override
    public void delFruitItem() {

    }

    @Override
    public void queryFruitItemForCon() {

    }
}
