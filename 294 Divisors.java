import java.util.*;
public class Divisors_294 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int i=0; i<testcase; i++){
			
			int lower = sc.nextInt();
			int upper = sc.nextInt();
			
			int maximum = Integer.MIN_VALUE, value = 0;
			for(int n=lower; n<=upper; n++){
				int count = 0;
				int sqrt =(int) Math.sqrt(n);
				for(int j=1; j<=sqrt; j++){
					if(n%j == 0){
						if(j*j == n)count++;
						else count += 2;
					}
				}
				
				if(maximum < count){
					maximum = count;
					value = n;
				}
			}
			
			System.out.println("Between "+lower+" and "+upper+", "+value+" has a maximum of "+maximum+" divisors.");
		}
	}

}
