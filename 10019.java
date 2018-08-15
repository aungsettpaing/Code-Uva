import java.util.*;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int i=testcase; i>0 ; i--){
			int decimal = sc.nextInt();
			int binaryBitCount = Integer.bitCount(decimal);
			
			int hexaDecimal = Integer.parseInt(Integer.toString(decimal), 16);
			int hexaDecBitCount = Integer.bitCount(hexaDecimal);
	
			System.out.println(binaryBitCount+" "+hexaDecBitCount);
		}
	}

}


