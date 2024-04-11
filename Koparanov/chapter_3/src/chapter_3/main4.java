package chapter_3;

public class main4 {

	public static void main(String[] args) {
		int number = 5;
		int thirdBit = (number >> 2) & 1;
		if (thirdBit == 1) {
		    System.out.println("Третият бит е 1");
		} else {
		    System.out.println("Третият бит е 0");
		}

	}

}
