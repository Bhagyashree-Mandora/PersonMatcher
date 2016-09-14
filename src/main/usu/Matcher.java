package main.usu;

import java.util.List;

public class Matcher {

    public Boolean match(List<Person> personList) {

        for (int i = 0; i < personList.size() - 1; i++) {
            Person person1 = personList.get(i);
            for (int j = i + 1; j < personList.size(); j++) {
                Person person2 = personList.get(j);


            }
        }
        return false;
    }
}

