package coin;

public class CountFlips {
	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	// Output:
	// The number flips: 1000
	// The number of heads: 493
	// The number of tails: 507
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Coin coin1 = new Coin();
		final int NUMBER = 1000;
		int count = 0;
		int head = 0;
		int tails = 0;
		for (int i = 0; i < 1000; i++) {
			count++; // Counts number of flips
			  coin1.flip();
			  if(coin1.isHeads()){
				  head++;
			  }else{
				  tails++;
			  }
			
		
				}
			System.out.println("The number of flips: "+ count);
			System.out.println("The number of heads: "+ head);
			System.out.println("The number of tails: "+ tails);
			
		}

	}

