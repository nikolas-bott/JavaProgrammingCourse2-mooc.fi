
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int input = Integer.parseInt(scanner.nextLine());
            
            if(input < 0){
                break;
            }
            list.add(input);
        }
        
        ArrayList<Integer> numbers = list.stream()
                .filter(s -> s > 0 && s < 6)
                .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println(numbers); 

    }
}
