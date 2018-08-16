import java.io.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.geom.Rectangle2D.Double;
class Main{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		// Skip the blank line.
		br.readLine();
		
		int x1,y1, x2,y2;
		int x3,y3, x4,y4;
		StringTokenizer st;
		String s;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<testcase; i++){
			/* Get the first window's coordinates. */
			s = br.readLine();
			// To avoid some consecutive blank lines between test cases.
			while(s.isEmpty() || s == null) s = br.readLine();
			st = new StringTokenizer(s);
			x1 = Integer.parseInt(st.nextToken()); y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken()); y2 = Integer.parseInt(st.nextToken());
			Rectangle2D w1 = new Rectangle2D.Double();
			w1.setFrameFromDiagonal(x1, y1, x2, y2);
			
			/* Get the second window's coordinates. */
			s = br.readLine();
			// To avoid some consecutive blank lines between test cases.
			while(s.isEmpty() || s == null) s = br.readLine();
			st = new StringTokenizer(s);
			x3 = Integer.parseInt(st.nextToken()); y3 = Integer.parseInt(st.nextToken());
			x4 = Integer.parseInt(st.nextToken()); y4 = Integer.parseInt(st.nextToken());
			Rectangle2D w2 = new Rectangle2D.Double();
			w2.setFrameFromDiagonal(x3, y3, x4, y4);
			
			if(w1.intersects(w2)){
				sb.append(Math.max(x1, x3)+" "+Math.max(y1, y3)+" "+Math.min(x2, x4)+" "+Math.min(y2, y4)+"\n");
			}
			else{
				sb.append("No Overlap\n");
			}
			if(i < testcase - 1){
				br.readLine();
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}

}
