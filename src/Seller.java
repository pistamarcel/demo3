public class Seller extends Employee {
 private double fixPart= 0.2 * 150;

    @Override
   public double calculateSalary() {
        return fixPart + reference;
    }

    @Override
    public String getName() {

        return "Vanzatorul se numeste:  " + firstname+ " "+ lastname ;
    }

    Seller(  String firstname, String lastname, int age, String employmentDate, int reference  ){
        super(firstname,lastname,age, employmentDate);
        this.reference=reference;
    }

}
