public class App{
    public static void main(String[] args){

        Table t1 = new Table(5);
        Table t2 = new Table(4);
        
        t1.setAll(5);
        t2.setAll(6);
        
        System.out.println("Table 1 is" + (t1.compareTo(t2) == 1? " greater than" : t1.compareTo(t2) == 0? " equal to" : " less than") + " Table 2");
        System.out.println("Table 1 max is" + (Table.MAX_CMP.compare(t1,t2) == 1? " greater than" : Table.MAX_CMP.compare(t1,t2) == 0? " equal to" : " less than") + " Table 2 max");
        System.out.println("Table 1 length is" + (Table.Len_CMP.compare(t1,t2) == 1? " greater than" : Table.Len_CMP.compare(t1,t2) == 0? " equal to" : " less than") + " Table 2 length");
    }
}
