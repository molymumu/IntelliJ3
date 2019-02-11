package overloadingConstructor;

public class Teacher {
    String Name, Gender;
    int Age;
    int PhoneNumber;


    Teacher() {
        System.out.println("No information");
    }

    Teacher(String n, String G) {
        Name = n;
        Gender = G;

    }

    Teacher(String n, String G, int Y) {

        Name = n;
        Gender = G;
        Age = Y;
    }

    Teacher(String n, String G, int y, int p) {

        Name = n;
        Gender = G;
        Age = y;
        PhoneNumber = p;
    }


    void displayInformation() {
System.out.println("Name"+Name);
        System.out.println("Gender"+Gender);
        System.out.println("Age"+Age);
        System.out.println("PhoneNumber"+PhoneNumber);
    }
}