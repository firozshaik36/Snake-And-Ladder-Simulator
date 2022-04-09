public class SnakeAndLadder {


    public static int rollDice() {

        int dicevalue = (int) Math.floor(Math.random() * 10) % 6 + 1;
        return dicevalue;
    }


    public static int checkOption() {
        return (int) Math.floor(Math.random() * 10) % 3 + 1;
    }

    public static void main(String[] args) {
        System.out.println("Welcome in Snake And Ladder Simulator Program");


        int Player1Position = 0;
        int Player2Position = 0;
        int PlayGame1 = 0;
        int PlayGame2 = 0;

        while (Player1Position < 100) {
            System.out.println();
            System.out.println("=====PLayerOne turn=======");

            int random = rollDice();
            PlayGame1++;
            int option = checkOption();


            switch (option) {
                case 1:
                    System.out.print("Player1 not play");
                    break;
                case 2:

                    Player1Position += random;
                    System.out.print("You got the Ladder" + Player1Position);


                    if (Player1Position > 100) {
                        Player1Position -= random;
                    }
                    break;
                case 3:
                    System.out.println("Oops! you got the Snake");

                    if (Player1Position - random < 0) {
                        Player1Position = 0;
                    } else {
                        Player1Position -= random;
                    }
                    break;
                default:
                    System.out.println("Something Wrong");
            }

            System.out.println("\nPlayer1 position is:" + Player1Position);
            System.out.println();

            System.out.println("=====PlayerTwo turn=====");
            random = rollDice();
            PlayGame2++;
            option = checkOption();

            switch (option) {
                case 1:
                    System.out.print("Player2 not play");
                    break;
                case 2:
                    Player2Position += random;
                    System.out.print("You got the Ladder" + Player2Position);

                    if (Player2Position > 100) {
                        Player2Position -= random;
                    }
                    break;
                case 3:
                    Player2Position -= random;
                    System.out.print("Oops! you got the Snake" + Player2Position);

                    if (Player2Position < 0) {
                        Player2Position = 0;
                    } else {
                        Player2Position -= random;
                    }
                    break;
                default:
                    System.out.println("Something Wrong");
            }
            System.out.println("\nPlayer2 position is:" + Player2Position);


            if (Player1Position == 100 || Player2Position == 100) {
                if (Player1Position == 100) {
                    System.out.println();
                    System.out.println("Congratulation Player1 is won");
                    System.out.println("Number of time the Dice was Played by Player1:" + PlayGame1);
                } else {
                    System.out.println();
                    System.out.println("Congratulation Player2 is won");
                    System.out.println("Number of time the Dice was Played by Player2:" + PlayGame2 + "times");

                }
                break;
            }
        }
    }
}