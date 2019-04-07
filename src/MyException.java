import java.util.Date;

public class MyException extends Exception {
    Date throwDate;

    MyException() {
        throwDate = new Date();
    }

    public String toString(){
        return "MyException" + throwDate;
    }

}