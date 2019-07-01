package innerclasses;

public class MemberInnerClass {

    private String name = "Codekul";

    private void checkInnerClass() {
        System.out.println("inside member inner");
    }

    class CheckMember {

        void checkMember() {
            checkInnerClass();
            System.out.println("Inside check member");
        }


    }
    public static void main(String... args) {

     /*   MemberInnerClass innerClass = new MemberInnerClass();
        MemberInnerClass.CheckMember checkMember=innerClass.new CheckMember();
        checkMember.checkMember();*/

        MethodInnerClass methodInnerClass=new MethodInnerClass();
        methodInnerClass.checkMethodInnerClass();
    }


}
