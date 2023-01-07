

public class Test08 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=100; i++) {
			System.out.print(i);
			if(i%3==0) {
				System.out.print("\tfoo");
			}
			else if(i%5==0) {
				System.out.print("\tbar");
			}
			else if(i%7==0) {
				System.out.print("\tbaz");
			}
			System.out.println();
		}
	}
	
}
