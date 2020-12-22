
import java.util.Scanner;
import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextInt();
        ArrayList<Integer> permutations = new ArrayList<>();
        int odds = 1, evens = 2;
        while (evens <= n) {
            permutations.add(evens);
            evens += 2;
        }
        while (odds <= n) {
            permutations.add(odds);
            odds += 2;
        }
        if (n <= 3 && n != 1) {
            System.out.print("NO SOLUTION");
        } else if (n == 1) {
            System.out.print(1);
        } else {
            for (int i = 0; i < permutations.size(); i++) {
                System.out.print(permutations.get(i));
            }

        }
    }
}
