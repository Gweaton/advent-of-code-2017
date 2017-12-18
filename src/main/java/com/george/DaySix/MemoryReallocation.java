package com.george.DaySix;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MemoryReallocation {


    public int partOne(List<Integer> banks) throws IOException {
        ArrayList<List<Integer>> alreadySeen = new ArrayList<>();
        List<Integer> bankToAdd = banks;
        int count = 0;

        while (doesNotContainDuplicateMemoryBanks(alreadySeen)) {
            Integer highestValue = Collections.max(bankToAdd);
            int indexToReset = bankToAdd.indexOf(highestValue);
            int startingIndex = indexToReset + 1;
            List<Integer> highestValueRemoved = createNewListWithIndexSetToZero(bankToAdd, indexToReset);
            List<Integer> distributedValues = distributeHighestValueAroundList(highestValueRemoved, highestValue, startingIndex);
            bankToAdd = distributedValues;
            alreadySeen.add(distributedValues);
            count++;
        }

        return count;
    }

    public List<Integer> getInputList() throws IOException {
        Scanner infile = new Scanner(new File("src/resources/daySixInput.txt"));
        String input = infile.nextLine();
        return Arrays.stream(input.split("\\s"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    private List<Integer> distributeHighestValueAroundList(List<Integer> banks, int value, int startingIndex) {
        int count = 0;
        for (int i = startingIndex; count < value; i++) {
            if (i >= banks.size()) {
                i = 0;
            }
            banks.set(i, banks.get(i) + 1);
            count++;
        }
        return banks;
    }

    private List<Integer> createNewListWithIndexSetToZero(List<Integer> banks, int index) {
        List<Integer> resetList = new ArrayList<>();
        for (int i = 0; i < banks.size(); i++) {
            Integer value = (i == index) ? 0 : banks.get(i);
            resetList.add(value);
        }
        return resetList;
    }

    private boolean doesNotContainDuplicateMemoryBanks(List<List<Integer>> list) {
        Set<List<Integer>> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}
