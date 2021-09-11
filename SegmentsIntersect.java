/*Implementation of concept:
  Book - Introduction To Algorithms(Standard)
  Chapter - Computational Geometry
  Concept - Intersection of Lines.
  Page No. - 1017, 1018
  Note:- Not completed Many errors are there would be resolving them.
*/
import java.io.*;

public class SegmentsIntersect{

    public class Point{
        int x =0, y=0;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args)throws Exception{
        InputStreamReader iSR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(iSR);
        System.out.println("Enter 4 points");
        Point[] arrOfPoints = new Point[4];
        for(int inputItr=0;inputItr<4;inputItr++){
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            arrOfPoints[inputItr] = new Point(x,y);
        }

        System.out.println(segIntersect(arrOfPoints));            
    }

    public static boolean segIntersect(Point[] arrOfPoints){
        int d1 = direction(arrOfPoints[2], arrOfPoints[3], arrOfPoints[0]);
    }

    public  static int direction(Point pi, Point pj, Point pk){
        //pk-pi
        Point p1 = new Point((pk.x - pi.x), (pk.y-pi.y));
        Point p2 = new Point(pj.x - pi.x, pj.y-pi.y);
        return (p1.x*p2.x) + (p1.y*p2.y);
    }
}

// First day - Took input using bufferedReader class, Tried to figure out direction function.
// Second day - First resolve all errors and then continue.