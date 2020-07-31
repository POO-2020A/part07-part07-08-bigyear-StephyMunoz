
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Birds> birds = new ArrayList<>();
        String birdName, latinName;
        while (true) {
            System.out.print("? ");
            String answer = scan.nextLine();
            if (answer.equals("Quit")) {
                break;
            } else if (answer.equals("Add")) {
                System.out.print("Name: ");
                birdName = scan.nextLine();
                System.out.print("Name in latin: ");
                latinName = scan.nextLine();
                birds.add(new Birds(birdName, latinName));
            } else if (answer.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                for (Birds bird1 : birds) {
                    bird1.observation(bird);
                }
            } else if (answer.endsWith("All")) {
                for (Birds bird : birds) {
                    System.out.println(bird.toString());
                }
            } else if (answer.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                for (Birds bird1 : birds) {
                    if (bird.equals(bird1.getBirdName())) {
                        System.out.println(bird1.toString());
                    }

                }
            }

        }

    }
}
