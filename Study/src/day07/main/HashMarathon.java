package day07.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMarathon {

	public static void main(String[] args) {
		String answer = null;
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"leo", "kiki", };
		
		HashMap<String, Integer> hsparticipant= new HashMap<String, Integer>();
		HashMap<String, Integer> hscompletion= new HashMap<String, Integer>();
		
		for(String parname : participant) {
			hsparticipant.put(parname, hsparticipant.getOrDefault(parname, 0)+1);
		}
		for(String comname : completion) {
			hscompletion.put(comname, hscompletion.getOrDefault(comname, 0)-1);
		}
		
		Set <String> a = hscompletion.keySet();
		Iterator<String> itCom = a.iterator();
		Set <String> c = hsparticipant.keySet();
		Iterator<String> itPart = c.iterator();
		
		while(itCom.hasNext()) {
			String s = itCom.next();
			hsparticipant.put(s, hsparticipant.get(s)+hscompletion.get(s));
		}
		
		while(itPart.hasNext()) {
			String b = itPart.next();
			if(hsparticipant.get(b) != 0) {
				answer = b;
			}
		}
		System.out.println(answer);
	}

}
