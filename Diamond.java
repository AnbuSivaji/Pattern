public class Diamond {
    public static void main(String[] args) {
        int row=3;
        // upper triangle
        for(int i=1;i<=row;i++){
          for(int j=i;j<row;j++){
            System.out.print(" ");
          }
          for(int k=1;k<=(2*i-1);k++)
          {
            System.out.print("*");
          }
            System.out.println(" ");

        }
        // lower triangle
        for(int i=row-1;i>=1;i--){
            for(int j=row;j>i;j--){
                System.out.print(" ");
            }
           for( int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
           }

        }
    }

