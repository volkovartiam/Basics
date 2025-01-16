package education;

public class LogicOperations {

	public static void main(String[] args) {
		
		int i = 0;
		System.out.println("Операция с постфиксной записью " +  i++);
		System.out.println("После операции " + i);
		i = 0;
		System.out.println("\n" + "Операция с префиксной записью " +  ++i);
		System.out.println("После операции " + i);
		
		
		// Остаток от деления
		System.out.print("\n" + "Вычисление остатка 10 % 3 = " );
		System.out.println( 10 % 3 );


		// Логические операции
		System.out.print("\n" + "Вычисление сдвига влево 5 << 2 = ");
		System.out.print( 5 << 2);

		System.out.print("\n" + "Вычисление сдвига вправо 5 >> 2 = ");
		System.out.print( 5 >> 2);
		
		System.out.print("\n" + "Вычисление логического или 30 | 2 = ");
		System.out.print( 30 | 2);
		
		System.out.print("\n" + "Вычисление логического исключающего или 30 ^ 2 = ");
		System.out.print( 30 ^ 2 );
		
		System.out.print("\n" + "Вычисление логического и 30 & 2 = ");
		System.out.print( 30 & 2 );
		
		System.out.print("\n" + "Вычисление логического не ~2 = ");
		System.out.println( ~2 );
		
		//Пример тернарной оперции 
		int x = 20, y = 10;
		System.out.println();
		System.out.println("Пример тернарной операции для x = 20, y = 10 ");
		String result = x > y ? "x is greater than y" : "x is less than or equal to y";
		System.out.println(result);
		//Без тернарной операции
		if(x > y) {
			result = "x is greater than y"; 
		} else {
			result = "x is less than or equal to y"; 
		}
		System.out.println(result);
		
	}

}
