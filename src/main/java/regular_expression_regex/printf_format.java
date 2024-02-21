package regular_expression_regex;

public class printf_format {
    /**
     Метод: System.out.printf для вывода данных красиво
     Чтобы данные красиво хранились используй метод format


     System.out.printf(тут пишем как остальные параметры нужно выводить, параметр1, параметр2);
     %[flags][width][.precision]datatype_specifier

     %     datatype_specifier  - обязательные поля

     [flags] - это один символ, обозначающий какую-то характеристику
     (напр. выравнивание:
     -     - выравнивание по левому краю (работают только если задать ширину)
     0     - добавление нулей перед числом
     ,     - разделитель разрядов в числах

     [width] - ширина
     это минимальное кол-во символов, которое будет выделено для нашего текста

     [.precision] - точность
     с помощью него можно округлять дробные числа

     datatype_specifier - c каким типом данных мы работаем?
     b - boolean
     c - char
     s - String
     d - целое число
     f - дробное, десятичное число


                                          Метод format
     String stringFormated = String.format(и то же самое что и в предыдущем)
     */
    public static void main(String[] args) {
        Employee e1 = new Employee(15,"Ksenia", "Smyshliaeva", 564123, 0.5);
        Employee e2 = new Employee(1000,"Masha", "Leonova", 10023, 0.5);
        Employee e3 = new Employee(125,"Nastya", "Ivanova", 2020, 0.15);
        employInfo(e1);
        employInfo(e2);
        employInfo(e3);

        String stringFormated = String.format("%03d \t %-12s \t %-12s \t %,.1f\n",
                e1.id, e1.name, e1.surname, e1.salary*(1+ e1.bonus));
        System.out.println(stringFormated);
    }
        static void employInfo(Employee emp) {
                System.out.printf("%03d \t %-12s \t %-12s \t %,.1f\n",
                emp.id, emp.name, emp.surname, emp.salary*(1+ emp.bonus));

        /* %03d
        d-целые числа,
        3 - три символа для id,
        0 - если id меньше 3х знаков, то впереди добавятся 0 (напр 001)

        %,.1f
        .1 - округление до 1 символа после запятой
        , - разделитель разрядов в числах

         */
        }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonus;

    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
