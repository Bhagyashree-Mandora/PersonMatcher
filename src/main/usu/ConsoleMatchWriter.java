package main.usu;

public class ConsoleMatchWriter implements MatchWriter {
    @Override
    public boolean write(Boolean isMatching) {
        System.out.println(isMatching);
        return true;
    }
}
