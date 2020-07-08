package phonebill;

public class DataBundle extends PhoneBill {
    private double total = 0;

    public DataBundle(double megabyte) {
        if (megabyte < 500) {
            total = 0.75 * megabyte;
        } else if (megabyte > 500) {
            total = 0.55 * megabyte;
        } else if (megabyte > 1000) {

            total = 0.35 * megabyte;
        } else {
            total = megabyte;
        }

    }

    @Override
    public double totalCost() {

        return total;
    }
}
