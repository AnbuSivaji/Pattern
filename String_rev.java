
public class String_rev {
public static void main(String[] args) {
    String str = "Hello World";

    System.out.println("Original String: " + str);


    for(int i=str.length()-1;i>=0;i--){
        System.out.print(  str.charAt(i));
    }
    System.out.println();
  
        
}
}
