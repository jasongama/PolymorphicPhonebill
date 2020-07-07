package phonebill;

public class DataBundle extends PhoneBill {
    private double total = 0;

    public DataBundle(double megabyte) {
        if (megabyte < 500) {
            total = 0.75 * 500;
        } else if (megabyte > 500) {
            total = 0.55 * 500;
        } else if (megabyte > 1000) {

            total = 0.35 * 1000;
        } else {
            total = 0;
        }

    }

    @Override
    public double totalCost() {

        return total;
    }
}
