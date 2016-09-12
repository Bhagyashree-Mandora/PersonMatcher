package main.usu;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Reader jsonFileReader = new JsonFileReader();
        List<Person> personList = jsonFileReader.readRecords("test.json");

        Matcher matcher = new Matcher();
        Boolean isMatching = matcher.match(personList);

        MatchWriter fileMatchWriter = new FileMatchWriter("outputFile");
        MatchWriter consoleMatchWriter = new ConsoleMatchWriter();
        fileMatchWriter.write(isMatching);
        consoleMatchWriter.write(isMatching);
    }
}
