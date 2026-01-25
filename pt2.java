package pattern;

public class pt2 {
    public static void main(String[] args) {
        int k=1;
        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+k++ );
            }
            System.out.println();
        }
        //pt
       int p=1;
        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
                System.out.print( p);

            }
            p++;
            System.out.println();
        }
        //pt
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print( j);

            }
            p++;
            System.out.println();
        }
    }
}
