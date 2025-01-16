package education;

import java.util.Arrays;

public interface WorkingWithArrays {

	public static void main(String[] args) {
		
		//Создание массива 
		String array[][] =new String[2][3];
		// Заполняем нулевую строку
		array[0][0] = "1";
		array[0][1] = "2";
		array[0][2] = "3";

		// Заполняем первую строку
		array[1][0] = "Один";
		array[1][1] = "Два";
		array[1][2] = "Три";

		System.out.println("Выводим значения массива:");
		for(int j = 0; j < array[0].length; j++) {
			System.out.print(array[0][j]);
			System.out.print(" ");
		}

		System.out.println();
		for(int j = 0; j < array[1].length; j++) {
			System.out.print(array[1][j]);
			System.out.print(" ");
		}
		System.out.println("\n");
		

		//Eще один пример создания многомерного массива 
		System.out.println("Eще один пример создания многомерного массива");
		String anotherArray[][] = { {"0", "1", "2", "3"}, 
								    {"0", "1", "2" }, 
								    {"One"}  };
		
		for(String str : anotherArray[0]) {
			System.out.print(str);
			System.out.print(" ");
		}
		System.out.println();
		
		for(String str : anotherArray[1]) {
			System.out.print(str);
			System.out.print(" ");
		}
		System.out.println();
		
		for(String str : anotherArray[2]) {
			System.out.print(str);
			System.out.print(" ");
		}
		System.out.println("\n" +"Вывод массива закончен");
		
		anotherArray[2][0] = "123";
		System.out.println("Вывод массива anotherArray[2][0] со значением " + anotherArray[2][0]);
		System.out.println();

		
		//Пример копирования массива
		int intArray[] = { 1, 2, 3, 4, 5 };
		int destArray[] = null;

		System.out.println("Пример копирования массива <clone()> ");
		System.out.print("Массив источник = ");
		for(int i : intArray ) {
			System.out.print( i + " " );
		}
		
		System.out.println();
		System.out.print("Массив получатель = ");
		destArray = intArray.clone();
		for(int i : destArray ) {
			System.out.print( i + " " );
		}

		// Проверка нет ли ссылки в массивах друг на друга
		System.out.println("\n" + "\n" + "Изменяем данные в массиве получателе ");
		intArray[1] = 200 ;
		destArray[0] = 100 ;
		System.out.print("Массив источник = ");
		for(int i : intArray ) {
			System.out.print( i + " " );
		}
		
		System.out.println();
		System.out.print("Массив получатель = ");
		for(int i : destArray ) {
			System.out.print( i + " " );
		}
		System.out.println( "\n" );
		
		
		//Еще один способ копирования массива
		System.out.print("Еще один способ копирования массива <System.arraycopy()> "  + "\n" );
		intArray[1] = 9 ;
		System.arraycopy(intArray, 0, destArray, 0, intArray.length);
		
		System.out.print("Массив источник = ");
		for(int i : intArray ) {
			System.out.print( i + " " );
		}
		
		System.out.print("\n" + "Массив получатель = ");
		for(int i : destArray ) {
			System.out.print( i + " " );
		}
		System.out.println( "\n" );
		
		
		
		//Еще один способ копирования массива
		System.out.print("Еще один способ копирования массива <Arrays.copyOf()> "  + "\n" );
		intArray[0] = 3 ;
		destArray = Arrays.copyOf(intArray, intArray.length);
		
		System.out.print("Массив источник = ");
		for(int i : intArray ) {
			System.out.print( i + " " );
		}
		
		System.out.print("\n" + "Массив получатель = ");
		for(int i : destArray ) {
			System.out.print( i + " " );
		}
		System.out.println( "\n" );
		
	}
	
}
