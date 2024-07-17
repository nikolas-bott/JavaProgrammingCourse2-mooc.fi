
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList toDo = new TodoList();
        // Here you can try out the combined functionality of your classes
        UserInterface user = new UserInterface(toDo,scanner);
        
        user.start();

    }
}
