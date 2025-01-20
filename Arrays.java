

public  class Arrays {
        public static void main(String[] args) {
              int arr [] = new int[5];
              System.out.println(arr); // by defauly garbage value use
              System.out.println(arr[0]); // by defauly for every single element by default valeue is 0
            //   System.out.print(arr[5]); // our of bond exception occurs
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;
            System.out.println(arr[4]);

              int arr2[] =  new int[]{1,2,3,4,5};
              System.out.println(arr2[0]);
              System.out.println(arr2.length);
              if(arr.length == 5){
                System.out.println("Length is 5");
              }else{
                System.out.println("Not 5");
              }
              String names [] =  new String[]{"Samad", "Gufran", "Vishnu"};
              System.out.println(names[0]);
              
        }
}