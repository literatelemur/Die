public class DieClient {

	public static void main(String[] args) {
		Die die1 = new Die(20);
		
		while(true){
			int result = die1.roll();
			System.out.println(result);
			if(result == 20)
				break;
			
		}
		System.out.println("It took " + die1.getRolls() + " rolls to obtain a 20");
	}

}
