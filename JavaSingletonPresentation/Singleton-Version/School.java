public class School {
    private static School sharedSchool; //private: only this class can access it directly. static: it belongs to the class itself, not to one object
    // School is the type and sharedSchool is the variable.
    private String schoolName; // String is the text type, schoolName variable that store the name of the school.

    private School() { /*“This constructor builds the School object, but only this class is allowed to use it.”*/
        schoolName = "Tulsa Community College";
        System.out.println("School object created.");
    }

    public static School getSchool() { //“This method gives the program the shared School object.”
        if (sharedSchool == null) {
            sharedSchool = new School(); // This is the line that actually creates the one object.
        }
        return sharedSchool;
    }

    public String getSchoolName() { //“This class has a method called getSchoolName() that will return the school name.”
        return schoolName; //Give back the value stored in schoolName.
    }
}
