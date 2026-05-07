package First_Day;

public class divisible {

	public static void main(String[] args) {
		int num = 99;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both");
        }
	}

}
