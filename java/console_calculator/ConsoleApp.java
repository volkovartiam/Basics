import java.util.Scanner;


public class ConsoleApp 
{

    static Calculator calculator = new Calculator();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main( String[] args )
    {
        runCalculator();
        scanner.close();
    }


    private static void runCalculator(){
        boolean runApp = true;
        String inPut = "";
        while(runApp){
        	
            System.out.println("Введите первое число или EXIT");
            inPut = scanner.nextLine();

            //Exit
            if(inPut.equals("EXIT") || inPut.equals("exit")  ){
                runApp = false;
                break;
            }
            
            //Restart or set A
            calculator.likeStringSetA(inPut);
 

            //Restart or set operator
            System.out.println("Введите оператор +-*/");
            inPut = scanner.nextLine();
            calculator.setOperator(inPut);
 

            //Restart or set B
            System.out.println("Введите второе число");
            inPut = scanner.nextLine();
            calculator.likeStringSetB(inPut);
            

            //Get result
            System.out.print(calculator.a + " "+ calculator.operator + " " + calculator.b + " = ");
            calculator.calculate();
            System.out.println(calculator.getResult());

        }
    }
    

}
