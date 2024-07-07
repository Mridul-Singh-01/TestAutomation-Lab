package MyPack2;
import MyPack1.MyClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TestApp {
  @Test
  public void Test1()
  {
	  assertEquals(MyClass.calculation(1000,6000), 1120); 
  }
  @Test
  public void Test2()
  {
	  assertEquals(MyClass.calculation(1000,4000),1000);
  }
  @Test
  public void Test3()
  {
	  assertEquals(MyClass.calculation(1000,0), 1000);  
  }
  @Test
  public void Test4()
  {
	  assertEquals(MyClass.calculation(1000,10000), 1600); 
  }
  @Test
  public void Test5()
  {
	  assertEquals(MyClass.calculation(1000,5000), 1000);
  }
}