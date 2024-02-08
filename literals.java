 class literals {
    public static void main(String[] args) {
    int num1=0b101;
    int num2=0x7E;
    int num3=10_00_00_00_00;
    char c='a';
    c++;
    System.out.println(c);
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    // Type Conversion & Casting
    byte b=127;
    int a=b;
     System.out.println(a);
     int s=257;
     byte k=(byte)s;
      System.out.println(k);
      float f=33.3f;
      int t=(int)f;
       System.out.println(t);
    //    Type promotions
    byte p=30;
    byte q=20;
    int pro=p*q;
     System.out.println(pro);

}
}
