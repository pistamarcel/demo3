public class TechnicianRisk extends Tehnician implements EmployeeRisk {

    @Override
    public void handleRisk() {
        System.out.println("Lucrez intr-un mediu cu risk inalt si beneficiez de un salariu extra.");
    }
    @Override
    public double calculateSalary() {
      return  2.5 * reference + monthlyPremium;
    }

    public TechnicianRisk(String firstname, String lastname, int age, String employmentDate, int reference) {
        super(firstname, lastname, age, employmentDate, reference);
    }
}
