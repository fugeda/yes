package test;

import view.AbstractMainFrame;

public class AbstractMainFrameTest extends AbstractMainFrame {
    @Override
    public void showAdminDialog() {
       new AbstractAdminDialogTest().setVisible(true);
    }
}
