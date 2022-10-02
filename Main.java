
import java.util.Scanner;
class Guesser
{
    int gnum;
    int guessingNum()
    {
        System.out.println("Guesser ,kindly guess a number");
        Scanner scan=new Scanner(System.in);
        gnum=scan.nextInt();
        return gnum;
    }
}
class Player
{
    int pnum;
    int predictingNum()
    {
        System.out.println("Player,Kindly guess a number");
        Scanner scan=new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromGuesser()
    {
        Guesser g= new Guesser();
        numFromGuesser=g.guessingNum();
    }
    void collectNumFromPlayer()
    {
        Player P1= new Player();
        Player P2= new Player();
        Player P3= new Player();
        numFromPlayer1=P1.predictingNum();
        numFromPlayer2=P2.predictingNum();
        numFromPlayer3=P3.predictingNum();
    }
    void compare()
    {
        if(numFromPlayer1==numFromGuesser)
        {
            System.out.println("player1 won the game:)");
            
        }
        else if(numFromPlayer2==numFromGuesser)
        {
            System.out.println("player2 won the game:)");
            
        }
        else if(numFromPlayer3==numFromGuesser)
        {
            System.out.println("player3 won the game:)");
            
        }
      else
        {
            System.out.println("Game lost :( Try again!");
            
        }
    }
}
 class Main
{
	public static void main(String[] args) {
		Umpire u= new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
}
