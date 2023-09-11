// TASK CODEWARS
// https://www.codewars.com/kata/5e8dd197c122f6001a8637ca/train/java
package pl.jakubmarjankowski.codewars.Duplicates.DuplicatesEverywhere;

import java.util.List;
import java.util.Map;
import java.util.*;

public class Solution {
    public static Map<Integer, List<String>> removeDuplicateIds(Map<Integer, List<String>> obj) {

        Map<Integer, List<String>> treeMap = new TreeMap<>(obj);
        Map<Integer, List<String>> resultMap = new HashMap<>();
        Map<Integer, List<String>> returnMap = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        List<List<String>> listFinish = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String[] splitString;

        for (Map.Entry<Integer, List<String>> entry : treeMap.entrySet()) {
            list.add(entry.getKey());
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }

        splitString = stringBuilder.toString().replaceAll("[\\[\\],]", "").split("\n");
        for (int i = 0; i < splitString.length; i++) {
            for (int k = 0; k < splitString[i].length(); k++) {
                for (int j = i + 1; j < splitString.length; j++) {
                    if (splitString[j].contains(String.valueOf(splitString[i].charAt(k)))) {
                        splitString[i] = splitString[i].replaceAll(String.valueOf(splitString[i].charAt(k)), " ");
                    }
                }
            }
        }

        for (int i = 0; i < splitString.length; i++) {
            splitString[i] = splitString[i].replaceAll(" ", "");
        }

        for (int i = 0; i < splitString.length; i++) {
            List<String> tempList = new ArrayList<>();
            for (int j = 0; j < splitString[i].length(); j++) {
                if (!tempList.contains(String.valueOf(splitString[i].charAt(j)))) {
                    tempList.add(String.valueOf(splitString[i].charAt(j)));
                }
            }
            listFinish.add(tempList);
        }

        for (int i = 0; i < list.size(); i++) {
            resultMap.put(list.get(i), listFinish.get(i));
        }
        for (Map.Entry<Integer, List<String>> entery : obj.entrySet()) {
            returnMap.put(entery.getKey(), resultMap.get(entery.getKey()));
        }
        return returnMap;
    }
}

