package day07.main;

public class Marathon {
	
	public static void main(String[] args) {
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"kiki","eden"};
		String answer = null;
		
		
		for(int i=0;i<participant.length;i++) {
			for(int j=0;j<completion.length;j++) {
				if(participant[i].equals(completion[j])) {
					participant[i]="0";
				}
			}
		}
		for(int k=0; k<participant.length; k++) {
			if(participant[k].equals("0")) {
				continue;
			}else {
				answer = participant[k];
				System.out.println(answer);
			}
		}
	}
}
