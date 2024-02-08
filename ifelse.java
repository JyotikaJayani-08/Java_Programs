public class ifelse {
    public static void main(String[] args) {
        // int x=12;
        // if(x>10 && x<20) //false and true can be used as well 
        // System.out.println("Hello");
        // else
        //   System.out.println();
        int x=10;
        int y=20;
        // if(x>y){
        //  System.out.println(x);
        //  System.out.println("Thank you");
        // }
        // else 
        //  System.out.println(y);
        int z=45;
        if(x>y && x>z){
            System.out.println(x);
        }
        else if(y>x && y>z){
            System.out.println(y);

        }
        else
          System.out.println(z);
        //   TERNARY OPERATOR  ?:
        int n=4;
        int r=0;
        r = n%2 == 0?10:20;
        System.out.println(r);




    }    
}
