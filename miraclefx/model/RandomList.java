package miraclefx.model;

import java.util.ArrayList;
import java.util.List;

public class RandomList {
	private List<Integer> list;
	private RandomGenerator rand;
	
	public RandomList(){
		list = new ArrayList<Integer>();
		rand= new RandomGenerator();
	}
	
	public List<Integer> getList(){
		return list;
	}
	
	public void clear(){
		list.clear();
	}
	
	public List<Integer> createListSequence(int col,int min,int max){
		
		while(list.size()<col){
		  int nRnd;
		  nRnd= rand.generateRandomIntoRange( min,max);
		    if(!list.contains(nRnd)){
		      list.add(nRnd);
			}	
		}
		return list;
	}
}
