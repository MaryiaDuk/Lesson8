package by.it_academy.search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MentionListCreator {
    private List<String> stringList;
    private Set<String> uniqueStringSet;

    public MentionListCreator(List<String> stringList, Set<String> uniqueStringList) {
        this.stringList = stringList;
        this.uniqueStringSet = uniqueStringList;
    }

    public Map<String, Integer> toMentionList() {
        int frequency;
        Map<String, Integer> hashMap = new HashMap();
        for (String uniqueWord : uniqueStringSet) {
            frequency = 0;
            for (String word : stringList) {
                if (uniqueWord.equals(word)) frequency++;
            }
            hashMap.put(uniqueWord, frequency);
        }
        return hashMap;
    }
}