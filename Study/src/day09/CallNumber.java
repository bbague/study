package day09;

public class CallNumber {

	public static void main(String[] args) {
		String[] phone_book1 = {"119", "97674223", "1195524421"};
		String[] phone_book = {"123", "456", "789"};
		
		
		boolean answer = true;
		
		 for(int i=0; i<phone_book.length; i++) {
				for(int j=1; j<phone_book.length; j++) {
					if(phone_book[i].length()<=phone_book[j].length() && phone_book[i].equals((phone_book[j].substring(0, phone_book[i].length())))) {
						answer = false;
					}else if(phone_book[i].length()>phone_book[j].length() && phone_book[j].equals((phone_book[i].substring(0, phone_book[j].length())))) {
						answer = false;
					}
				}break;
			
		}
     System.out.println(answer);
		
	}

}
