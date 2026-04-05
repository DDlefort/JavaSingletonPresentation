public class Main {
    public static void main(String[] args) {
        School nursing = School.getSchool(); //This creates a variable called nursing and stores the School object returned by getSchool().
        School science = School.getSchool(); //This creates another variable called science and stores the School object returned by getSchool().

        System.out.println("Nursing: " + nursing.getSchoolName()); //“This prints the school name from the Nursing variable.”
        System.out.println("Science: " + science.getSchoolName()); //“This prints the school name from the Science variable.”
        System.out.println("Are both references pointing to the same object? " + (nursing == science));
        //“This checks if both variables are pointing to the same School object.”
    }
}
