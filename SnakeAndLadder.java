import java.util.Scanner;

public class SnakeAndLadder {

    public static final int Winning_Position = 100;

    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String Player_Name = sc.next();

        while (Winning_Position > startPosition) {

            int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Dice Roll number :" + dieRoll);

            int checkOption = (int) (Math.floor(Math.random() * 10) % 3);

            switch (checkOption) {
                case 0:
                    System.out.println("No Play");
                    startPosition += 0;
                    break;

                case 1:
                    System.out.println("Ladder:" + " + " + dieRoll);
                    startPosition += dieRoll;
                    break;

                default:
                    System.out.println("Snake : " + " - " + dieRoll);
                    startPosition -= dieRoll;

                    if (startPosition < 0) {
                        System.out.println("Start Again");
                        startPosition = 0;
                    }

            }

        }

        System.out.println("Player " + Player_Name + "On Position :" + startPosition);


    }
}