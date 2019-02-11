package overloadingConstructor;

public class Student extends Teacher{
   String name, gender;
   int phone;

   Student() {
      System.out.println("Nothing");
   }
   Student(String n, String g){
      name=n;
      gender=g;
}
   Student(String n, String g, int p) {
      name = n;
      gender = g;
      phone = p;
   }
      void displayInformation(){
         System.out.println("Name" +name);
         System.out.println("Gender" +gender);
         System.out.println("Phone" + phone);
   }
   }
