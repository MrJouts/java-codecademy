public class Dog {
    // instance field
    String breed;
    // constructor method
    public Dog(String dogBreed) {
    /*
    value of parameter dogBreed
    assigned to instance field breed
    */
        breed = dogBreed;
    }
    public static void main(String[] args) {
    /*
    create instance:
    use 'new' operator and invoke constructor
    */
        Dog fido = new Dog("poodle");
    /*
    fields are accessed using:
    the instance name, `.` operator, and the field name.
    */
        fido.breed;
        // "poodle"
    }
}