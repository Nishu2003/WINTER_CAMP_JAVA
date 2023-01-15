import java.lang.Math;
 
class pow {
 
    // Function to calculate N raised to the power P
    static double power(int N, int P)
    {
        return Math.pow(N, P);
    }
 
    public static void main(String[] args)
    {
        int N = 2;
        int P = 3;
 
        System.out.println(power(N, P));
    }
}
