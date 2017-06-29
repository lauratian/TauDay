
public class Trees {

	public static void main(String[] args) {
		int[] trees;
		trees = new int[10];
		int max = trees[0];
		int value = 0;
		int maxVal = 0;
		int total= 0;
		
		trees[0] = 10;
		trees[1] = 10;
		trees[2] = 10;
		trees[3] = 4;
		trees[4] = 5;
		trees[5] = 6;
		trees[6] = 7;
		trees[7] = 8;
		trees[8] = 9;
		trees[9] = 10;
		
		
		
		while (value < 10){
			if (trees[value] > max){
				max = trees[value];
				value++;
			}
			value++;
		}
		value = 0;
		maxVal = max;
		
		while (value < 10){
			if (trees[value] == maxVal){
				total++;
				value++;
			}
			else{
				value++;
			}
		}
		System.out.println(total);
	}
		
		
}
