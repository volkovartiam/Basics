package education;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwitchOperator {
	
	public static void main(String[] args) {
		
		
		int month = 13;
		String monthString;
		switch (month) {
		    case 1:  monthString = "Январь";
					 System.out.println(monthString);
		             //break;
		    case 2:  monthString = "Февраль";
		             break;
		    case 3:  monthString = "Март";
		             break;
		    case 4:  monthString = "Апрель";
		             break;
		    case 5:  monthString = "Май";
		             break;
		    case 6:  monthString = "Июнь";
		             break;
		    case 7:  monthString = "Июль";
		             break;
		    case 8:  monthString = "Август";
		             break;
		    case 9:  monthString = "Сентябрь";
		             break;
		    case 10: monthString = "Октябрь";
		             break;
		    case 11: monthString = "Ноябрь";
		             break;
		    case 12: monthString = "Декабрь";
		             break;
		    default: monthString = "Не знаем такого";
		             break;
		}
		System.out.println("После оператора switch monthString = "  + monthString );
		

		System.out.print("\n" +"Foreach with array: "  );
		int[] array = {0, 1, 2, 3, 4, 5} ;
        for (int num : array) {
            System.out.print(num + " ");
        }
		
		System.out.print("\n" +"Foreach with arraylist: "  );
		List<Integer> list = new ArrayList<>() ;
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(0);
		
        for (int num : list) {
            System.out.print(num + " ");
        }
        
        
		System.out.print("\n" +"Пример оператора break: "  );
	    for (int i = 0; i < 10; i++) {
	      if (i == 4) {
	        break;
	      }
	      System.out.print(i + " ");
	    }  

	    
		System.out.print("\n" +"Пример оператора continue: "  );
	    for (int i = 0; i < 10; i++) {
	      if (i == 4) {
	    	  System.out.print("<> ");
	    	  continue;
	      }
	      System.out.print(i + " ");
	    }  
	    
	    /**/
		System.out.print("\n" + "\n" + "Еще пример оператора continue: "  );
        for (int i = 1; i <= 7; i++){
            System.out.println(i + ": я выполянюсь перед continue!");
            if (i > 2)
                continue;
            System.out.println("     "+ i + ": я выполянюсь всего два раза ;(");
        }
	    /**/
	    
        /**/
		System.out.print("\n");
     // метка для внешнего цикла.
        outer_for:
        for (int n = 0; n < 3; n++) {
            //...
            // метка для внутреннего цикла
        inner_for:
            for (int m = 0; m < 5; m++) {
         
                // прерываем внешний цикл для n == 2 и m ==4
                if ((n == 9) && (m == 4)) break outer_for;   
         
                // прерываем внутренний цикл для n == 7 и m == 2
                if ((n == 7) && (m == 2)) break;
         
                // можно прервать внутренний цикл и по метке.
                if ((n == 9) && (m % 2 == 1)) break inner_for;
         
                System.out.println("n=" + n + "; m=" + m);
            }
        }
        
        /**/
        
        outer_label:
            for (int n = 4; n <= 9; n++) {
                int m = 3;
                while (m <= 5) {
                    // Если остаток от деления n на m равен 0,
                    // то переходим к следующей итерации
                    // цикла outer_label
                    if (n % m == 0) continue outer_label;
                    System.out.println("n=" + n + "; m=" + m);
                    m++;
                }            
            }  
        
        
	}

}
