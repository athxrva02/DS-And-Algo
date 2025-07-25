package dsajava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<List<String>> wordGroups = groupWords(words, maxWidth);

        return IntStream.range(0, wordGroups.size())
                .mapToObj(i -> {
                    List<String> group = wordGroups.get(i);
                    boolean isLastLine = (i == wordGroups.size() - 1);
                    return isLastLine ? leftJustify(group, maxWidth) : fullJustifyLine(group, maxWidth);
                })
                .toList();
    }

    private List<List<String>> groupWords(String[] words, int maxWidth) {
        List<List<String>> groups = new ArrayList<>();
        List<String> currentGroup = new ArrayList<>();
        int currentLength = 0;

        for (String word : words) {
            // Check if adding this word would exceed maxWidth
            int neededLength = currentLength + word.length() + (currentGroup.isEmpty() ? 0 : 1);

            if (neededLength > maxWidth) {
                // Start new group
                groups.add(new ArrayList<>(currentGroup));
                currentGroup.clear();
                currentGroup.add(word);
                currentLength = word.length();
            } else {
                // Add to current group
                currentGroup.add(word);
                currentLength = neededLength;
            }
        }

        // Add the last group
        if (!currentGroup.isEmpty()) {
            groups.add(currentGroup);
        }

        return groups;
    }

    private String leftJustify(List<String> words, int maxWidth) {
        String joined = String.join(" ", words);
        return joined + " ".repeat(maxWidth - joined.length());
    }

    private String fullJustifyLine(List<String> words, int maxWidth) {
        if (words.size() == 1) {
            return leftJustify(words, maxWidth);
        }

        int totalWordLength = words.stream().mapToInt(String::length).sum();
        int totalSpaces = maxWidth - totalWordLength;
        int gaps = words.size() - 1;
        int spacesPerGap = totalSpaces / gaps;
        int extraSpaces = totalSpaces % gaps;

        return IntStream.range(0, words.size())
                .mapToObj(i -> {
                    if (i == words.size() - 1) {
                        return words.get(i); // Last word, no spaces after
                    }

                    int spaces = spacesPerGap + (i < extraSpaces ? 1 : 0);
                    return words.get(i) + " ".repeat(spaces);
                })
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        TextJustification tj = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> result = tj.fullJustify(words, 16);

        result.forEach(line -> System.out.println("\"" + line + "\""));
    }
}