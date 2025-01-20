public  class  switchcase {
      public static void main(String[] args) {
             char  alphabet = 'p';

             // we can pass byte,short,int,char,String,enums accpeted only
             switch(alphabet) {
               case 'a': System.out.println("wovel");
               break;

               case 'e': System.out.println("wovel");
               break;

               case 'i': System.out.println("wovel");
               break;

               case 'o': System.out.println("wovel");
               break;

               case 'u': System.out.println("wovel");
               break;

               default:  System.out.println("Consonants not Supported");
            }
        }
}