package lesson4;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Денис", "Ламеко", "Александрович", "иженер механик 1 категории",
                296723869, 2400, "denis.22518@gmail.com", 29);
        employee[1] = new Employee("Виктор", "Петров", "Евгеньевич", "иженер",
                296723869, 2500, "deni@gmail.com", 28);
        employee[2] = new Employee("Стас", "Шевченко", "Андреевич", "иженер механик",
                296723869, 2600, "deni18@gmail.com", 27);
        employee[3] = new Employee("Андрей", "Шкут", "Викторович", "иженер механик 2 категории",
                296723869, 2700, "22518@gmail.com", 26);
        employee[4] = new Employee("Елена", "Пузикова", "Васильевич", "механик",
                296723869, 2800, "18@gmail.com", 25);

        System.out.println(employee[1]);
    }

}
