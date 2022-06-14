package string;

import java.util.*;

public class BalancedBrackets {

    private final Map<String, String> brackets = new HashMap<>(){{
        put("{","}");
        put("(",")");
        put("[","]");
    }};

    public boolean solution(String word){

        Stack<String> stack = new Stack<>();

        for (char c : word.toCharArray()){
            String sc = Character.toString(c);

            // push
            if(brackets.containsKey(sc)){
                stack.push(sc);
            }

            // pop
            if (brackets.containsValue(sc)) {
                String pop = stack.pop();
                if(brackets.get(pop).equals(sc) == false){
                    return false;
                }
            }
        }

        return true;
    }

}
