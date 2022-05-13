package string;

import java.util.stream.Collectors;

public class UniqueCharacters {

    /**
     * Check if given string has all unique characters.
     * @param word
     * @return true if all characters are unique.
     * @return false if any repeated character.
     */
    public boolean solution(String word){


        String distinctWord = word
                .chars()

                // Cast IntStream to char
                .mapToObj(c -> (char) c)

                // remove all duplicates
                .distinct()

                // Map stream to string
                .map(String::valueOf)
                .collect(Collectors.joining());

        return word.equals(distinctWord);

    }

}
