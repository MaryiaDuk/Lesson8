package by.it_academy.search;

import java.util.Map;
import java.util.Scanner;

public class WordSearch implements Search {
    private Map<String, Integer> mentionMap;
    private String searchWord;
    private int frequency;

    public WordSearch(Map<String, Integer> mentionMap) {
        this.mentionMap = mentionMap;
    }

    @Override
    public void inputWordToSearch() throws WordNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для поиска: ");
        searchWord = scanner.nextLine();
        if (!mentionMap.containsKey(searchWord)) throw new WordNotFoundException("Не найдено!!!");
        frequency = mentionMap.get(searchWord);
    }

    @Override
    public void showMentionQuantity() {
        System.out.println("Слово " + searchWord + " встречается " + frequency + " раз.");
    }
}
