package day09;

import java.util.ArrayList;

public class arr {

	public static void main(String[] args) {
		int [] n = {1, 1, 3, 3, 0, 1};
		int [] arr = {4,4,4,3,3};
		int [] o = {1,1,1,2,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		
		ArrayList<Integer> narr = new ArrayList<Integer>();
		
		
		for(int x : o) {
			narr.add(x);
		}
		
		int counter= 0;
		while(true) {
			counter=narr.size();
			for(int j=0; j<narr.size()-1; j++){
				if(narr.get(j)==narr.get(j+1)) {
					narr.remove(j+1);
				}
			}
			if(counter==narr.size()) {
				break;
			}
		}
		
		int[] answer = new int[narr.size()];
		
		for(int m=0; m<narr.size(); m++) {
			answer[m] = narr.get(m);
			System.out.println(answer[m]);
			
		}	
	}
}