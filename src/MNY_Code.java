
public class MNY_Code {

    public static void printFib(int a , int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c , n-1);
    }

    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int m){
        for(int a=0; a<m; a++){
            for(int b=0; b<m-a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(8);
        pattern2(8);
        int a = 0, b =1;
        System.out.println(a);
        System.out.println(b);
        int n = 8;
        printFib(a, b, n-2);
    }
}