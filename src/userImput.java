import java.util.Scanner;

public class userImput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers;
        int sum = 0;
        int counter = 0;

        System.out.println("Enter 10 numbers");

        while (true) {
            boolean hasnextInt = scanner.hasNextInt();

            if (hasnextInt) {
                int number = scanner.nextInt();

                sum += number;
                counter++;


                if (counter == 10) {
                    System.out.println(sum);
                    break;
                }

            } else {
                System.out.println("Invalid Integer");
                break;
            }
            scanner.nextLine();

        }
        scanner.close();


    }



}
