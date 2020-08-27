package blazetest.com;

import java.io.IOException;

import org.testng.annotations.Test;

import com.baseblaze.TestBase;
import com.blazepages.ProductStore;

public class Blazetest extends TestBase{
	
	ProductStore pc;
	
  public Blazetest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@Test
  public void productstorecategories() throws IOException, InterruptedException {
	
	
	    pc =  new ProductStore();
	    pc.product();
	    System.out.println("Elements clicked");
		
	    
	   
	    
	    
	
	
  }
}
