package secondDay;

public class operators {

	public static void main(String[] args) {
		 int num1 = 3;
	        int num2 = 9;
	        char operator = '+';  

	        switch (operator) {
	            case '+':
	                System.out.println("Result: " + (num1 + num2));
	                break;

	            case '-':
	                System.out.println("Result: " + (num1 - num2));
	                break;

	            case '*':
	                System.out.println("Result: " + (num1 * num2));
	                break;

	            case '/':
	                System.out.println("Result: " + (num1 / num2));
	                break;

	            default:
	                System.out.println("Invalid operator");
	        }
	    }
	}
