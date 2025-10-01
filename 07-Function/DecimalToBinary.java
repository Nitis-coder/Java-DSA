public class DecimalToBinary {

    public static void deciToBin(int decimal){
        int mydec=decimal;
        int pow=0;
        int binNum=0;

        while(decimal>0){
            int rem=decimal%2;
            binNum=binNum +(rem * (int)Math.pow(10,pow));
            pow++;
            decimal=decimal/2;
        }
        System.out.println("binary form of "+ mydec +" = "+binNum);
    }
    public static void main(String[] args) {
        deciToBin(12);
    }
    
}