import java.util.*;
import java.awt.Shape;
import java.awt.geom.*;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shape shapeArr[] = new Shape[10];
		int count = 0;
		boolean flag = false;
		
		String start = sc.next();
		while(!start.equals("*")){
			if(start.equals("r")){
				double x1 = sc.nextDouble(), y1 = sc.nextDouble();
				double x2 = sc.nextDouble(), y2 = sc.nextDouble();
				Rectangle2D r = new Rectangle2D.Double();
				r.setFrameFromDiagonal(x1, y1, x2, y2);
				Shape sRect = r;
				shapeArr[count++] = sRect;
			}
			else if(start.equals("c")){
				double x1 = sc.nextDouble(), y1 = sc.nextDouble();
				double r = sc.nextDouble();
				Shape sCircle = new Ellipse2D.Double(x1-r, y1-r, r*2, r*2);
				shapeArr[count++] = sCircle;
			}
			start = sc.next();
		}
		
		// reads points
		double x = sc.nextDouble(), y = sc.nextDouble();
		int pCount = 1;
		while(x != 9999.9 && y!= 9999.9){
			Point2D p = new Point2D.Double(x, y);
			for(int i=0; i<count; i++){
				Shape s;
				try{
					s = (Ellipse2D) shapeArr[i];
				}
				catch(Exception e){
					s = (Rectangle2D) shapeArr[i];
				}
				if(s.contains(p)){
					flag = true;
					System.out.println("Point "+ (pCount) +" is contained in figure "+(i+1));
				}
			}
			if(!flag){
				System.out.println("Point "+ (pCount) +" is not contained in any figure");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			pCount++;
			flag = false;
		}
		sc.close();
	}

}
