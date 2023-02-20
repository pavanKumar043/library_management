import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Date;
 class library { 
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREE ="\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
       
     ArrayDeque <String> ad= new ArrayDeque<>();
     ad.add("Book1");
     ad.add("Book2");
     ad.add("Book3");
     ad.add("Book4");
     int i=1;
     while(i<2){
     Scanner sc= new Scanner(System.in);
     Date d =new Date();
     System.out.println("Eanter your name : ");
     String name = sc.next();
     String Select;
     System.out.println("Your selections are 1.'ToAdd'  2.'ToTake'   3.ToReturn' ");
     Select = sc.next();
     switch(Select){
         case "ToAdd" :
         System.out.println("adding a book : ");
         System.out.print(ad.add(sc.next()));
         System.out.println("");
         System.out.println("Book added by the "+name+" at "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
         break;
         case "ToTake" :
         System.out.println(ad.clone());
         System.out.println("Select a book : ");
         if(ad.remove(sc.next())==true){
            System.out.println(ANSI_GREE+"Book taken by the "+name+" at "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()+ANSI_RESET);
        }    
         else{
             System.out.println(ANSI_RED+"your selected book is not available, SORRY TRY AGAIN"+ANSI_RESET);
         } 
         System.out.println("");
         break;
         case "ToReturn" :
         System.out.println("Returing a book : ");
         System.out.print(ad.add(sc.next()));
         System.out.println("");
         System.out.println("Book returned by the "+name+" at "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        
         default:
         System.out.println(ANSI_RED+"Wrong Selection"+ANSI_RESET);

     }



    System.out.println("Available books are : "+ad.clone());

}}
}

