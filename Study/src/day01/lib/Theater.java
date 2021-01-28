package day01.lib;



public class Theater {
	private Seat[][] seats;
	private int rowCount;
	private int colCount;
	
	
	
	public Theater(int rowCount, int colCount) {
		if(rowCount > 26) {
			rowCount = 26;
		}
		seats = new Seat[rowCount][colCount];
		for(int i=0; i < rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				seats[i][j] = new Seat();
			}
		}
		this.rowCount = rowCount;
		this.colCount = colCount;
	}
	
//	예약
	public boolean reserve(String name, char rowChar, int col, int numSeat) {
		if(getRowIndex(rowChar)>seats.length-1 || col+numSeat-1 >seats[0].length) {
			return false;
		}
		for(int i=col-1;i<col+numSeat-1;i++) {
			if(seats[getRowIndex(rowChar)][i].isOccupied()) {
				return false;
			}
			
			seats[getRowIndex(rowChar)][i].reserve(name);
		}
		return true;
		
	}
	
//	예약 취소
	public int cancel(String name) {
		int count = 0;
		for(int i=0; i<seats.length-1; i++) {
			for(int j=0; j< seats[0].length-1; j++) {
				if(name.equals(seats[i][j].getName())) {
					seats[i][j].cancel();
					count++;
				}
				continue;
			}
		}
		return count;
	}
	
	
//	예약 취소(선택)
	public int cancel(char rowChar, int col, int numSeat) {
		int count = 0;
		for(int i=col-1; i<col+numSeat-1; i++) {
				if(seats[getRowIndex(rowChar)][i].equals(seats[getRowIndex(rowChar)][col-1])) {
					seats[getRowIndex(rowChar)][i].cancel();
					count++;
			}
		}
		return count;
	}
	
//	예약된 모든 좌석 리턴
	public int getNumberOfReservedSeat() {
		int count = 0;
		for(int i=0; i<rowCount; i++) {
			for(int j=0; j< colCount; j++) {
				if(seats[i][j].isOccupied()) {
					count++;
				}
			}
		}	
		return count;
	}
	
	 public void printSeatMatrix() {
	        System.out.print("  ");
	        for (int i = 1; i <= 9; i++) {
	            System.out.print("  " + i);
	        }
	        System.out.println();

	        for (int i = 0; i < rowCount; i++) {
	            System.out.print((char) ('A' + i) + ": ");
	            for (int j = 0; j < colCount; j++) {
	                Seat s = seats[i][j];
	                if (s.isOccupied()) {
	                    System.out.print("[O]");
	                } else {
	                    System.out.print("[ ]");
	                }
	            }
	            System.out.println();
	        }
//	    	영화관 행을 해당하는 정수로 변환
	    	
	    }
	 private int getRowIndex(char uppercaseChar) {
		 return uppercaseChar - 'A';
	 }

}
