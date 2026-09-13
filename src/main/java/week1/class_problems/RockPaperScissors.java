import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    static String playRound(String player, String computer) {

        if (player.equals(computer))
            return "Draw";

        if ((player.equals("Rock") && computer.equals("Scissors")) ||
            (player.equals("Paper") && computer.equals("Rock")) ||
            (player.equals("Scissors") && computer.equals("Paper")))
            return "Player Wins";

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        System.out.print("Enter your move: ");
        String player = sc.next();

        String computer = moves[r.nextInt(3)];

        System.out.println("Computer: " + computer);
        System.out.println("Result: " + playRound(player, computer));

        sc.close();
    }
}