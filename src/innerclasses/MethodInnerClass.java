package innerclasses;

public class MethodInnerClass {

   private String display(){
       String password="donotshare";
       return password;
    }


    void checkMethodInnerClass(){

        class InnerClass{

            void showData(){
                System.out.println("password : "+display());
            }

        }

        InnerClass innerClass=new InnerClass();
        innerClass.showData();

    }

    public static void main(String[] args) {
        new MethodInnerClass().checkMethodInnerClass();
    }
}
