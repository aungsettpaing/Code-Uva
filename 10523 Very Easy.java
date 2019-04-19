import java.util.*;
import java.math.*;
public class VeryEasy10523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			BigInteger summ = new BigInteger("0");
			
			for(int i=1; i<=N; i++) {
				summ = summ.add(BigInteger.valueOf(A).pow(i).multiply(BigInteger.valueOf(i)));
			}
			
			System.out.println(summ);
		}
		
	}

}
