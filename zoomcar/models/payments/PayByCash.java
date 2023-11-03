package zoomcar.models.payments;

public class PayByCash implements Payment{

    @Override
    public boolean payBill() {
        System.out.println("Bill Paid By Cash");
        return true;
    }
    
}
