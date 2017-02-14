package ejerciciopoo;

import ch.aplu.turtle.Turtle;
import java.util.*;
/**
 *
 * @author Equipo
 */
public class POO {
   private  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void Square(int length){
       for(int i=0;i<4;i++){
           joe.forward(length);
           joe.right(90);
       }
   
   }
   public void Pattern(int length){
       for(int i=0;i<8;i++){
           Square(length);
           joe.right(45);
       }
       
       
    
   }
   
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO e = new POO();
       Scanner lec=new Scanner(System.in);
       System.out.println("Introduce side length");
       int a=lec.nextInt();
       e.Pattern(a);
    }
    
}
