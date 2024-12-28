
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        
        // Write your program here
        while(true) {
            String input = scanner.nextLine();
            
            if(input.matches("-?\\d+")) {
                numberList.add(Integer.parseInt(input));
            }
            
            if(input.equals("end")) {
                break;
            }
        }
        
        double average = numberList.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();

        System.out.println("average of numbers: " +average);
    }
}
