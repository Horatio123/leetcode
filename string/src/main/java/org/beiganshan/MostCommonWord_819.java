package org.beiganshan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord_819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();
        paragraph += ' ';

        int count;
        int most = 0;
        String ans = "";
        StringBuilder sb = new StringBuilder();
        for (Character c: paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (sb.length() > 0) {
                String word = sb.toString();
                if (!set.contains(word)) {
                    count = map.getOrDefault(word, 0);
                    map.put(word, count + 1);
                    if (count + 1 > most) {
                        ans = word;
                        most = count;
                    }

                }
                sb = new StringBuilder();

            }
        }
        return ans;
    }
}
