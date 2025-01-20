public class datatypes {
      public static void main(String [] args){
        short shortNum = 12300;
        byte byteNum =  123;
        int num = 100000000;
        int num2 = -10000000;
        long bigNum = 1000000000000000000L;
        float num1 = 123.4f; //9 bytes 7 decimal digits precision
        double num3 = 123; // 8 bytes 15/16 decimal digits precision

        float fnum = 123456789.123456789f;
        double dnum = 123456789.123456789;
        System.out.println(fnum);
        System.out.println(dnum);
        System.out.println(((Object) fnum).getClass().getSimpleName());
        System.out.println(((Object) dnum).getClass().getSimpleName());
        

        boolean holiday = false;
        char Alphabet = 's';
        System.out.println("Boolean data type"+ holiday+ "Charcater data type "+ Alphabet);
        
      }
}
