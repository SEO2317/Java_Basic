
public class Test04 {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;++i){
			for(int j=1;j<=6;++j) {
				for(int z=1;z<=6;++z) {
				int multi = i*j*z;
				if(multi%3==0)
					System.out.println(i+"*"+j+"*"+z+"="+ multi);
		 	}
		}
		}
	}		
}