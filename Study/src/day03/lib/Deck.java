package day03.lib;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public ArrayList<Card> getCards(){
		return cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void print() {
		for(int i=0; i<cards.size(); i++) {
			System.out.println(cards.get(i).toString());
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Deck deal(int count) {
		Deck hand = new Deck();
		int i = 1;
		while(i<6) {
			Card card = cards.get(cards.size()-i);
			hand.addCard(card);
			cards.remove(cards.size()-1);
			i++;
		}
		
		return hand;
	}
	
}
