public class UpdateBit{
    public static int clearIthBit(int n,int i){
        int bitmask = ~(1<<i);

        return n & bitmask;
    }
    public static int setIthBit(int n,int i){
        int bitmask = 1<<i;
         return n|bitmask;
    }
    public static void updateIthBit(int n, int i , int newBitMask){
        if(newBitMask==0){
            clearIthBit(n, i);
        }
        else{
            setIthBit(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}