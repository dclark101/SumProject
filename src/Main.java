import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();

        Sum sum = new Sum(listOfNumbers);

        boolean isRunning = true;

        while(isRunning) {
            System.out.print("Add a number or type Q to quit: ");

            try {
                String userInput = scanner.next().toUpperCase().trim();

                if (userInput.equals("Q")) {
                    break;
                }

                int userInputToInteger = Integer.valueOf(userInput);
                listOfNumbers.add(userInputToInteger);

            } catch(InputMismatchException e) {
                System.out.println("Illegal data type; data type must conform to type int.");
            } catch(NumberFormatException e) {
                System.out.println("Not able to convert String type to Integer type.");
            }
        }

        sum.sumAllNumbers();

        System.out.println("-".repeat(20));
        System.out.println("Total: " + sum.getTotal());

        scanner.close();
    }
}