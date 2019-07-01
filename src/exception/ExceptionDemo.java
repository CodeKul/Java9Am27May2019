package exception;

import java.io.IOException;

public class ExceptionDemo {
       String string=new String("");
       static int[] array={1,2,3,4,5};
        private void arithmaticException(){
            try{
                int a=10;
                System.out.println("a : "+(a/0));
            }
            catch (NullPointerException e){
                System.out.println("Number cannot divide by 0");
            }
            catch (ArithmeticException e){
                System.out.println("Number cannot divide by 0");
            }


            System.out.println("Rest of the code");
        }
    static String name="123";
        private  static void nullPointerException() {
            try {
                int length=name.length();
                System.out.println("length : "+length);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

    private  static void numberFormatException() throws IOException {
        try {
            int i= Integer.parseInt(name);
            System.out.println("i : "+i);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    private  static void arrayOutOfBoundException(){
        try {
            System.out.println("array : "+array[6]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Rest of code");
        }
    }

   static void checkThrowKey(){
            throw new ArrayIndexOutOfBoundsException("Array exceed there limit");
        }

    public static void main(String[] args) {
            arrayOutOfBoundException();
    }

}
