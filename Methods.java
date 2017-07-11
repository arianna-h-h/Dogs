import java.util.Random;
import java.util.Date;
import java.util.Scanner;

class Methods{
  
  /*------------------------------------------------------------------------------------*/
  
  public void picDisplay(String pic){
    Picture pix = new Picture(pic);
    pix.show();
    }//end picDisplay 
  
 
  /*------------------------------------------------------------------------------------*/
    
  public boolean checkMethod(boolean loop){
    Scanner scan = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter q when you are done learning\n" +
    "or any character to continue");
    String v = scan.next();
    if(v.toLowerCase().equals("q")){
      loop = false;
      System.out.println("Goodbye");
    }else {
      loop = true;
    }//end else
     return loop;
  }//end checkMethod
  
  
  /*------------------------------------------------------------------------------------*/
  
  public int randomGen(){
    Random generator = new Random(new Date().getTime());
    int randomNumber = (byte)generator.nextInt();
    return randomNumber;
    }//end randomGen
    
  
  /*------------------------------------------------------------------------------------*/
  
  //Specific dog decide scans for user input and displays the corresponding dog picture
  public String dogDecide(){
    String pic;
    System.out.println("You can learn about:\n" + "1. Labradors\n" + "2. Poodles\n" + 
                       "3. Jack Russell Terriers");
    
    System.out.println();
    System.out.println("Enter the number of the breed or the first letter of its name\n" +
    "Enter q when you are done learning\n" +
    "Or any other character to continue");
    
    System.out.println();
    Scanner scan = new Scanner(System.in);  // Reading from System.in
    System.out.println("What kind of dog do you want to learn about? ");
    String s = scan.next();
    
    if(s.toLowerCase().equals("l") || s.equals("1")){
      pic = "lab.jpg";
      
    }else if(s.toLowerCase().equals("p") || s.equals("2")){
      pic = "poodle.jpg";
    
    }else if(s.toLowerCase().equals("j") || s.equals("3")){
      pic = "jack.jpg";
      
    }else { //else is needed so pic will be initalized (assigned a value), no matter what
      pic = "pic1.jpg";
      System.out.println("Here is a random dog then!!");
    }//end else
    return pic;
  }//end dogDecide
  
  
  /*------------------------------------------------------------------------------------*/
  
  //random dogDecide method uses a psuedorandom number (data) to select a dog picture
  public String dogDecide(int data){
    String pic;
    if(data < -100){
      pic = "greyhound.jpg";
   }else if(data > -75 && data < -100){
     pic = "pic1.jpg";     
    }else if (data > -50 && data < -74){
      pic = "pic2.jpg"; 
    }else if (data > -25 && data < -49){
      pic = "jack.jpg";
    }else if (data > 0 && data < -24){
      pic = "jack.jpg";
    }else if (data > 0 && data < 24){
      pic = "lab.jpg";
    }else if (data > 25 && data < 49){
      pic = "pom.jpg";
    }else if (data > 50 && data < 74){
      pic = "gsp.jpg";
    }else if (data > 75 && data < 100){
      pic = "bmd.jpg";
    }else if (data > 100){
      pic = "pit.jpg";
    }else {
      pic = "pic3.jpg"; 
    }//end else  
    return pic;
  }//end random dogdecide 
  
}//end class Methods