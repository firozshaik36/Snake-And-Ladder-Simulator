public class SnakeAndLadder {

    public static void main(String [] args){

        int startPosition = 0;
        int dieRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
        System.out.println("Starting Position is :" + startPosition);
        System.out.println("Dice Roll Number :" + dieRoll);
    }

}
