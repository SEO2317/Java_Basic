
public class Test {

	public static void main(String[] args) {
		int a = 1;
	    double b = 4.5;
	    
	    double c = (int) a + (int) b;
	    double d = (int) a + (double) b;
	    double e = (double)a + (double)b;
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
	}

}
