public class App{
    public static void main(String[] args){
        Table t = new Table(3);
        t.setValue(0,1);
        t.setValue(1,2);
        t.setValue(2,3);

        SelectionPredicate p1 = new EqualTo(1);
        SelectionPredicate p2 = new GreaterThan(2);
        SelectionPredicate p3 = new EqualTo(4);

        System.out.println((t.contains(p1))? "YES": "NO");
        System.out.println((t.contains(p2))? "YES": "NO");
        System.out.println((t.contains(p3))? "YES": "NO");

    }
}
