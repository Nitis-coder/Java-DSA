public class BinayToDecimal {

    public static void binToDec(int binary){
        int mybin=binary;
        int pow=0;
        int decimal=0;
        while(binary>0){
            int lastDigit =binary%10;
            decimal=decimal+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binary=binary/10;
        }
        System.out.println("Decimal of "+mybin + " = "+decimal);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
