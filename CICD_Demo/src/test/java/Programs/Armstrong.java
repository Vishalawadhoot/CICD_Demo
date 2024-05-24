package Programs;

public class Armstrong {					//sum of cubes| 153=1^3+5^3+3^3=1+125+27=153

	public static void main(String[] args) {

		int no = 153;
		int copy = no;
		int sum = 0;
		while (no!=0) {
			int rem = no%10;
			sum = sum + (rem*rem*rem);
			no = no/10;			
		}
		if (copy==sum) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
	}

}
