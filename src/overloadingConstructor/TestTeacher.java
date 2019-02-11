package overloadingConstructor;

public class TestTeacher {
//    Teacher teacher1 = new Teacher();
//    Teacher teacher2 = new Teacher();
//    Teacher teacher3 = new Teacher();
//    Teacher teacher4 = new Teacher();


    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher(" Hamid ", " male ");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher(" John ",  " male ", 27);
        teacher3.displayInformation();
        Teacher teacher4 = new Teacher(" Obama "," male ", 25, 34455555);
        teacher4.displayInformation();


    }
}