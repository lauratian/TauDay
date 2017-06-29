
public class Mountains {

	public static void main(String[] args) {
		final int INPUT = 3473;
		int input = INPUT;
		int peak = 0;
		int i = 0;
		int max = 0;
		int total = 0;
		int digits = 0;
		
		while (input > 0){ //finds the num of digits
			input = input / 10;
			digits = digits + 1;
		}
		input = INPUT;
		
		while (input > 0){ //finds value of peak
			total = input % 10;
			if (total > peak){
				peak = total;
			}
			input = input / 10;
		}
		input = INPUT;
//		System.out.println(peak);
		
/*		while (input % 10 > peak){
			increment = increment * 10;
			peak = input;
			input = INPUT;
		}
		increment = 10;
		*/
	//	int something = 1;
		while (input > 0){ //finds duplicates of peak
			if (input % 10 == peak){
				i = i + 1;
				input = input / 10;
			}
			else {
				input = input / 10;
			}
	//		input = input * something;
	//		something = something * 10;
	//		total = total + input;
	//		increment = increment * 10;
		}
		input = INPUT;
//		System.out.println(i);
				
		while (input % 10 > max && input % 10 <= peak){ //finds if right side is descending
			max = input % 10; //1
			input = input / 10; //12
			digits = digits - 1; //2
		}
//		System.out.println(digits);
//		System.out.println(max);
		
		
		while (input % 10 < max && input % 10 > 0){ //finds if left side is ascending
			max = input % 10;
			digits = digits - 1;
			input = input / 10;
		}
//		System.out.println(input);
//		System.out.println(digits);
//		System.out.println(max);
		
		if (digits == 0 && i == 1){
			System.out.println("This number is mountainous and the peak is: " + peak);
		}
		else{
			System.out.println("This number is not mountainous");
		}
	}
}
