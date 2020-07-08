package test.phonebill;

import phonebill.DataBundle;
import phonebill.PhoneBill;
import phonebill.PhoneCall;
import org.junit.Test;
import phonebill.SmsBundle;

import static org.junit.Assert.assertEquals;

public class PhoneBillTest {

    @Test
        public void numberOfCallsWhereDeducted() {
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall phoneCall = new PhoneCall(0.34);


        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);

        assertEquals(2.04, phoneBill.totalCost(), 0.00);
    }

        @Test
        public void numberSmsBundlesWhereDeducted() {
        PhoneBill phoneBill = new PhoneBill();
        SmsBundle smsBundle = new SmsBundle(1.34, 1.40);


        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);

        assertEquals(11.25, phoneBill.totalCost(), 0.01);
    }
    @Test
    public void number1000MegabytesWhereDeducted() {
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(1230);


        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);


        assertEquals(5412, phoneBill.totalCost(), 0);
    }
    @Test
    public void numberCallsAndSmsBundlesWhereDeducted() {
        PhoneBill phoneBill = new PhoneBill();
        SmsBundle smsBundle = new SmsBundle(0.34, 1.40);
        PhoneCall phoneCall = new PhoneCall(0.14);

        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);

        assertEquals(1.848, phoneBill.totalCost(), 0.001);
    }
    @Test
    public void numberCallsAndSmsBundlesAndDATAWhereDeduct() {
        PhoneBill phoneBill = new PhoneBill();
        SmsBundle smsBundle = new SmsBundle(0.34, 1.40);
        PhoneCall phoneCall = new PhoneCall(0.14);
        DataBundle dataBundle = new DataBundle(500);

        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(smsBundle);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(phoneCall);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);
        phoneBill.acceptBillCost(dataBundle);

        assertEquals(2501.848, phoneBill.totalCost(), 0.001);
    }


    public static class PhoneCallTest {
        @Test
        public void numberOfCallsWhereDeducted() {
            PhoneBill phoneBill = new PhoneBill();
            PhoneCall phoneCall = new PhoneCall(0.34);


            phoneBill.acceptBillCost(phoneCall);
            phoneBill.acceptBillCost(phoneCall);
            phoneBill.acceptBillCost(phoneCall);
            phoneBill.acceptBillCost(phoneCall);
            phoneBill.acceptBillCost(phoneCall);
            phoneBill.acceptBillCost(phoneCall);

            assertEquals(2.04, phoneBill.totalCost(), 0.00);
        }
    }
}
