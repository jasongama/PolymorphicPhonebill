package phonebill;

public class Main {
    public static void main(String[] args) {
        PhoneBill phoneBills = new PhoneBill();
        SmsBundle smsBundle = new SmsBundle(1.30,1.50);
        DataBundle dataBundle = new DataBundle(1245);
        PhoneCall phoneCall = new PhoneCall(0.46);


        phoneBills.acceptBillCost(smsBundle);
        phoneBills.acceptBillCost(dataBundle);
        phoneBills.acceptBillCost(phoneCall);

        System.out.println("Total cost: " + phoneBills.totalCost());

        System.out.println("=======================================");

        PhoneBill phoneBill1 = new PhoneBill();
        SmsBundle smsBundle1 = new SmsBundle(1.30,1.50);

        phoneBill1.acceptBillCost(smsBundle1);
        phoneBill1.acceptBillCost(smsBundle1);
        phoneBill1.acceptBillCost(smsBundle1);
        phoneBill1.acceptBillCost(smsBundle1);

        System.out.println("SmsBundles available:  " + phoneBill1.totalCost());

        System.out.println("=======================================");
        PhoneBill phoneBill2 = new PhoneBill();
        DataBundle dataBundle1 = new DataBundle(5000);
        phoneBill2.acceptBillCost(dataBundle1);
        phoneBill2.acceptBillCost(dataBundle1);
        phoneBill2.acceptBillCost(dataBundle1);
        phoneBill2.acceptBillCost(dataBundle1);
        phoneBill2.acceptBillCost(dataBundle1);

        System.out.println("Data Bundles available: " + phoneBill2.totalCost());
        System.out.println("=======================================");
        PhoneBill phoneBill3 = new PhoneBill();
        PhoneCall phoneCall1 = new PhoneCall(0.46);
        phoneBill3.acceptBillCost(phoneCall1);
        phoneBill3.acceptBillCost(phoneCall1);
        phoneBill3.acceptBillCost(phoneCall1);
        phoneBill3.acceptBillCost(phoneCall1);
        phoneBill3.acceptBillCost(phoneCall1);
        phoneBill3.acceptBillCost(phoneCall1);
        phoneBill3.acceptBillCost(phoneCall1);

        System.out.println("AirTime available: R " + phoneBill3.totalCost());
    }


}
