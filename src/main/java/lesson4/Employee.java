package lesson4;

public class Employee {
    private String firstName;
    private String lastName;
    private String surname;
    private String jobTitle;
    private int numberPhone;
    private int salary;
    private String email;
    private int age;

    public Employee(String firstName, String lastName, String surname, String jobTitle, int numberPhone, int salary, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "имя: " + firstName + '\'' +
                ", фамилия: " + lastName +
                ", отчество: " + surname +
                ", должность: " + jobTitle +
                ", номер телефона: " + numberPhone +
                ", ЗП: " + salary +
                ", email: " + email +
                ", возраст: " + age;
    }
}
