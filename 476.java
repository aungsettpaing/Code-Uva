import java.util.*;
import java.awt.geom.*;
import java.awt.geom.Rectangle2D.Double;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle2D rectArr[] = new Rectangle2D.Double[10];
		int count = 0;
		boolean flag = false;
		
		String start = sc.next();
		while(!start.equals("*")){
			double x1 = sc.nextDouble(), y1 = sc.nextDouble();
			double x2 = sc.nextDouble(), y2 = sc.nextDouble();
			Rectangle2D r = new Rectangle2D.Double();
			r.setFrameFromDiagonal(x1, y1, x2, y2);
			rectArr[count++] = r;
			
			start = sc.next();
		}
		
		// reads points
		double x = sc.nextDouble(), y = sc.nextDouble();
		int pCount = 1;
		while(x != 9999.9 && y!= 9999.9){
			Point2D p = new Point2D.Double(x, y);
			for(int i=0; i<count; i++){
				if(rectArr[i].contains(p)){
					flag = true;
					System.out.println("Point "+ (pCount) +" is contained in figure "+(i+1));
				}
			}
			if(!flag)
				System.out.println("Point "+ (pCount) +" is not contained in any figure");
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			pCount++;
			flag = false;
		}
	}

}
