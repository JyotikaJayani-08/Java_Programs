
class datatypes{
    public static void main(String[] args) {
    double  num1=99.9;
    float num2=23.7f;
    char c='j';
    short sh=567;
    long l=2345l;
    byte by=127;  //maximun value you can accomodate
    boolean b=true;
    System.out.println(b);
    System.out.println(by);
    System.out.println(sh);
    System.out.println(l);
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(c);
    

}
}
// 1. Real values are treated as double by default. We have to explicitly specify float value. 
// (Ex.: double d = 5.6 --> no error ;  float f = 5.6 --> error)

// 2. Only 'true' and 'false' are treated as boolean.
// (Ex.: if(true) --> no error ; if(1) --> error)
