package overriding_hiding_final;

public class Biding {
    /**
     * Binding - определение вызываемого метода, основываясь на объекте,
     * который производит вызов или тип данных reference variable
     *
     1. Compile time binding:
     для static, final и private методов (т.к. они не могут быть перезаписаны
     у них все ясно (какой конкретно метод будет вызван) на этапе компиляции (компилятор видит)

     2. Run time binding
     это для остальных объектов и методов (напр. для тех что имеют тип данных переменной суперкласса,
     а тип данных объекта - сабкласс
     напр.
     Employee1 employee1 = new Teacher1();
     т.е. для такого объекта на этапе запуска программы решается какой метод будет применен
     */
}
