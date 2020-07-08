package phonebill;

public class SmsBundle implements BillAction {
    private double  total = 0;

    public SmsBundle(double qty, double sms){
        total = qty * sms;
    }

    @Override
    public double totalCost() {
        return total;
    }

}
