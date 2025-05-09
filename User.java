
import java.util.Scanner;

public class User {
         
           int  id;
           int age;
           String book_name;
           int card;
           String message;

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      System.out.println("Enter the user id:");
        User id= new User();
        id.id=input.nextInt();
        System.out.println("Enter the user age:");
          id.age=input.nextInt();

       
      User book=new User();
        System.out.println("Enter the book name:");
            book.book_name=input.next();
            System.out.println("Enter the card number:");
           book.card=input.nextInt();
           System.out.println("Enter the message:");    
           book.message=input.next();
           System.out.println("User id is: "+id.id);
              System.out.println("User age is: "+id.age);
                System.out.println("Book name is: "+book.book_name);
                System.out.println("Card number is: "+book.card);
                System.out.println("Message is: "+book.message);

   
     


    }       
           
      


}
