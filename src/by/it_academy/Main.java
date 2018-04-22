package by.it_academy;

import by.it_academy.inputText.ConsoleInputText;
import by.it_academy.inputText.InputText;
import by.it_academy.inputText.parseText.ParseText;
import by.it_academy.inputText.parseText.SpaceParseText;
import by.it_academy.search.MentionListCreator;
import by.it_academy.search.Search;
import by.it_academy.search.WordNotFoundException;
import by.it_academy.search.WordSearch;
import by.it_academy.uniqueWords.UniqueWords;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        InputText inputText = new ConsoleInputText();
        String str = inputText.readText();
        inputText.showInputText();
        ParseText parseText = new SpaceParseText();
        List<String> words = parseText.handle(str);
        UniqueWords uniqueWords = new UniqueWords(words);
        uniqueWords.showUniqueWords();
        MentionListCreator mentionListCreator = new MentionListCreator(words, uniqueWords.getWordsListSet());
        Map<String, Integer> mentionList = mentionListCreator.toMentionList();
        Search searching = new WordSearch(mentionList);
        try {
            searching.inputWordToSearch();
            searching.showMentionQuantity();
        } catch (WordNotFoundException e) {
            e.printStackTrace();
        }
    }
}