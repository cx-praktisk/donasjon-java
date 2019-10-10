package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

class FileReader {

    List<String> readDictionary(String filpath) throws IOException {
        return List.copyOf((Files.readAllLines(Paths.get(filpath))));
    }

    public void validateInputLines(List<String> inputlines) {
        if (inputlines.isEmpty()) {
            throw new IllegalArgumentException("Det er ingen donasjoner å summere opp");
        }
    }
}
