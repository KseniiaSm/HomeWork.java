package nested_classes.local_inner_class;

/**
 Локальные внутренние классы не являются элементами класса,
 а являются элементами какого-то блока кода (метода, конструктора)

 + Local inner class располагается в блоках кода таких, как например метод или конструктор

 + Local inner class не может быть static

 + область видимости Local inner class - это блок, в котором он находится

 + Local inner class может обращаться даже к прайват элементам внешнего класса

 + Local inner class может обращаться к элементам блока, в котором он написан при условии, что
 они final или effectively final
 (т.е. нельзя переменную, которую мы используем в Local inner class менять (т.е. мы ее должны задать
 и оставить или сделать final)
 */
public class Local_inner_class {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}

class Math {
    public void getResult() {
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int chastnoe() {
                return delimoe/delitel;
            }

            public int ostatoc() {
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(10);
        delenie.setDelitel(3);
        System.out.println("Делимое: " + delenie.getDelimoe());
        System.out.println("Делитель: " + delenie.getDelitel());
        System.out.println("Частное: " + delenie.chastnoe());
        System.out.println("Остаток: " + delenie.ostatoc());
    }
}
