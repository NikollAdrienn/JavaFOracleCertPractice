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