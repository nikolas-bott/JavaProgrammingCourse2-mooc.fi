
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String string = scanner.nextLine();
            if(string.equals("end")){
                break;
            }
            list.add(string);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if(input.equals("n")){
            double averageOfNegative = list.stream()
                    .mapToDouble(s -> Double.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of negative numbers: "+averageOfNegative);
        }
        
        if(input.equals("p")){
            double averageOfPositiv = list.stream()
                    .mapToDouble(s -> Double.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of positive numbers: "+averageOfPositiv);
        }
    }
}
