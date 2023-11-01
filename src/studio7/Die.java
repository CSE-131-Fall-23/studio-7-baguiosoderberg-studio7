package studio7;

import javax.sound.sampled.AudioSystem;

public class Die {
	
	private int sides;
	
	public Die(int n) {
		this.sides = n;
	}
	
	public int roll() {
		return (int)(Math.random()*(this.sides) + 1);
	}
	public static void main(String[] args) {
		Die d = new Die(10);
		for(int i = 0; i < 15; i++) {
			System.out.println(d.roll());
		}

	}

}
