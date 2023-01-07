package sss111;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  private static List<Integer> countList = new ArrayList<Integer>();
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
    recurse(num, 0);
		System.out.println(minCount(countList) + " " + maxCount(countList));
	}
    
    private static int countOdd(int num) {                      
		int count = 0;
		String[] strNum = String.valueOf(num).split("");  
		for (int i = 0; i < strNum.length; i++) {
			if (Integer.parseInt(strNum[i]) % 2 == 1) count++;
		}
		
		return count;
	}
	
	private static void recurse(int num, int count) {                            
		count += countOdd(num);                                                 
		String strNum = String.valueOf(num);                                     
		                                                                          
		if (strNum.length() == 1) countList.add(count);
		else if (strNum.length() == 2) {
			String[] splitNum = strNum.split("");
			num = Integer.parseInt(splitNum[0]) + Integer.parseInt(splitNum[1]);
			recurse(num, count);
		} else {
			for (int i = 0; i < strNum.length() - 2; i++) {
				String first = strNum.substring(0, i + 1);                             
				for (int j = i + 1; j < strNum.length() - 1; j++) {
					String second = strNum.substring(i + 1, j + 1);
					String third = strNum.substring(j + 1);
					num = Integer.parseInt(first) + Integer.parseInt(second) + Integer.parseInt(third);
					recurse(num, count);
				}
			}
		}
	}
	
	private static int maxCount(List<Integer> countList) {
		int max = countList.get(0);
		for (Integer count : countList) {
			if (count > max) max = count;
		}
		
		return max;
	}
	
	private static int minCount(List<Integer> countList) {
		int min = countList.get(0);
		for (Integer count : countList) {
			if (count < min) min = count;
		}
		
		return min;
	}
}
