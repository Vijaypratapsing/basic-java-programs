public class fibo {
    static int nthFibonacci(int n){
        // code here
        if(n<=1) return 1;
        return nthFibonacci(n-1)+nthFibonacci(n-2);

    }
    public static int fibo(int n){

        if(n<=1) return(n);
         return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int N = 10; // Example: Find the first 10 Fibonacci numbers
        System.out.print(nthFibonacci(2) + " ");
//        for (int i = 0; i < N; i++) {
//            System.out.print(fibo(i) + " ");
//        }
    }
}
