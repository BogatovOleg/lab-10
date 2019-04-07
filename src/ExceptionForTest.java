public class ExceptionForTest {
    void meth1() {
        System.out.println("Вызов метода 1:");
        try {
            int a = 0;
            int b = 0;
            a = 2/b;

        } catch (ArithmeticException e) {
            System.out.println("Исключение типа: Деление на ноль");
        }
    }

    void meth2() {
        System.out.println("Вызов метода 2:");
        try{
            int c[] = {1};
            c[31] = 31;
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение типа: Ошибка индексации в массиве");
        }
    }

    void meth3(int exType) {
        System.out.println("Вызов метода 3:");
        try {
            switch(exType){

                case 0:
                    throw new ArithmeticException();

                case 1:
                    throw new ArrayIndexOutOfBoundsException();

                case 2:
                    throw new ArrayStoreException ();
            }

        } catch(ArithmeticException e) {
            System.out.println("Исключение типа: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение типа: " + e);
        } catch(ArrayStoreException e) {
            System.out.println("Исключение типа: " + e);
        }
    }

    void meth4() {
        System.out.println("Вызов метода 4:");
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println("Исключение типа: "+ e);
        }
    }
}