package lambda;

public class Test1 {
    static void def(Test2 t){
        System.out.println(t.abc("privet", "poka"));
    }

    public static void main(String[] args) {
        def((x,y)->(x.length()+y.length()));
        //или
        def((String x, String y)->(x.length()+y.length()));
        //или
        def((String x, String y)->{return (x.length()+y.length());});
        //или
        def((x,y)->x.length());
    }

}

interface Test2{
    int abc(String s1, String s2);
}
