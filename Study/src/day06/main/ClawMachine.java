package day06.main;

import java.util.ArrayList;

public class ClawMachine {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		ArrayList<Integer> collect = new ArrayList<Integer>();
		int answer = 0;
		
//		0번째인덱스=board[0]
//		moves=2 board[][]의 행이아닌 컬럼을봄 =>board[][moves[i]-1]
		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					collect.add(board[j][moves[i]-1]);
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		int a = collect.size();
		
		for(int m=0; m<a; m++) {
			for(int n=1; n<collect.size(); n++) {
				if(collect.get(n).equals(collect.get(n-1))) {
					collect.remove(n-1);
					collect.remove(n-1);
					break;
				}
			}
		}
		answer =a-collect.size();
		System.out.println(answer);
		
	}

}
