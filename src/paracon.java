public class paracon {
    int a;
    int b;
    String str;
    paracon(int c ,  int r , String ch){
        a=c;
        b= r;
        str = ch;
        System.out.println( a +" "+b+" "+str);
    }
    void m1(){
        System.out.println( a +" "+b+" "+str);
    }

    public static void main(String[] args) {
        paracon obj = new paracon(12,23,"anurag");
        obj.m1();
    }
}
//2 times value will be displayed one time by obj and 2nd by creating thorugh class
