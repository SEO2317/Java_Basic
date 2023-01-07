
public class ArrayTest02 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for(int i = 2; i < arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	
}
