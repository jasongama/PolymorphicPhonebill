package phonebill;

public class PhoneCall implements BillAction {
    private  double total = 0;
    public PhoneCall(double phoneCall) {
        total += phoneCall;

    }

    @Override
    public double totalCost() {

        return total;
    }
}
