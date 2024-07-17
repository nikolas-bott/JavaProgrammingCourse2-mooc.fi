
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        
        UserInterface user = new UserInterface(scanner,list);
        user.start();
            
    }
}
