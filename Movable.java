/*
   Ashley Timko
   TCSS 143
   Description: Implement Movable & Movable3D interface
*/

public interface Movable   {
   //Static fields 
   static final int xSpeed = 10;
   static int ySpeed = 5;  //Final is optional
   
   //Abstract Methods 
   public void moveXUp();
   public void moveXDown();
   public void moveYUp();
   public void moveYDown(); 
}

interface Movable3D extends Movable {
   //Static field 
   static int zSpeed = -5;
   
   //Abstract Methods
   public void moveZUp();
   public void moveZDown();
}