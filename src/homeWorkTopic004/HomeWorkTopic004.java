package homeWorkTopic004;
import java.util.Scanner;

public class HomeWorkTopic004 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number from 0 to 9: ");

        int number = scanner.nextInt();

        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("TThree");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
            	System.out.println("seven");
            	break;
            case 8:
            	System.out.println("eigth");
            	break;
            case 9:
            	System.out.println("nine");
            	break;
            default:
                System.out.println("Invalid number!");
                break;
        }
        scanner.close();

	}

}
