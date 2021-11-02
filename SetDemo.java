/*
   Ashley Timko
   TCSS: 143
   Description: Set Demo Code
*/

import java.util.*;

public class SetDemo {
   public static void main(String[] args) {
      //Declare a St to store programming languages
      Set<String> proLang = new HashSet<String>();
      
      //Add elements to the set
      progLang.add("Java");
      progLang.add("C++");
      progLang.add("JavaScript");
      progLang.add("C");
      progLang.add("Python");
      progLang.add("Cobol");
      progLang.add("Scratch");
      
      //Display the site and elements of the set
      System.out.println("Total elements: " + progLang.size());
      System.out.println(progLang);
      
      //Method Calls
      removeEvenLength(progLang);
      System.out.println(progLang);
      
   }
   
   /*
      Method: Remove Strings of even length from the Set
      Param: Set<String>
      Return: Void
   */
   public static void removeEvenLength(Set<String> progLang) {
      //Step One: Declare Iterator & attach it to the Set
      Iterator<String> itr = progLang.iterator();
      
      //Step Two: Loops through the elements
      while(itr.hasNext()) {
         String str = itr.next();
         //Step Three: Check if length of the string is even
         if(str.length() % 2 == 0) {
            //Step Three.One: Remove the String
            itr.remove();        //progLang.remove(str);      concurrent modification exception
      }
   }   
}