public class Die {
	private int sides, rolls;

	public int getSides() {
		return sides;
	}


	public int getRolls() {
		return rolls;
	}
	
	public Die(int sides) {
		this.sides = sides;
		rolls = 0;
	}
	
	public int roll() {
		rolls++;
		return (int)(Math.random()*(sides)+1);
	}
	
}
