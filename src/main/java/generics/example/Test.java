package generics.example;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan",13);
        Schoolar schoolar2 = new Schoolar("Masha",15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Misha", 47);

        //Мы везде в тип данных указываем generics, чтобы нельзя было
        // в команду школьников добавить студентов и т.д
        Team <Schoolar>schoolarTeam = new Team <>("Dragon");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team <Student>studentTeam = new Team <>("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Workers");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team <Schoolar>schoolarTeam2 = new Team <>("Mudrezy");
        Schoolar schoolar3 = new Schoolar("Ivan",14);
        Schoolar schoolar4 = new Schoolar("Masha",19);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
    }

}
