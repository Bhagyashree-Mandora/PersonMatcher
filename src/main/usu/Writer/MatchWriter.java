package main.usu.Writer;

import main.usu.PersonsPair;
import java.util.List;

public interface MatchWriter {
    boolean write(List<PersonsPair> matchingPersonsPair);
}
