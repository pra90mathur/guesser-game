import java.util.Scanner;

class Guesser {
    int guesserNumber;
    Scanner sc = new Scanner(System.in);

    public int guesserNum() {
        System.out.println("Guess a number : ");
        guesserNumber = sc.nextInt();

        return guesserNumber;
    }
}

class Player {
    int playerNumber;
    Scanner sc = new Scanner(System.in);
    public int playerNum() {
        playerNumber = sc.nextInt();
        
        return playerNumber;
    }
}

class Umpire {
    int guesserNum;
    int playerNum1, playerNum2, playerNum3;
    
    // Reading the number of guesser
    public void collectNumFromGuesser() {
        Guesser g = new Guesser();
        guesserNum = g.guesserNum();
    }
    
    // Reading the numbers of players
    public void collectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        
        System.out.println("Player 1 Guess a number : ");
        playerNum1 = p1.playerNum();

        System.out.println("Player 2 Guess a number : ");
        playerNum2 = p2.playerNum();

        System.out.println("Player 3 Guess a number : ");
        playerNum3 = p3.playerNum();
    }

    // Comparing the numbers
    public void compare() {

        if(guesserNum == playerNum1) {
            if(guesserNum == playerNum2 && guesserNum == playerNum3) {
                System.out.println("All the players won the game.");
            }
            else if(guesserNum == playerNum2){
                System.out.println("Player 1 and 2 won the game.");
            }
            else if(guesserNum == playerNum3) {
                System.out.println("Player 1 and 3 won the game.");
            }
            else System.out.println("Player 1 won the game");
        }

        else if(guesserNum == playerNum2){
            if(guesserNum == playerNum3) {
                System.out.println("Player 2 and 3 won the game");
            }
            else System.out.println("Player 2 won the game");
        }

        else if(guesserNum == playerNum3){
            System.out.println("Player 3 won the game");
        }

        else System.out.println("All the players lost the game");
    }

}

public class GuesserGame {
    public static void main(String[] args) {

        System.out.println("-----Game started-----\n");

        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        System.out.println();
        u.compare();

        System.out.println();
        System.out.println("-----Game Over-----");
    }
}
