package main.usu;

import main.usu.Reader.Reader;
import main.usu.Writer.Writer;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file format (xml/json): ");
        String fileFormat = scanner.next();
        System.out.print("Enter input file name: ");
        String fileName = scanner.next();

        Reader reader = new Reader(fileFormat,fileName);
        List<Person> personList = reader.readRecords();

        Matcher matcher = new Matcher();
        List matchedPersons = matcher.match(personList);

        Writer writer = new Writer();
        writer.write(matchedPersons);
    }
}
