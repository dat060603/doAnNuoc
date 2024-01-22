package demo_doantd;

import View.MainForm;

public class Main {
    private MainForm MF = new MainForm();
    public void MainFormLoadding() {
        MF.setTitle("Demo");
        MF.setLocationRelativeTo(null);
        MF.setVisible(true);
    }
    public static void main(String[] args) {
        new Main().MainFormLoadding();
    }
    
}
