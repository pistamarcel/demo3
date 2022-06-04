
public class HandlingRisk extends Warehouseman implements EmployeeRisk{

    public HandlingRisk(String firstname, String lastname, int age, String employmentDate, int reference) {
        super(firstname, lastname, age, employmentDate, reference);
    }

    @Override
    public void handleRisk() {
        System.out.println("Gestionez marfuri care implica un risk inalt si beneficiez de un spor extra.");
    }
    @Override
   public double calculateSalary() {
        return 3* reference + monthlyPremium;
    }
}
