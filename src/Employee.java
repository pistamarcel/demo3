public abstract class  Employee {

    protected String firstname;
    protected String lastname;
    protected int age;
    protected String employmentDate;
    protected int reference;

    abstract double calculateSalary();
    abstract String getName();


    Employee( String firstname, String lastname, int age, String employmentDate){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.employmentDate=employmentDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public int getReference() {
        return reference;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}
