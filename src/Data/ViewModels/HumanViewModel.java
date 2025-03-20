package Data.ViewModels;

public class HumanViewModel {
    private int genderCode;
    private int age;
    private String lastName;

    public HumanViewModel(int genderCode, int age, String lastName) {
        this.genderCode = genderCode;
        this.age = age;
        this.lastName = lastName;
    }

    public int getGenderCode() {
        return genderCode;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }
}
