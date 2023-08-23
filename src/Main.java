import car.Car;
import employee.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(
                "Anastasia",
                "Timoshevskaya",
                "Vasilievna",
                "Tattoo Master",
                "anastasia@gmail.com",
                "+380635422321",
                20
        );
        employee.getInfo();

        //todo: as far as I remember, the java compiler can swear when you have two classes
        // with the same name in different packages, and we try to use them without specifying the full name.
        // Please correct me if not.
        foldera.SameName sameNameA = new foldera.SameName();
        folderb.SameName sameNameB = new folderb.SameName();

        Car car = new Car();
        car.start();

    }

}