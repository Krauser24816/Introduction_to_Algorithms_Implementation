/*Implementation of concept:
  Book - Introduction To Algorithms(Standard)
  Chapter - Computational Geometry
  Concept - Intersection of Lines.
  Page No. - 1017, 1018
  Status :- Answer is not coming right. 
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

    static SegmentsIntersect sI = new SegmentsIntersect();
    public static void main(String[] args)throws Exception{
        InputStreamReader iSR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(iSR);
        System.out.println("Enter 4 points");
        Point[] arrOfPoints = new Point[4];
        
        for(int inputItr=0;inputItr<4;inputItr++){
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            arrOfPoints[inputItr] = sI.new Point(x,y);
        }

        System.out.println(segIntersect(arrOfPoints));            
    }

    public static boolean segIntersect(Point[] arrOfPoints){
        int d1 = direction(arrOfPoints[2], arrOfPoints[3], arrOfPoints[0]);
        int d2 = direction(arrOfPoints[2], arrOfPoints[3], arrOfPoints[1]);
        int d3 = direction(arrOfPoints[0], arrOfPoints[1], arrOfPoints[2]);
        int d4 = direction(arrOfPoints[0], arrOfPoints[1], arrOfPoints[3]);

        if(d1!=d2 && d3!=d4) return true;
        else if (d1==0 && onSegment(arrOfPoints[2], arrOfPoints[3], arrOfPoints[0])) return true;
        else if (d2==0 && onSegment(arrOfPoints[2], arrOfPoints[3], arrOfPoints[1])) return true;
        else if (d3==0 && onSegment(arrOfPoints[0], arrOfPoints[1], arrOfPoints[2])) return true;
        else if (d4==0 && onSegment(arrOfPoints[0], arrOfPoints[1], arrOfPoints[3])) return true;
        else return false;
    } 

    public  static int direction(Point p1, Point p2, Point p3){
        //pk-pi
        int val = (p2.y-p1.y)*(p3.x - p2.x) - (p2.x - p1.x)*(p3.y-p2.y);
        if(val==0) return 0;
        return (val>0)? 1:2;
    }

    public static boolean onSegment(Point pi, Point pj, Point pk){
        if((Math.min(pi.x,pj.x)<=pk.x && Math.max(pi.x, pj.x)>=pk.x) && (
            Math.min(pi.y,pj.y)<=pk.y && Math.max(pi.y, pj.y)>=pk.y)) 
            return true;
        else return false;
    }
}

// First day - Took input using bufferedReader class, Tried to figure out direction function.

/* Second day - Resolved all syntax errors but answer is wrong. Now would take help from 
                GeeksforGeeks article
                Link:- https://www.geeksforgeeks.org/check-if-two-given-line-segments-intersect/
*/