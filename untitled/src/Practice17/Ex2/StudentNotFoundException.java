package Practice17.Ex2;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String errorMessage) {
            super(errorMessage);
    }
}
