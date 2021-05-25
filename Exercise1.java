/*
Exercise 1

You have been asked to develop a new computer game called, Card Busters!!!
There are two players playing the game. Both players are given seven cards each.

Here are the values of player one’s cards.
10,6,8,9,7,12,7
Here are the values of player two’s cards.
7,6,9,5,2,8,11

There are seven rounds in the game. Each round, the value of the players’ cards for 
that particular round are compared to see who has the highest valued card. The 
player with the highest value card wins the round.

For example, in round 1, player one will play a card with a value of 10. Player two will 
play a card with a value of 7. Player one wins the round.
If both cards have the same value, it is a tie.

At the end of the game (after seven rounds), the program should determine which 
player has won the game overall (won the most rounds) or if the game has ended in a 
tie.
Save the program as Exercise1.java.

*/

public class Exercise1 {
	
	public static void main(String args[]) {
		
		System.out.println("\n************************* Play Card Busters!!! *************************\n");
			
		int[] p1Cards = {10,6,8,9,7,12,7};
		int[] p2Cards = {7,6,9,5,2,8,11};
		int p1Score = 0;
		int p2Score = 0;
		
		for(int i=0; i<7; i++) { // looping 7 times => 7 rounds
		
			System.out.print("\nRound No: " + (i+1) +"- ");
			
			//checking the card-pairs
			if(p1Cards[i]==p2Cards[i]) {
				
				System.out.print("Tie! " + p1Cards[i] + " ties with " + p2Cards[i]);
				
			} else if(p1Cards[i]>p2Cards[i]) {
				
				p1Score++;
				System.out.print("Player 1 wins the round: " + p1Cards[i] + " beats " + p2Cards[i]);
				
			} else {
				
				p2Score++;
				System.out.print("Player 2 wins the round: " + p2Cards[i] + " beats " + p1Cards[i]);
			}
		}
		
		//evaluating the scores
		if(p1Score>p2Score) {
			
			System.out.println("\n\nPlayer One wins!! He won " + p1Score + " rounds beating Player Two who won " + p2Score + " rounds!");
			
		} else if(p1Score<p2Score) {
			
			System.out.println("\n\nPlayer Two wins!! He won " + p2Score + " rounds beating Player One who won " + p1Score + " rounds!");
			
		} else {
			
			System.out.println("It is a tie! Both Players` score is " + p1Score);
		}
		
		System.out.println("\n\nGoodbye!");
		}
}
