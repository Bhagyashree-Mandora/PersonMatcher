package main.usu;

import main.usu.Reader.JsonFileReader;
import main.usu.Reader.Reader;
import main.usu.Reader.XmlFileReader;
import main.usu.Writer.ConsoleMatchWriter;
import main.usu.Writer.FileMatchWriter;
import main.usu.Writer.MatchWriter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Reader jsonFileReader = new JsonFileReader();
        List<Person> personList = jsonFileReader.readRecords("test.json");

//        Reader xmlFileReader = new XmlFileReader();
//        List<Person> personList = xmlFileReader.readRecords("test.xml");

        Matcher matcher = new Matcher();
        List matchedPersons = matcher.match(personList);

        System.out.println(matchedPersons.toString());

        MatchWriter fileMatchWriter = new FileMatchWriter("outputFile");
        MatchWriter consoleMatchWriter = new ConsoleMatchWriter();
        fileMatchWriter.write(matchedPersons);
        consoleMatchWriter.write(matchedPersons);
    }
}
