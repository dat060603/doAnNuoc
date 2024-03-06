package MainRunCode;

import View.Login.Login;
import View.MainNhanVienView;

public class Main {
    private MainNhanVienView MF = new MainNhanVienView();
    public void MainFormLoadding() {
        MF.setTitle("Demo");
        MF.setLocationRelativeTo(null);
        MF.setVisible(true);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
}
