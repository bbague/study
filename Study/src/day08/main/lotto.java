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
		
//		���� 45�� ����
		for(int i=1; i<=45; i++) {
			numbers1.add(i);
			numbers2.add(i);
			Collections.shuffle(numbers1);
			Collections.shuffle(numbers2);
		}
		
//		��÷��ȣ 6��
		System.out.print("��÷��ȣ : ");
		for(int n=0; n<6; n++) {
			colnum1.add(numbers1.get(n));
			System.out.print(numbers1.get(n) + " ");
		}
//		7��° ���� ���ʽ���ȣ
		a=numbers1.get(7);
		System.out.print("���ʽ� : " + a);
		
//		���� ���� ��ȣ
		System.out.println();
		System.out.print("�� ��ȣ : ");
		for(int n=0; n<6; n++) {
			colnum2.add(numbers2.get(n));
			System.out.print(numbers2.get(n) + " ");
		}
		System.out.println(" ");
		
//		�� �� ��÷��
		while(true) {
			colnum1.removeAll(colnum2);
			if(colnum1.size()==0) {
				System.out.println("10��");
			}else if(colnum1.size()==1 && colnum1.contains(a)) {
				System.out.println("5õ");
			}else if(colnum1.size()==2) {
				System.out.println("100��");
			}else if(colnum1.size()==3) {
				System.out.println("5��");
			}else if(colnum1.size()==4) {
				System.out.println("5õ");
			}else {
				System.out.println("��");
			}
			break;
		}
		
	}

}
