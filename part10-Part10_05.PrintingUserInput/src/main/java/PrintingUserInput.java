
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String scan = scanner.nextLine();
            if(scan.equals("")){
                break;
            }
            list.add(scan);
        }
        
        String combined = list.stream()
                .reduce("",(string1, string2) -> string1 + string2 +" ");
        System.out.println(combined);
                

    }
}
