import java.util.Comparator;

public class Person implements Comparable <Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        firstName =null;
        lastName = null;
        age = 0;
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 18;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return "Person(" + firstName + "," + lastName + "," + age + ")";
    }
    public int compareTo(Person o) {

        int lastNameCheck = this.getLastName().compareToIgnoreCase(o.getLastName());
        int firstNameCheck = this.getFirstName().compareToIgnoreCase(o.getFirstName());
        int ageCheck = Integer.compare(this.age, o.age);

        if (lastNameCheck != 0) {
            return lastNameCheck; }
        else if (firstNameCheck != 0 ) {
            return firstNameCheck;
        }
        else {
            return ageCheck;
        }
    }
  }