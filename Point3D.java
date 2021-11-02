/*
   Ashley Timko
   TCSS 143
   Description: Implement a 3D Point that inherits from Point class
*/

public class Point3D extends Point implements Movable3D, Comparable<Point> {
   // Instance Field: z coordinate 
   private int z;
   
   /* Constructor: Create a Point3D using x,y,z coordinates */
   public Point3D(int x, int y, int z) {
      super(x,y);
      this.z = z;
   }
   
   /* Constructor: Create a Point3D at origin */
   public Point3D()  {
      this(0,0,0);
   }
   
   // Method: To return z coordinate
   public int getZ() {
      return z;
   }
   
   // Method: To update z coordinate
   public void setZ(int z) {
      this.z = z;
   }
   
   // Method Overloading: setLocation(int,int,int) Method
   public void setLocation(int x, int y, int z) {
      setLocation(x,y);
      this.z = z;
   }
   
   // Method Overloading: translate(int,int,int) Method
   public void translate(int dx, int dy, int dz)   {
      translate(dx,dy);
      z += dz;
   }
   
   //@Override distanceOrigin() Method
   public double distanceOrigin()   {
      return Math.sqrt(Math.pow(getX(),2) + Math.pow(getY(),2) + z*z);
   }
   
   //@Override distance() Method
   public double distance(Point3D p)   {
      int dx = getX() - p.getX();
      int dy = getY() - p.getY();
      int dz = z - p.z;
      
      return Math.sqrt(dx*dx + dy*dy + dz*dz);
   }
   
   //@Override toString() Method
   public String toString()   {
      return "(" + getX() + "," + getY() + "," + z + ")";
   }
   
   //@Override equals() Method
   public boolean equals(Object o) {
      // Check if o is Point3D
      if(o instanceof Point3D)   {
         Point3D other = (Point3D)o;
         return getX() == other.getX() && getY() == other.getY() && z == other.z;
      }
      
      return false;
   }
   
   // Implement abstract methods from Movable3D Interface
   /*
      Method: Update z by zSpeed (move on +ve z-axis)
      Param: none
      Return: void
   */
   public void moveZUp()   {
      z += zSpeed;
   }
   
   /*
      Method: Update z by zSpeed (move on -ve z-axis)
      Param: none
      Return: void
   */
   public void moveZDown()   {
      z -= zSpeed;
   }
   
   //Implement compareTo() from Comparable<Point> interface
   public int compareTo(Point o)  {
      // Check if p is instance of Point3D
      if(o instanceof Point3D)   {
         Point3D p = (Point3D)o;
         // Check if x coordinates are equal
         if(getX() == p.getX())  {
            if(getY() == p.getY())  {
               return z - p.z;
            }
            else 
               return getY() - p.getY();
         }   
         return getX() - p.getX();
      }
      return super.compareTo(o);
   }
}