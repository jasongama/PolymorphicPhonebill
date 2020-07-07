package phonebill;

public class PhoneBill implements BillAction {
    private double total = 0;

    public void acceptBillCost(BillAction billAction) {

        total += billAction.totalCost();
    }

    @Override
    public double totalCost() {

        return total;
    }

}
