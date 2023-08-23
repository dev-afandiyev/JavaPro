package employee;

public class Employee {

    private String firstName;
    private String lastName;
    private String middleName;

    private String jobTitle;

    private String email;

    private String phoneNumber;

    private int age;

    public Employee(String firstName, String lastName, String middleName, String jobTitle, String email, String phoneNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public void getInfo() {
        System.out.println(
                "Employee{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", middleName='" + middleName + '\'' +
                        ", jobTitle='" + jobTitle + '\'' +
                        ", email='" + email + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", age=" + age +
                        '}');
    }

}
