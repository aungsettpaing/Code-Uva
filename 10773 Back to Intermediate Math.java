import java.util.*;
import java.math.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		for(int i=0; i<testcase; i++) {
			double d = sc.nextDouble();
			double v = sc.nextDouble();
			double u = sc.nextDouble();
			
			if(d == 0 || v == 0 || u<=v)
				System.out.println("Case "+(i+1)+": can\'t determine");
			else {
				// fastest path
				double t1 = d/u;
				
				// shortest path
				double uv = Math.sqrt((u*u)-(v*v));
				double t2 = d/uv;
				
				System.out.printf("Case "+(i+1)+": %.3f\n",Math.abs(t1-t2));
			}
		}
	}

}
