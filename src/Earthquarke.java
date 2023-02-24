import java.lang.reflect.Field;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Earthquarke {

    private static final int MAGIC_NUMBER = -97;


    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int quake;

        do {
            quake = scanner.nextInt();
            if(quake >= 3) {
                queue.add(quake);
            }

        } while (quake != MAGIC_NUMBER);

        if (queue.size() >= 5 ) {
            System.out.println("Все очень плохо");
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        }


    }
}
