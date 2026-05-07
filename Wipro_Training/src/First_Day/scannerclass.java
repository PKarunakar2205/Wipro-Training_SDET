package First_Day;
import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter day ,First letter capital : ");
        String day = sc.next();   

        if (day == ("Monday") || day == ("Tuesday") || 
            day == ("Wednesday") || day == ("Thursday") || 
            day == ("Friday")) {

            System.out.println("Weekday");
        } 
        else if (day.equals("Saturday") || day.equals("Sunday")) {

            System.out.println("Weekend");
        } 
        else {
            System.out.println("Invalid day format");
        }

        sc.close();
	}

}
