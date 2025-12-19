    import java.util.Scanner;
    public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean letsContinue = true;

        System.out.println("Simple Calculator");

        while (letsContinue){
            System.out.println("Enter first integer: ");
            int x = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter operation: (+,-,*,/)");
            char operation = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Enter second intger: ");
            int y = sc.nextInt();
            sc.nextLine();

            int result = 0;
            boolean validOperation = true;

            SimpleCalculator calculator = new SimpleCalculator();

            if (operation == '+'){
                result = calculator.add(x,y);
               
            } else if (operation == '-'){
                result = calculator.subtract(x,y);
                
            } else if (operation == '*'){
                result = calculator.multiply(x,y);
            } else if (operation == '/'){
                if (y == 0){
                    System.out.println("Error: Cannot divide by 0");
                    validOperation = false;
                } else {
                    result = calculator.divide(x, y);
                    
                } 
            } else {
                System.out.println("Error: Invalid Operation");
                validOperation = false;
            }

            if(validOperation){
                System.out.println("Result: " + result);
            }

            System.out.println("Perform another operation? (Yes or No)");
            String choice = sc.next();

            if(!choice.equalsIgnoreCase("yes")){
                letsContinue = false;
            }
        }
        System.out.println("Calculator closed.");
        sc.close();
        
    }

    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x*y;
        
    }

    public int divide(int x, int y){
        return x/y;
    }
    }
