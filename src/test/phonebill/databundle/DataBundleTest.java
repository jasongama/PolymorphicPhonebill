package test.phonebill.databundle;

import org.junit.Test;
import phonebill.DataBundle;
import phonebill.PhoneBill;

import static org.junit.Assert.assertEquals;

public class DataBundleTest {

     @Test
     public void  numberDataBundlesLowerThan500Megabyte(){
         PhoneBill phoneBill = new PhoneBill();
         DataBundle dataBundle = new DataBundle(200);

         phoneBill.acceptBillCost(dataBundle);

         assertEquals(150, phoneBill.totalCost(), 0);
     }

    @Test
    public void  numberDataBundlesMoreThan500Megabyte(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(600);

        phoneBill.acceptBillCost(dataBundle);

        assertEquals(330, phoneBill.totalCost(), 0);
    }
    @Test
    public void  numberDataBundlesMoreThan1000Megabyte(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(1024);

        phoneBill.acceptBillCost(dataBundle);

        assertEquals(563.2, phoneBill.totalCost(), 0.0);
    }
    @Test
    public void  haveZeroMegabyte(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(0);

        phoneBill.acceptBillCost(dataBundle);

        assertEquals(0.0, phoneBill.totalCost(), 0.0);
    }
    @Test
    public void  have128Megabyte(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(128);

        phoneBill.acceptBillCost(dataBundle);

        assertEquals(96.0, phoneBill.totalCost(), 0.0);
    }
    @Test
    public void  have1Megabyte(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(1);

        phoneBill.acceptBillCost(dataBundle);

        assertEquals(0.75, phoneBill.totalCost(), 0.00);
    }


    @Test
    public void  haveBelowZeroMegabyte(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(-202);

        phoneBill.acceptBillCost(dataBundle);

        assertEquals(-151.5, phoneBill.totalCost(), 0.0);
    }

}
