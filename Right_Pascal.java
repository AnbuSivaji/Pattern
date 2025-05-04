public class Right_Pascal {
    public static void main(String[] args) {
        // Right Pascal Triangle
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");// you want number pattern using i or j
            }
            System.out.println(" ");
        }
        for(int i=row-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");// you want number pattern using i or j
            }
            System.out.println(" ");
        }


    }
}
