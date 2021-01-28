package day05.main;


public class Strings {

	public static void main(String[] args) {
		String [] answer = {"sun", "bad", "car"};
		int n = 0;
		String temp;
			
		for(int i=0; i<answer.length; i++) {
			for(int j=i+1; j<answer.length; j++) {
				if((answer[i].charAt(n)) > (answer[j].charAt(n))) {
					temp = answer[j];
					answer[j] = answer[i];
					answer[i] = temp;
				}else if((answer[i].charAt(n)) == (answer[j].charAt(n))) {
					if(answer[i].compareTo(answer[j]) > 0) {
						temp = answer[j];
						answer[j] = answer[i];
						answer[i] = temp;
					}
				}
			}
		}
		for(String strings : answer){
			System.out.print(strings+" ");
		}
	}

}
