package main.usu;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("a", "b", "c","12","34");
        Person person2 = new Person("a", "b", "c","123","34");
        Matcher matcher = new Matcher();
        Boolean isMatching = matcher.match(person1, person2);
        System.out.println(isMatching);
    }
}
