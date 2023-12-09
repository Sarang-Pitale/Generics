package src.main.java.org.withoutgenerics;

public class Main {
    public static void main(String[] args) {
        StringPair person=new StringPair("Ram","Shyam");
        IntegerPair age=new IntegerPair(10,12);
        System.out.println("Age of "+person.getFirst()+" is "+age.getFirst());
        System.out.println("Age of "+person.getSecond()+" is "+age.getSecond());

    }
}
