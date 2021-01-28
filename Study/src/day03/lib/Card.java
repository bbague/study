package day03.lib;

import java.util.Scanner;

public class Card {
	public final int suitNumber;
	public final int rankNumber;
		
	Scanner scanner = new Scanner(System.in);
	
	public Card(int suitNumber, int rankNumber) {
		this.suitNumber = suitNumber;
		this.rankNumber = rankNumber;
		
	}
	
	public String getSuit() {	
		String suit = null;
		if(this.suitNumber == 1) {
			suit="Clubs";
		}
		if(this.suitNumber == 2) {
			suit="Hearts";
		}
		if(this.suitNumber == 3) {
			suit="Diamonds";
		}
		if(this.suitNumber == 4) {
			suit="Spades";
		}
		return suit;
		
	}
	
	public String getRank() {
		String s= null;
		
		if(rankNumber==1) {
			s = "Ace";
		}else if(rankNumber==11) {
			s = "Jack";
		}else if(rankNumber==12){
			s = "Queen";
		}else if(rankNumber==13) {
			s = "King";
		}else {
			s = Integer.toString(rankNumber);
		}
		return s;
	}
	
	public String toString() {
		String k = getSuit().concat(" of ").concat(getRank());
		
		return k;
	}
	
}
