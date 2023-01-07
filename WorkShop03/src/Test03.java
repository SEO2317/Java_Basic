
public class Test03 {
	public static void main(String[] args) {
		int i=0;
		while(i<=10) {
			int j=0;
			while(j<=i) {
			j++;
			System.out.print("*");
			}
			System.out.println();
			i++;
			}
		}
	}
//	public static void main(String[] args) {
//		for(int i=0; i<=10; i++) { //초기1 조건1 증감1
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}
//초기식1
//while(조건식1) {
//    *         
//    *         초기식2;
//    * 
//    *         while(조건식2) {
//    *             // 반복할 문장...
//    *             증감식2;
//    *         }
//    * 
//    *         증감식1;
//    * 
//    * }
//    * 
//    */

/*
 *      초기식;
	while(조건식) {
       문장;
       증감식;
}
 */