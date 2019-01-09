package miraclefx.model;

import java.util.Random;

public class RandomGenerator {
	private Random rnd;

	
	public RandomGenerator(){
	 rnd=new Random();
	 makeSeed();
	}
	
	public  int generateRandomIntoRange(int min, int max) {
		
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
        return rnd.nextInt((max - min) + 1) + min;
    }
	
	
	private void makeSeed(){
		long seed=System.currentTimeMillis();
		rnd.setSeed(seed);
     }
}
