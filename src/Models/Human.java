package Models;

public class Human implements GenericAbstractInterface {
    public enum Gender {
        MALE, FEMALE
    }

    private Gender gender;
    private int age;
    private String lastName;

    public Human(Gender gender, int age, String lastName) {
        this.gender = gender;
        this.age = age;
        this.lastName = lastName;
    }

    public Human() { }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 0) throw new IllegalArgumentException();
        this.age = age;
    }

    public void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null || lastName.isBlank())
            throw new IllegalArgumentException();
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
