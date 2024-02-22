import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fTemp = 0.0;
        double converter = 0.0;
        double cTemp = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter you temperature in F: ");

            if (in.hasNextDouble()) {
                fTemp = in.nextDouble();
                in.nextLine();
                converter = (fTemp - 32) * 5/9;
                cTemp = converter;
                done = true;
                System.out.println("Your temperature in C is: " + cTemp);
            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not " + trash);
            }
        } while (!done);


    }
}
