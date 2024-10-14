package week1.day2;

public class FibanacciSeries {
	
	
	public static void main(String[] args) {
		int n=8,num1=0,num2=1;
		for(int i=0;i<8;i++) {
			int num = num1+num2;
			System.out.print(" " +num1);
			num1=num2;
			num2=num;
		}
		
	}

}
