public class Tehnician extends Employee {


    @Override
   public double calculateSalary() {
        return 2 * reference;
    }

    @Override
     public String getName() {
        return  "Tehnicianul se numeste:  " + firstname+ " "+ lastname ;
    }

    Tehnician(  String firstname, String lastname, int age, String employmentDate, int reference  ){
        super(firstname,lastname,age, employmentDate);
        this.reference=reference;
    }
}


