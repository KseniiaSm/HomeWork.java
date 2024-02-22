package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@MyAnnotation
public class Employee {
    String name;
    double salary;

    @MyAnnotation
    public Employee(String name, @MyAnnotation double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotationForMethodsAndConstructors
    void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/* Создание аннотации
просто пишем
@interface название

@interface MyAnnotation {
}

аннотация может быть пустая или с информацией

аннотацию можно вставить в совершенно любое место кода (перед классом, методом, конструктором,
переменной)
 */
@interface MyAnnotation {
}

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@interface MyAnnotationForMethodsAndConstructors {
}

