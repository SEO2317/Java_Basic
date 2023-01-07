package calc;

public class TestCalc {
	public static void main(String[] args) {
		Calc calc = new Calc();
		int num = Integer.parseInt(args[0]);
		if (num >= 5 && num <= 10) {
			System.out.println("결과 : " + calc.calcuate(num));
		} else {
			System.out.println("다시 입력하세요.");
		}
	}
}
