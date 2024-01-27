package MainRunCode;

import View.NhanVienView.MainNhanVienView;

public class Main {
    private MainNhanVienView MF = new MainNhanVienView();
    public void MainFormLoadding() {
        MF.setTitle("Demo");
        MF.setLocationRelativeTo(null);
        MF.setVisible(true);
    }
    public static void main(String[] args) {
        new Main().MainFormLoadding();
    }
    
}
