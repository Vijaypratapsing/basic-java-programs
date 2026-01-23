package Series;

public class first {
    public static void main(String[] args) {
        int no=7;
        float sum=0;
        int j=1;
        int term=no;
        for (int i=0 ;i<3;i++){
            sum+=term;
            term=(term*no*no*(-1))/((j+1)*(j+2));
            j=j+2;
        }
        System.out.println(sum);
    }
}
