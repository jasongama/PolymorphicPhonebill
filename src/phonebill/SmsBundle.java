package phonebill;

public class SmsBundle extends PhoneBill {
    private double  total = 0;

    public SmsBundle(double qty, double sms){
        total = qty * sms;
    }

    @Override
    public double totalCost() {
        return total;
    }

}
