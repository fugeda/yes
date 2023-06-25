package main;

import test.AbstractAdminDialogTest;
import test.AbstractMainFrameTest;

public class MainApp {
    public static void main(String[] args) {
        new AbstractMainFrameTest().setVisible(true);
        new AbstractAdminDialogTest().setVisible(true);
    }
}
