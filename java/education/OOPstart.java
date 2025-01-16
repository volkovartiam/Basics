package education;

public class OOPstart {

    int x1;
    
    {
        x1 = 100;
    }    
 
    int x2 = x1 + 1;
 
    OOPstart() {
        x1 = 200;
    }
 
    int x3 = x1 + 2;
 
    {
        x1 = -100;
    }
	
	
	public static void main(String[] args) {

		OOPstart oop = new OOPstart();
		oop.test1();

		OOPstart g = new OOPstart();
        System.out.println("x1=" + g.x1);
        System.out.println("x2=" + g.x2);
        System.out.println("x3=" + g.x3);
        System.out.println("x1=" + g.x1);
	}
	
	
	public void tryChangeParameterValue(int val1) {
	    // Мы можем менять значение val1,
	    // но val1 содержит копию переданного значения.
	    // Все изменения val1 видны только внутри этого метода
	    System.out.println("Inside method 2: " + val1);  // 100
	    val1++;
	    System.out.println("Inside method 2: " + val1);  // 101
	}
	 
	public void test1() {
	    int parameter1 = 100;
	    System.out.println("parameter1 = " + parameter1); // 100
	    tryChangeParameterValue(parameter1);
	    System.out.println("parameter1 = " + parameter1); // 100
	                              // изменения внутри метода происходили
	                              // с копией переменой, а не с нашим
	                              // parameter1.
	}
	
	
	
	

}
