package education;

import java.util.Arrays;

public class MainFractal {

	public static void main(String[] args) {

		System.out.println("Расчет факториала (метод с while) от 0 до 10");
		for(int i = 0; i <= 10; i++) {
			factorialWhile(i);
		}
		System.out.println();

		System.out.println("Расчет факториала (метод с recursion) от 0 до 10");
		for(int i = 0; i <= 10; i++) {
			int factorial = factorialRecursion(i);
			System.out.println("FactorialRecursion " +  i + " = "  + factorial);
		}
		System.out.println();
		
		
		System.out.println("Пример пузырьковой сортировки [1,7,5,5,4,6]");
		int [] sorted = bubleSort(1,7,5,5,4,6);
		for (int i : sorted) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");
		
		System.out.println("Пример сортировки с помощью Arrays.sort");
		int [] arr = new int[] {1,2,3,1,10,50};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + ", ");
		}

	}

	
	// При значениях больше 12 значения расходятся с тем, что говорит калькулятор
	// Есть также отрицательные значения и нули
	public static long factorialWhile(int n) {
		int result = n;
		int input = n;

		if(n < 0) {
			result = -1;
			System.out.println("Factorial of negative number is possilble?");
		} else if (n == 0) {
			result = 1;
			System.out.print("Factorial " + input + "! = " + result + " ") ;
			System.out.println(" Suddenly and amazing, really.");
		} else if(n > 0) {
			while(n > 1) {
				result = result*(n-1);
				n--;
			}
			System.out.println("Factorial " + input + "! = " + result);
		} 
		return result;
	}
	
	
	
	public static int factorialRecursion(int n) {
		int result = 1;
		if (n == 1  || n == 0) {
			return result;
		}  
		result = n * factorialRecursion(n-1);
//		result = n * factorialRecursion(--n);
		//StackOverflowError - сначала выполняется операция, а затем уменьшения
		//result = n * factorialRecursion(n--);
		return result;
	}


	public static int[] bubleSort(int ...n) {
		int j = n.length - 1;
		while(j > 0) {
			for(int i = 0; i < j; i++) {
				if(n[i+1] > n[i] ) {
					int temp = n[i];
					n[i] = n[i+1];
					n[i+1] = temp;
				}
			}
		j--;
		}
		return n;
	}

	
	
}
