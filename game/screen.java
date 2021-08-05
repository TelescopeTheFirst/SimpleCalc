
import java.util.Scanner;

public class screen extends operator{

        public static void main(String[] args) {

        operator op = new operator();
        welcome welcome = new welcome();

        while(true) {
                welcome.greet();
                op.randomCode();
        }

        }
}
