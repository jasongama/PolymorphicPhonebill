package phonebill;

public class PhoneCall extends PhoneBill {
    private  double total = 0;
    public PhoneCall(double phoneCall) {
        total += phoneCall;

    }

    @Override
    public double totalCost() {

        return total;
    }
}
