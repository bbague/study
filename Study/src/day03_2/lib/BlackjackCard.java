package day03_2.lib;

import day03_2.lib.Card;

public class BlackjackCard{
	int value;
	public final int rankNumber;
	public final int suitNumber;
	
	public BlackjackCard(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }
	
	public String getRank() {
        switch (rankNumber) {
        case 11:
            return String.valueOf(10);
        case 12:
            return String.valueOf(10);
        case 13:
            return String.valueOf(10);
        default:    
        	return String.valueOf(rankNumber);
        }
	}
	public int getValue() {
		value=Integer.parseInt(getRank());
			return value;
	}
	
	public boolean isAce() {
		if(rankNumber == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
