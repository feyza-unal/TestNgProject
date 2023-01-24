package techproed.tests;

import org.testng.annotations.*;

public class C19_TestNGAnnotations {
    /*
@Test : Test case ousturmak icin kullanilir
@Before ve @After : 5 Before 5 After anotations var
        suite > tests > grup > class > method
@BeforeSuite : her bir test suite den once 1 sefer calisir
@AfterSuite : her bir test suite den sonra 1 sefer calisir
@BeforeTest : her bir testden once(TEST CASE ILE KARISTIRILMAMALI) 1 sefer calisir
@AfterTest : her bir testden sonra(TEST CASE ILE KARISTIRILMAMALI) 1 sefer calisir
@BeforeClass: her bir classdan once 1 sefer calisir
@AfterClass: her bir classdan sonra 1 sefer calisir
@BeforeMethod: her bir @Test annotationdan once tek sefer calisir. JUnitdeki karsiligi @Before
@AfterMethod: her bir @Test annotationdan sonra tek sefer calisir. JUnitdeki karsiligi @After

@Test@Ignore : @Test caseleri atlamak(skip) icin kullanilir (daha zayif kullanim)
@Test(enabled = false) : caseleri kullanima kapatmak icin kullanilir (daha guclu kullanim) (true->default)

TestNG de test caseler natural order(isim sirasi) olarak calisir
priority : test caselere oncelik vermek icin kullanilir (0->default)
NOT:
-------------------------------------------------------------------------------------------
 */
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before Groups");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }


    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 7");
    }
    @Test @Ignore
    public void test2(){
        System.out.println("Test 2");
    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("Test 3");
    }
    @Test(priority = 4)
    public void test4(){
        System.out.println("Test 4");
    }
    @Test(priority = 2)
    public void test5(){
        System.out.println("Test 5");
    }
    @Test(priority = -5)
    public void test6(){
        System.out.println("Test 6");
    }
}
