import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String _continue;
        do
        {

            System.out.print("Continue? ");
            _continue = sc.nextLine();
        }
        while(_continue.equals("yes"));
    }
}
