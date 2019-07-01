package keywords;

final public class FinalDemo {

     final int a;

    public FinalDemo(int b) {
        a=b;
    }

    final void checkFinal(){

        this.add();
    }

    void add(){
        System.out.println("a : "+a);
    }

    public static void main(String[] args) {
        FinalDemo demo=new FinalDemo(10);
        new FinalDemo(20);
        demo.checkFinal();


    }

}
