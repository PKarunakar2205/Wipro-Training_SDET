package secondDay;

public class sumofnaturalnumber {

	public static void main(String[] args) {
		int n = 7, sum = 0;

        while (n > 0) {
            sum += n;
            n--;
        }

        System.out.println("Sum = " + sum);
    }
}