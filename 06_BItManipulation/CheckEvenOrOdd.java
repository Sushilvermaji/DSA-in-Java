public class CheckEvenOrOdd {
    public static void evenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) ==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(5);
        evenOrOdd(4);
    }
}
