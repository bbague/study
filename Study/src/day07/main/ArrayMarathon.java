package day07.main;

import java.util.ArrayList;

public class ArrayMarathon {
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"kiki", "eden"};
		
		ArrayList<String> participantArray = new ArrayList<String>();
		ArrayList<String> completionArray = new ArrayList<String>();
		String answer = null;
		
		for(String x : participant) {
			participantArray.add(x);
		}
		for(String y : completion) {
			completionArray.add(y);
		}
	
		while(completionArray.size() != 0) {
			for(int i=0; i<participantArray.size(); i++) {
				if(participantArray.get(i).equals(completionArray.get(0))) {
					completionArray.remove(0);
					participantArray.remove(i);
					break;
				}
			}
		}
		answer = participantArray.get(0);
		System.out.println(answer);
	}
}

