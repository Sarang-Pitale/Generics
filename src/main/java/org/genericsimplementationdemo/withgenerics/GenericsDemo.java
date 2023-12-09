package src.main.java.org.genericsimplementationdemo.withgenerics;

public class GenericsDemo {
    public static void main(String[] args) {
        Pair<String> person=new Pair<>("Ram","Shyam");
        Pair<Integer> age=new Pair<>(10,12);
        System.out.println("Age of "+person.getFirst()+" is "+age.getFirst());
        System.out.println("Age of "+person.getSecond()+" is "+age.getSecond());

    }
}
