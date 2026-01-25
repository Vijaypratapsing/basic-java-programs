package pattern;

public class palindrom {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            for(int m=2;m<=i;m++){
                System.out.print(m);
            }
            System.out.println();
        }
        //robos
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }for(int k=1;k<=5;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Left Half Pyramid Pattern
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Reverse Left Half Pyramid Pattern
        for(int i=5;i>=1;i--){
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        //piramide2
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int m=1;m<i;m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }



}
