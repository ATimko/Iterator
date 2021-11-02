/*
   Ashley Timko
   TCSS: 143
   Description: Set Object Demo
*/

public class SetObjDemo {
   public static void(String[] args) {
      //Declar a HashSet of Point
      Set<Point> ptSet = new HashSet<Point>();
      
      //Add instances of Point & Point3D
      ptSet.add(new Point());
      ptSet.add(new Point3D(-1, 5, 6));
      ptSet.add(new Point(-2, 2));
      ptSet.add(new Point3D());
      ptSet.add(new Point3D(4, -5, -6));
      ptSet.add(new Point());    //Duplicate value
      
      //Display the elements of ptSet
      System.out.println(ptSet);
      
      //Add elements of HashSet to the TreeSet
      ptTreeSet.addAll(ptSet);
      System.out.println(ptTreeSet);    
       
      //Method Call: Display distance from origin for each point
      displayDistance(ptSet);
      //Method Call: Remove point with distance less than 3
      removePoint(ptTreeSet);
      System.out.println(ptTreeSet);
      
   }
   
   /*
      Method: Display Distance of each point from origin
      Param: Set<Point>
      Return: Void
   */
   public static void displayDistance(Set<Point> ptSet) {
      //For each line
      for(Point p:ptSet) {
         System.out.println("Distance from origin: " + p.distanceOrigin());
   }
   /*
      Method: Remove Point with distance less than 3 from origin
      Param: Set<Point>
      Return: Void
   */
   public static void removePoint(Set<Point> ptSet) {
      //Declare the iterator
      Iterator<Point> itr = ptSet.iterator();
      
      //Loop over the Set
      while(itr.hasNext()) {
         Point p = itr.next();;
         //Check if distance is less than 3
         if(p.distanceOrigin() < 3) {
            itr.remove();
         }
      }
   }
}