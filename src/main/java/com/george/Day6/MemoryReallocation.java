package com.george.Day6;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MemoryReallocation {
    private ArrayList<List<Integer>> alreadySeen = new ArrayList<>();

    public int partOne(List<Integer> banks) throws IOException {
        List<Integer> banksToAdd = banks;
        int count = 0;

        while (doesNotContainDuplicateMemoryBanks(alreadySeen)) {
            List<Integer> balancedBanks = distributeHighestValueAroundList(banksToAdd);
            banksToAdd = balancedBanks;
            alreadySeen.add(balancedBanks);
            count++;
        }
        return count;
    }

    public int partTwo(List<Integer> banks) throws IOException {
        partOne(banks);

        int lastIndex = alreadySeen.size() - 1;
        List<Integer> duplicateBanks = alreadySeen.get(lastIndex);

        return alreadySeen.lastIndexOf(duplicateBanks) - alreadySeen.indexOf(duplicateBanks);
    }

    public List<Integer> getInputList() throws IOException {
        Scanner infile = new Scanner(new File("src/resources/Day6Input.txt"));
        String input = infile.nextLine();
        return Arrays.stream(input.split("\\s"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    private List<Integer> distributeHighestValueAroundList(List<Integer> banks) {
        int highestValue = Collections.max(banks);
        int indexToReset = banks.indexOf(highestValue);
        int startingIndex = indexToReset + 1;

        List<Integer> listWithoutHighestValue = createNewListWithIndexSetToZero(banks, indexToReset);

        int count = 0;
        for (int i = startingIndex; count < highestValue; i++) {
            if (i >= listWithoutHighestValue.size()) {
                i = 0;
            }
            listWithoutHighestValue.set(i, listWithoutHighestValue.get(i) + 1);
            count++;
        }
        return listWithoutHighestValue;
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
        Set<List<Integer>> noDuplicates = new HashSet<>(list);
        return noDuplicates.size() == list.size();
    }
}
