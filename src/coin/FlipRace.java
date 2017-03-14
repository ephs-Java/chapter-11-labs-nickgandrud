package coin;

public class FlipRace {
	// -----------------------------------------------------------------
	// Flips two coins until one of them comes up heads three times in a row.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
	
			// Create two separate coin objects
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
			// Print the flip results (uses Coin's toString method)
		int countofheads = 0;
		
			//stop the flipping once one of the coins gets to heads, 3 times in a row
			while(countofheads != 3){
				coin1.flip();
				coin2.flip();
				System.out.println("Coin 1 : " + coin1.toString());
				System.out.println("Coin 2 : " + coin2.toString());
					if(coin1.isHeads() || coin2.isHeads()){
						countofheads++;
					}
					else{
						countofheads = 0;
					}
			}
		
	
	}
}