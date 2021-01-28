package day04;

public class year2016 {

	public static void main(String[] args) {
		int a=5;
		int b=25;
		String answer = null;
		
		if(a<13 && b<32) {
//	1월, 4월, 7월			
			while(a==1 || a==4 || a==7) {
				if(b%7 == 1) {
					answer="FRI";
				}else if(b%7 == 2){
					answer="SAT";
				}else if(b%7 == 3){
					answer="SUN";
				}else if(b%7 == 4){
					answer="MON";
				}else if(b%7 == 5){
					answer="TUE";
				}else if(b%7 == 6){
					answer="WED";
				}else{
					answer="THU";
				}
				break;
			}
//	2월, 8월			
			while(a==2 || a==8) {
				if(b%7 == 1) {
					answer="MON";
				}else if(b%7 == 2){
					answer="TUE";
				}else if(b%7 == 3){
					answer="WED";
				}else if(b%7 == 4){
					answer="THU";
				}else if(b%7 == 5){
					answer="FRI";
				}else if(b%7 == 6){
					answer="SAT";
				}else{
					answer="SUN";
				}
				break;
			}
//	3월, 11월
			while(a==3 || a==11) {
				if(b%7 == 1) {
					answer="TUE";
				}else if(b%7 == 2){
					answer="WED";
				}else if(b%7 == 3){
					answer="THU";
				}else if(b%7 == 4){
					answer="FRI";
				}else if(b%7 == 5){
					answer="SAT";
				}else if(b%7 == 6){
					answer="SUN";
				}else{
					answer="MON";
				}
				
				break;
			}
//	5월			
			while(a==5) {
				if(b%7 == 1) {
					answer="SUN";
				}else if(b%7 == 2){
					answer="MON";
				}else if(b%7 == 3){
					answer="TUE";
				}else if(b%7 == 4){
					answer="WED";
				}else if(b%7 == 5){
					answer="THU";
				}else if(b%7 == 6){
					answer="FRI";
				}else{
					answer="SAT";
				}
				
				break;
			}
//	6월			
			while(a==6) {
				if(b%7 == 1) {
					answer="WED";
				}else if(b%7 == 2){
					answer="THU";
				}else if(b%7 == 3){
					answer="FRI";
				}else if(b%7 == 4){
					answer="SAT";
				}else if(b%7 == 5){
					answer="SUN";
				}else if(b%7 == 6){
					answer="MON";
				}else{
					answer="TUE";
				}
				break;
			}
//	9월, 12월			
			while(a==9 || a==12) {
				if(b%7 == 1) {
					answer="THU";
				}else if(b%7 == 2){
					answer="FRI";
				}else if(b%7 == 3){
					answer="SAT";
				}else if(b%7 == 4){
					answer="SUN";
				}else if(b%7 == 5){
					answer="MON";
				}else if(b%7 == 6){
					answer="TUE";
				}else{
					answer="WED";
				}
				
				break;
			}
//	10월		
			while(a==10) {
				if(b%7 == 1) {
					answer="SAT";
				}else if(b%7 == 2){
					answer="SUN";
				}else if(b%7 == 3){
					answer="MON";
				}else if(b%7 == 4){
					answer="TUE";
				}else if(b%7 == 5){
					answer="WED";
				}else if(b%7 == 6){
					answer="THU";
				}else{
					answer="FRI";
				}
				
				break;
			}
			
		}
		System.out.println(answer);
		
	}

}
