public class Main {
    public static void main(String[] args) {
        ExceptionForTest exTest = new ExceptionForTest();
        exTest.meth1();
        exTest.meth2();
        exTest.meth3(1);
        exTest.meth3(2);
        exTest.meth3(0);
        exTest.meth4();
    }
}
