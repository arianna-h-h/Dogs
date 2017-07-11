import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  
  Methods objRef = new Methods(); 
  boolean loop = true; //initialize loop variable
  System.out.println("Hello, welcome to the dogopedia, where knowledge of dogs is king. ");
  System.out.println();
  
  //Use while loop to let user keep seeing dog pictures until they choose to quit
  do{
    Scanner scan = new Scanner(System.in);  
    System.out.println("Do you want see a specific kind of dog or a random dog? ");
    System.out.println("Enter s for specific");
    System.out.println("Enter r for random");
    String s = scan.next(); 
    
    //Uses overloaded constructor to choose a specific or random dog in Methods class
    if(s.toLowerCase().equals("s")){
      //goto specific dogDecide method
      String pic = objRef.dogDecide();
      objRef.picDisplay(pic); 
    }else if(s.toLowerCase().equals("r")){
      //goto random dogDecide method
      int num = objRef.randomGen(); //generate pseudo number 
      String pic = objRef.dogDecide(num); //pass number as parameter to dogDecide to select dog to display
      objRef.picDisplay(pic); 
    }else{
      loop = false;
    }
  
    loop = objRef.checkMethod(loop); 

  } while(loop == true); //end while loop
  
  }//end main Method  
}//end class Main