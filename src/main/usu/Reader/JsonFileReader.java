package main.usu.Reader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import main.usu.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonFileReader implements Reader {

    @Override
    public List<Person> readRecords(String fileName) {
        Gson gson = new Gson();
        List<Person> personList = null;
        try {
            personList = gson.fromJson(new FileReader(fileName), new TypeToken<List<Person>>(){}.getType());
            personList.forEach(x -> System.out.println("here: " + x));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personList;
    }
}
