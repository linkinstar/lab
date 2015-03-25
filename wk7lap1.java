package test;
import java.util.Random;
import java.util.Scanner;
public class test {
public static void main(String [] args)
{
	Random rand = new Random();
	Scanner input=new Scanner(System.in);
	String choice;
	int playerturn =0;
	int turn=1;
	System.out.println("Welcome to rock-paper-scissor game!!");
	// 1=rock,2=Paper,3=Scissor
	while(turn !=0)
	{
		int computerturn = rand.nextInt(3);
		System.out.println("Enter your choice (Rock,Paper,Scissor:)");
		choice = input.next();
		switch ( choice.toLowerCase())
		{
		case "rock":
		playerturn =1;
		break;
		case "paper":
			playerturn =2;
			break;
		case "scissor":
			playerturn =3;
			break;
		}
		if( computerturn ==1)
			System.out.println("Computer play is : rock");
		else if(computerturn ==2)
			System.out.println("Computer play is : Paper");
		else System.out.println("Computer play is : Scissor");
		if(computerturn ==playerturn)
			System.out.println("Your tie");
			else if((computerturn ==1)&&(playerturn==3))
				System.out.println("You Lose");
			else if((computerturn ==2)&&(playerturn ==1))
				System.out.println("You Lose");
			else if ((computerturn ==3)&&(playerturn ==2))
				System.out.println("You Lose");
			else System.out.println("You Win");	
		
		System.out.println("Do you want to play again(1-Yes,0-No):");
		turn= input.nextInt();
		
	}}
}


