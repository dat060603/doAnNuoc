
package Controller.InvoicesController;

import java.math.BigDecimal;


public class InvoiceController {
    public BigDecimal getTotalprice(){
        BigDecimal total=null;
        try {
            total=new InvoiceDAO().Gettotalprice();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
}
