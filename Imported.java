class Imported {
    public static void main(String[] args) {
        Test myObj = new Test(32);
        System.out.println(String.format("Test age from the other class: %d", myObj.age));

        // create an object of the Student class (which inherits attributes and methods from Abstract)
        Student myStud = new Student();

        System.out.println("Name: " + myStud.fname);
        System.out.println("Age: " + myStud.age);
        System.out.println("Graduation Year: " + myStud.graduationYear);
        myStud.study(); // call abstract method
        }
  }