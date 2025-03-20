package Models;

public class Human {
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

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }
}
