import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int k;
	static int l[];
	static int t[];
	static int dp[][];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		l = new int[k+1];
		t = new int[k+1];
		dp = new int[k+1][n+1];
		
		for(int i=1; i<=k; i++) {
			st = new StringTokenizer(br.readLine());
			l[i] = Integer.parseInt(st.nextToken());
			t[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=k;i++) {
			for(int j=1; j<=n; j++) {
				if(j-t[i]>=0)
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-t[i]] + l[i]);
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[k][n]);
	}

}
