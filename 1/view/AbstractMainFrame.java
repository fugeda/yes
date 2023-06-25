package view;

import tools.GUITools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class AbstractMainFrame extends JFrame {
    private  JLabel titleLabel=new JLabel(new ImageIcon("D:\\Java\\fruittest1\\src\\images\\FruitStore.jpg"));
    private JButton btn=new JButton("进入系统");
    public AbstractMainFrame(){
        this.init();//初始化操作
        this.addComponent();//添加组件
        this.addListener();//添加监听器
    }
    public void init()
    {
        this.setTitle("水果超市欢迎您");
        this.setSize(600,400);
        GUITools.center(this);
        GUITools.setTitleImage(this,"D:\\Java\\fruittest1\\src\\images\\title.png");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addComponent(){
        this.add(titleLabel, BorderLayout.NORTH);
        JPanel btnPanel=new JPanel();
        btnPanel.setLayout(null);
        this.add(btnPanel);
        btn.setBounds(240,20,120,50);
        btnPanel.add(btn);
    }
    public void  addListener()
    {
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAdminDialog();
            }
        });
    }
    public abstract void showAdminDialog();
}
