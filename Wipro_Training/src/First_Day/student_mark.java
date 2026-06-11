package First_Day;

public class student_mark {

    public static void main(String[] args) {

        float per = -89f;

        if (per >= 75) {
            System.out.println("Distinction");
        } 
        else if (per >= 60 && per < 75) {
            System.out.println("First Class");
        } 
        else if (per >= 50 && per < 60) {
            System.out.println("Second Class");
        } 
        else if (per >= 40 && per < 50) {
            System.out.println("Pass Class");
        } 
        else {
            System.out.println("Fail");
        }
    }
}