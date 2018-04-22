package by.it_academy.uniqueWords;

import java.util.Comparator;

public class SymbolAscendingComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int diff = o1.length() - o2.length();
        return diff == 0 ? o1.compareTo(o2) : diff;
    }
}