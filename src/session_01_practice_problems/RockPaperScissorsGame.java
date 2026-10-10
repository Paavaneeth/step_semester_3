import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rounds = 5;
        int wins = 0, losses = 0, draws = 0;
        String[][] history = new String[rounds][3];

        System.out.println("--- Rock-Paper-Scissors Arcade Simulator ---");
        for (int i = 0; i < rounds; i++) {
            System.out.print("Round " + (i + 1) + " - Enter your move (Rock, Paper, Scissors): ");
            String playerMove = scanner.nextLine().trim();

            String computerMove = moves[random.nextInt(moves.length)];
            String result = playRound(playerMove, computerMove);

            history[i][0] = playerMove;
            history[i][1] = computerMove;
            history[i][2] = result;

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;

            System.out.println("Computer chose: " + computerMove + " | Result: " + result + "\n");
        }

        System.out.println("\nFinal Summary (after " + rounds + " rounds)");
        System.out.println("Round | Player Move | Computer Move | Result");
        for (int i = 0; i < rounds; i++) {
            System.out.println((i + 1) + " | " + history[i][0] + " | " + history[i][1] + " | " + history[i][2]);
        }

        double winPercentage = ((double) wins / rounds) * 100.0;
        System.out.println("\nWins: " + wins + " | Losses: " + losses + " | Draws: " + draws + " | Win % = " + winPercentage + "%");
        scanner.close();
    }
}