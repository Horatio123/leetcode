package org.beiganshan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/*
A transaction is possibly invalid if:

the amount exceeds $1000, or;
if it occurs within (and including) 60 minutes of another transaction with the same name in a different city.
You are given an array of strings transaction where transactions[i] consists of comma-separated values representing the name, time (in minutes), amount, and city of the transaction.

Return a list of transactions that are possibly invalid. You may return the answer in any order.

 

Example 1:

Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
Output: ["alice,20,800,mtv","alice,50,100,beijing"]
Explanation: The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, have the same name and is in a different city. Similarly the second one is invalid too.
Example 2:

Input: transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
Output: ["alice,50,1200,mtv"]
Example 3:

Input: transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
Output: ["bob,50,1200,mtv"]


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/invalid-transactions
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
