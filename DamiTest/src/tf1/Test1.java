package tf1;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(enabled = true)
	public void TestNGSimpleTest() {
		System.out.println("Hello,world!");
	}
	
	@Test(expectedExceptions = Exception.class)
	public void ExceptionTest() {
		int a = 1/0;
	}
	
	@Test(dependsOnMethods = { "dependSon" })
	public void dependFather(){
		System.out.println("dependfather");
	}
	
	@Test
	public void dependSon(){
		System.out.println("dependson");
	}
	
	@Test
	@Parameters("myName")
	public void paraTest(String myName) {
		System.out.println("Parameterized value is : " + myName);
	}
	
    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] { { 2, true }, { 6, false }, { 19, true },
        	{ 22, false }, { 23, true } };
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test(dataProvider = "test1")
    public void dataProviderTest(Integer inputNumber, Boolean expectedResult) {
    	System.out.println(inputNumber + " " + expectedResult);
    }
}
