import java.io.*;
import java.util.*;
class Main{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringBuilder sb;
		StringBuilder ans = new StringBuilder();
		// Skip the blank line
		br.readLine();
		
		for(int i=0; i<testcase; i++){
			int amplitude = Integer.parseInt(br.readLine());
			int frequency = Integer.parseInt(br.readLine());
			sb = new StringBuilder();
						
			// Print upper waves.
			for(int w1=1; w1<= amplitude; w1++){
				for(int w2=1; w2<=w1; w2++){
					//System.out.print(w1);
					sb.append(w1);
				}
				//System.out.println();
				sb.append("\n");
			}
			// Print lower waves.
			for(int w1=amplitude-1; w1>=1; w1--){
				for(int w2=1; w2<=w1; w2++){
					//System.out.print(w1);
					sb.append(w1);
				}
				//System.out.println();
				sb.append("\n");
			}
						
			// Print waves frequency times.
			for(int f=0; f<frequency; f++){
				ans.append(sb);
				// To avoid Presentation Error (extra one line at the end of the output)
				if(i == testcase-1){
					if(f != frequency-1){
						ans.append("\n");
					}
				}
				else{
					ans.append("\n");
				}
			}			
			// Skip the blank line between two test cases.
			if(i < testcase-1)
				br.readLine();
		}
		System.out.print(ans);
	}
}
