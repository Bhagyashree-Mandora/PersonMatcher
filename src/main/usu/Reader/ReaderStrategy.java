package main.usu.Reader;

import java.util.List;

public interface ReaderStrategy {
    public List readRecords(String fileName);
}
