package exceptoionHandling;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class InvalidAge extends Exception {
    public InvalidAge(String mess) {
        super(mess);
    }
}

public class CustomException {

    public static void validatAge(int age) throws InvalidAge {
        if (age <= 18) {
            throw new InvalidAge("Age must be greater than 18");

        }


    }


    public static void main(String[] args) {

        try {
            throw new MyException("Custom Exception");

        } catch (MyException e) {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }

        try {
            validatAge(18);
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}
