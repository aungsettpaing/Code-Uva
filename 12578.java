import java.text.DecimalFormat;
import java.util.*;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int i=0; i<testcase; i++){
			int L = sc.nextInt();
			double W = (L * 6) / 10.0;
			double R = (L * 2) / 10.0;
			
			double RectArea = (double) L * W;
			double CircleArea = Math.PI * R * R;
			
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println(df.format(CircleArea)+" "+df.format(RectArea - CircleArea));
		}
	}

}
