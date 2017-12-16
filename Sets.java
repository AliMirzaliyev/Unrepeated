
import java.util.*;

public interface Sets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<String> sets = new HashSet<String>();
        String a = "b";
        while (!(a.equals("end"))) {

            System.out.println("Enter the characters :(If you wanna to stop enter (end) ");
            a = scan.nextLine();
            if (a.equals("end")) {
                break;
            }
            sets.add(a);
        }

        System.out.println("The list of your string character : \n\n\n");

        System.out.println(sets);

    }

}
