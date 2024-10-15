public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((b.getX() - a.getX()), 2)  + Math.pow((b.getY() - a.getY()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(new Point(1, 1));
    Point p5 = new Point(20,21); //pyth triple 20-21-29
    Point p6 = new Point(5,12);  //pyth triple 5-12-13

    Point eq2 = new Point(1,0);
    Point eq3 = new Point(0.5, Math.sqrt(3)/2);

    Point origin = new Point(0,0);


    System.out.println(distance(p1, p2));
    System.out.println(p4);
    System.out.println(p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));

    System.out.println( distance(origin,p5));
    System.out.println( Point.distance(origin, p5));
    System.out.println( origin.distanceTo(p5));

    System.out.println( distance(origin,p6));
    System.out.println( Point.distance(origin, p6));
    System.out.println( origin.distanceTo(p6));

    System.out.println(distance(origin, eq2));
    System.out.println(distance(origin, eq3));
    System.out.println(distance(eq3, eq2));
  }
}
