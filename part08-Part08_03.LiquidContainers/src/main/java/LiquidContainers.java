
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        UserInterface user = new UserInterface(scan);
        
        user.start();
    }

}
