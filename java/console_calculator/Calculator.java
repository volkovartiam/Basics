

public class Calculator {
    
    int a;
    int b;
    String operator;
    float result;

    private void setA(int a) {
        this.a = a;
        System.out.println("a = " + a);
    }

    private void setB(int b) {
        this.b = b;
        System.out.println("b = " + b);
    }

    public float getResult() {
        return this.result;
    }


    public boolean likeStringSetA(String string){
        boolean isNumber = false;
        try {
            int a = Integer.parseInt(string);
            isNumber = true;
            setA(a);
        } catch (NumberFormatException  e) {
            System.out.println("Не удалось преобразоваь в строку");
        }
        return isNumber;
    }


    public boolean likeStringSetB(String string){
        boolean isNumber = false;
        try {
            int b = Integer.parseInt(string);
            isNumber = true;
            setB(b);
        } catch (NumberFormatException  e) {
            System.out.println("Не удалось преобразоваь в строку");
        }
        return isNumber;
    }



    public boolean setOperator(String string){
        boolean isValidOperator = true;

        switch(string){
            case ("+"): 
                operator = string;
                break;

            case ("-"): 
                operator = string;
                break;

            case ("*"): 
                operator = string;
                break;

            case ("/"):
                operator = string;
                break;

            default:
                isValidOperator = false;
                break;

        }
        return isValidOperator;
    }



    public boolean calculate( ){
        boolean isValidOperator = true;
        switch(operator){
            case ("+"): 
                result = a + b;
                break;

            case ("-"): 
                result = a - b;
                break;

            case ("*"): 
                result = a * b;
                break;

            case ("/"): 
                isValidOperator = div();
                break;

            default:
                System.out.println("Ошибка при выполнении операции");
                isValidOperator = false;
                break;

        }
        return isValidOperator;
    }


    private boolean div(){
        boolean isValid = false;
        if(b !=0 ){
            result = a/b;
            isValid = true;
        } else {
            System.out.println("Деление на ноль невозможно");
            result = 0;
        }
        return isValid;
    }


}
