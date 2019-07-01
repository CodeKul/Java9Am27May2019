package innerclasses;

import abstraction.AbsractDemo;
public class AnnonymousInnerClass {



    public static void main(String[] args) {

        AbsractDemo demo=new AbsractDemo() {
            @Override
            protected int add(int a, int b) {
                return 0;
            }

            @Override
            public int sub(int a, int b) {
                return 0;
            }
        };
        demo.sub(10,20);

    }

}
