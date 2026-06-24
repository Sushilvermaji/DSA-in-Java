public abstract class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return ((n & (n-1))==0);
    }
    public static void main(String[] args) {
        boolean isTwo = isPowerOfTwo(3);

        if(isTwo==true){
            System.out.println("Yes power of two");
        }
        else{
            System.out.println("Not power of two");
        }
    }
}
