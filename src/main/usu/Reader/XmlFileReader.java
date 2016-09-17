package main.usu.Reader;

import main.usu.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.util.List;

public class XmlFileReader implements Reader {

    @Override
    public List<Person> readRecords(String fileName) {
        try {
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Unmarshaller unMarshaller = null;
            unMarshaller = context.createUnmarshaller();
            Person person = (Person) unMarshaller.unmarshal(new FileInputStream(fileName));
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
