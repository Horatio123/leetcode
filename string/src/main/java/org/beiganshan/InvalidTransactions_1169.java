package org.beiganshan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InvalidTransactions_1169 {
    public List<String> invalidTransactions(String[] transactions) {

        HashSet<Integer> set = new HashSet<>();

        int size = transactions.length;
        String[] names = new String[size];
        String[] times = new String[size];
        String[] amounts = new String[size];
        String[] cities = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = transactions[i].split(",")[0];
            times[i] = transactions[i].split(",")[1];
            amounts[i] = transactions[i].split(",")[2];
            cities[i] = transactions[i].split(",")[3];

        }



        for (int i = 0; i < transactions.length - 1; i++) {
            for (int j = i + 1; j < transactions.length; j++) {
                int timeDiff = Math.abs(Integer.parseInt(times[i]) - Integer.parseInt(times[j]));
                if ((names[i].equals(names[j])) && (timeDiff <= 60) && !cities[i].equals(cities[j])) {
                    set.add(i);
                    set.add(j);
                }

                if (Integer.parseInt(amounts[i]) > 1000) {
                    set.add(i);
                }

                if (Integer.parseInt(amounts[j]) > 1000) {
                    set.add(j);
                }

            }
        }

        List<String> ll = new ArrayList<>();
        for (int i: set) {
            ll.add(transactions[i]);
        }

        return ll;
    }

}
