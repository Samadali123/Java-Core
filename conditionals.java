
public class conditionals {

    public static void main(String[] args) {

        // if else conditional
        boolean sunday = true;
        if (sunday) {
            System.out.println("Play cricket with bhoiss");
        } else {
            System.out.println("Study");
        }

        /**
         * here you can write a multi line comments in java
       *
         */
        // multiple conditions
        String day = "monday";

        if (day.equals("monday")) {
            System.out.println("Monday");
        } else if (day.equals("tuesday")) {
            System.out.println("Tuesday");
        } else if (day.equals("wednesday")) {
            System.out.println("Wednesday");
        } else if (day.equals("thursday")) {
            System.out.println("Thursday");
        } else {
            System.out.println("Unknown day");
        }

       // nested conditions
       boolean sheAgreed = true;
       if(sheAgreed){
              boolean readyForDinner = true;
              if(readyForDinner){
                System.out.println("dinner ki line");
              }  else{
                  boolean readyForChai = true;
                  if(readyForChai){
                    System.out.println("CHai ready");
                  }else{
                    System.out.println("rehendo beta chai bhi nhi pi paye");
                  }
              }
       }    
       else{
        System.out.println("Jao jake doosti patao.");
       }

    }
}
