package main.usu.Reader;

import main.usu.Person;

import java.util.List;

public class Reader {

    public static final String XML = "xml";
    public static final String JSON = "json";

    private ReaderStrategy readerStrategy;
    private String fileName;

    public Reader(String fileFormat, String fileName) {
        if (fileFormat.equalsIgnoreCase(XML)) {
            readerStrategy = new XmlReaderStrategy();

        } else if (fileFormat.equalsIgnoreCase(JSON)) {
            readerStrategy = new JsonReaderStrategy();
        }
        this.fileName = fileName;
    }

    public List<Person> readRecords() {
        return readerStrategy.readRecords(fileName);
    }
}
