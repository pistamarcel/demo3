

public class Warehouseman extends Employee {


    @Override
    double calculateSalary() {
        return 2.5* reference;
    }

    @Override
    String getName() {
        return "Angajatul care gestioneaza marfuri se numeste:  " + firstname+ " "+ lastname ;
    }

    public Warehouseman(  String firstname, String lastname, int age, String employmentDate, int reference  ){
        super(firstname,lastname,age, employmentDate);
        this.reference=reference;
    }
}
