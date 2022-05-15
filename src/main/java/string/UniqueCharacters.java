package string;

import java.util.stream.Collectors;

public class UniqueCharacters {

    /**
     * Returns a boolean to indicate if all characters inside are unique.
     * @param word
     * @return True if all characters are unique, otherwise false.
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
