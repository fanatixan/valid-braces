package hu.javadev.xpfarm.validbraces;

import java.util.Map;

public class BraceChecker {

    private static final Map<Character, Character> BRACE_PAIRS = Map.of(
            '(', ')',
            '[', ']'
    );

    public boolean isValid(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        return isValidClosing(input.charAt(0), input.charAt(1));
    }

    private boolean isValidClosing(char opening, char closing) {
        return BRACE_PAIRS.containsKey(opening) && BRACE_PAIRS.get(opening) == closing;
    }

}
