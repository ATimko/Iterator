/*
   Author:  Ashley Timko
   TCSS 143
   Decription: Practice with Objects - Point class
*/

public class Point implements Movable,Comparable<Point> {      // Objects are instance of class 
   //Object state: Instance Fields are encapsulated
   private int x;            // x-coordinate of Point 
   private int y;            // y-coordinate of Point
   
   private static int pointCount = 0;     // Static field for point count
   
   // Constructs a Point at the given x/y location.
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
      // Update point count
      pointCount++;
   }
   
   // Constructs a new point at (0, 0).
   public Point() {
      this(0,0);     // Refers to the parameterized constructor
   }
   
   // Object Behavior: Instance Methods
   // Method: To Return x coordinate
   public int getX() {
      return x;
   }
   
   // Method: To Return y coordinate
   public int getY() {
      return y;
   }
   
   // Method: To Update x coordinate
   public void setX(int x) {
      this.x = x;
   }
   
   // Method: To Update y coordinate   
   public void setY(int y) {
      this.y = y;
   }
   /*
      Method to Tranlate point (x,y) by dx and dy
      Parameter: int, int
      Return: none
   */
   public void translate(int dx, int dy) {
	   x = x + dx;
	   y = y + dy;
   }
   
   /*
      Method to update x and y coordinates of a point 
      Parameter: int, int
      Return: none
   */
   public void setLocation(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /*
      Method to calcuate distance of a point from origin 
      Parameter: None 
      Return: double 
   */
	public double distanceOrigin()	{
      //Return this.distance(new Point());
		return Math.sqrt(x*x + y*y);
	}
   
   /*
      Method to calcuate distance of a point from another point  
      Parameter: None 
      Return: double 
   */
	public double distance(Point other)	{
		int dx = x - other.x;
      int dy = y - other.y;
      return Math.sqrt(dx * dx + dy * dy);
	}

   // @Override: toString()
   public String toString() {
	   return "(" + getX() + ", " + getY() + ")";
   }
   
   // @Override: equals() Method
   public boolean equals(Object o) {
      if (o instanceof Point) {  
         // o is a Point; cast and compare it
         Point other = (Point) o;
         return x == other.x && y == other.y;
      } else {
        // o is not a Point; cannot be equal
        return false;
      }
   }
   
   // Implement abstract methods from Movable Interface
   /*
      Method: Update x by xSpeed (move on +ve x-axis)
      Param: none
      Return: void
   */
   public void moveXUp()   {
      x += xSpeed;
   }
   
   /*
      Method: Update x by xSpeed (move on -ve x-axis)
      Param: none
      Return: void
   */
   public void moveXDown()   {
      x -= xSpeed;
   }
   
   /*
      Method: Update y by ySpeed (move on +ve y-axis)
      Param: none
      Return: void
   */
   public void moveYUp()   {
      y += ySpeed;
   }
   
   /*
      Method: Update y by ySpeed (move on -ve y-axis)
      Param: none
      Return: void
   */
   public void moveYDown()   {
      y -= ySpeed;
   }

   /*
      Static Method to return the point count
      Parameter: None
      Return: int
   
   */
   public static int getCount()  {
      return pointCount;
   }
   
   //Implement compareTo() from Comparable<Point> interface
   public int compareTo(Point p)  {
      // Check if x coordinates are equal
      if(x != p.x)
         return x - p.x;
      return y - p.y;
   }   
}

class TestPoint   {
   public static void main(String[] args)  {
      Point p = new Point();
      Point p1 = new Point(3,4);
      Point p2 = new Point(-3,-3);
      
      //System.out.println(p);
      System.out.println(p1);
      System.out.println(p2);
      
      System.out.println("Count:" + Point.getCount()); // Correct way of using static field
      System.out.println(p1.distanceOrigin());
      System.out.println("Comparing p1 & p2: " + p1.compareTo(p2));
      System.out.println("Comparing p2 & p1: " + p2.compareTo(p1));  
   }
}



   
   
   