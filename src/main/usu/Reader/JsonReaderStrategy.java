package main.usu.Reader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import main.usu.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonReaderStrategy implements ReaderStrategy {

    @Override
    public List<Person> readRecords(String fileName) {
        Gson gson = new Gson();
        List<Person> personList = null;
        try {
            personList = gson.fromJson(new FileReader(fileName), new TypeToken<List<Person>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personList;
    }
}
