package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_SoftAssertion {
/*
SoftAssertion baslangic ve bitis satirlari arasindaki tum assertion'lari yapip bitis satirina geldiginde
bize buldugu tum hatalari rapor eder. (baslangic ve bitis belirtilmeli)
Ilk olarak SoftAssert obj olusturulur
 */
    @Test
    public void softAssertTest(){

//        1. SoftAssert objesi olustur
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Satir 14");
        softAssert.assertEquals(2,5);//FAIL
        System.out.println("Satir 16");
        softAssert.assertTrue("JAVA".contains("U"));//FAIL
        System.out.println("Satir 18");
        softAssert.assertTrue(true);//PASS
        System.out.println("Satir 20");

// Softassert ile mesaj yazabiliriz
//        softAssert.assertTrue("JAVA".contains("U"),"string u harfi icermiyor");

        softAssert.assertAll(); //bitis satiri
        //KULLANMAMIZ SART. Yazilmazsa calismaz. PASS yada FAIL olarak assertionlari isaretler
        //fail alirsa  assertAll() dan sonraki kisimlar calismaz
    }

}
