package phonebill;

public class PhoneBill  {
    private double total = 0;

    public void acceptBillCost(BillAction billAction) {

        total += billAction.totalCost();
    }


    public double totalCost() {

        return total;
    }

}
