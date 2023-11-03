package zoomcar.models.payments;

public class PayByCard implements Payment{

    @Override
    public boolean payBill() {
        System.out.println("Bill Paid");
        return true;
    }
    
}
