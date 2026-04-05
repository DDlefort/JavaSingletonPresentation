public class Main {
    public static void main(String[] args) {
        School nursing = new School();
        School science = new School();

        System.out.println("Nursing: " + nursing.getSchoolName());
        System.out.println("Science: " + science.getSchoolName());
        System.out.println("Are both references pointing to the same object? " + (nursing == science));
    }
}
