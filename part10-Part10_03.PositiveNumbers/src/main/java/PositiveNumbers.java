
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-7);
        list.add(4);
        list.add(2);
        list.add(6);

        // test your method here
        System.out.println(positive(list));

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> number = numbers.stream()
                .filter(b -> b > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return number;
                
                
    }

}
