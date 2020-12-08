public class FlourPackChallenge {
    public static void main (String[] args){
        System.out.println(canPack(1,5,11));
    }
    public static boolean canPack(int big, int small, int goal){
        for (int i=0;i<=big;i++){
            for (int j =0; j<=small;j++){
                if (goal== (i*5)+(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
