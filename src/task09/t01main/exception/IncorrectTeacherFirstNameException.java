package task09.t01main.exception;

public class IncorrectTeacherFirstNameException extends Exception {

    public IncorrectTeacherFirstNameException(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}

