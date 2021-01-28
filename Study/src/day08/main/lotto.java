package day08.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class lotto {
	
	public static void main(String[] args) {
		Collection<Integer> colnum1 = new ArrayList<Integer>();
		List<Integer> numbers1 = new ArrayList<Integer>(); 
		Collection<Integer> colnum2 = new ArrayList<Integer>();
		List<Integer> numbers2 = new ArrayList<Integer>(); 
		int a=0;
		
//		숫자 45개 셔플
		for(int i=1; i<=45; i++) {
			numbers1.add(i);
			numbers2.add(i);
			Collections.shuffle(numbers1);
			Collections.shuffle(numbers2);
		}
		
//		당첨번호 6개
		System.out.print("당첨번호 : ");
		for(int n=0; n<6; n++) {
			colnum1.add(numbers1.get(n));
			System.out.print(numbers1.get(n) + " ");
		}
//		7번째 숫자 보너스번호
		a=numbers1.get(7);
		System.out.print("보너스 : " + a);
		
//		내가 뽑은 번호
		System.out.println();
		System.out.print("내 번호 : ");
		for(int n=0; n<6; n++) {
			colnum2.add(numbers2.get(n));
			System.out.print(numbers2.get(n) + " ");
		}
		System.out.println(" ");
		
//		비교 및 당첨금
		while(true) {
			colnum1.removeAll(colnum2);
			if(colnum1.size()==0) {
				System.out.println("10억");
			}else if(colnum1.size()==1 && colnum1.contains(a)) {
				System.out.println("5천");
			}else if(colnum1.size()==2) {
				System.out.println("100만");
			}else if(colnum1.size()==3) {
				System.out.println("5만");
			}else if(colnum1.size()==4) {
				System.out.println("5천");
			}else {
				System.out.println("꽝");
			}
			break;
		}
		
	}

}
