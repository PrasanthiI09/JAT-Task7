package javatask7;
public class Question3invalidageexception {
    // Method to validate age
    public static void validateAge(int age) throws Exception{
        if (age < 1|| age > 120) {
            // Throw the exception with an appropriate message
            throw new Exception("Invalid age Exception: " + age);
        }
        else {System.out.println("Age is valid -- "+age);}
    }

    public static void main(String[] args) {
        try {
            // Try to validate age
            validateAge(0);
        } catch (Exception e) {
            // Catch the exception and print the error message
            System.out.println(e.getMessage());
        }
    }
}