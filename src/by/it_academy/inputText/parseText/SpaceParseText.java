package by.it_academy.inputText.parseText;

import java.util.Arrays;
import java.util.List;

public class SpaceParseText implements ParseText {
    @Override
    public List<String> handle(String text) {
        return Arrays.asList(text.split(" "));
    }
}
