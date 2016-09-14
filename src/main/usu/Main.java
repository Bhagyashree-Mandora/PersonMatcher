package main.usu;

import main.usu.Reader.JsonFileReader;
import main.usu.Reader.Reader;
import main.usu.Writer.ConsoleMatchWriter;
import main.usu.Writer.FileMatchWriter;
import main.usu.Writer.MatchWriter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Reader jsonFileReader = new JsonFileReader();
        List<Person> personList = jsonFileReader.readRecords("test.json");

//        Reader xmlFileReader = new XmlFileReader();
//        xmlFileReader.readRecords("test.xml");
//        Person person1 = new Person("a", "b", "c","12","34");
//        Person person2 = new Person("a", "b", "c","123","34");

        Matcher matcher = new Matcher();
        Boolean isMatching = matcher.match(personList);

        MatchWriter fileMatchWriter = new FileMatchWriter("outputFile");
        MatchWriter consoleMatchWriter = new ConsoleMatchWriter();
        fileMatchWriter.write(isMatching);
        consoleMatchWriter.write(isMatching);
    }
}
