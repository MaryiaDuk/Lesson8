package by.it_academy.uniqueWords;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    private Set<String> wordsListSet;

    public UniqueWords(List<String> words) {
        wordsListSet = new TreeSet<>(new SymbolAscendingComparator());
        wordsListSet.addAll(words);
    }

    public Set<String> getWordsListSet() {
        return wordsListSet;
    }

    public void showUniqueWords() {
        System.out.println("Уникальные слова:");
        for (String word : wordsListSet)
            System.out.println(word);
    }
}