package hu.javadev.xpfarm.validbraces;

import java.util.List;

public class BraceChecker {

    private static final List<String> VALID_BRACES = List.of("()", "[]", "{}");

    public boolean isValid(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        return removeAllValidBraces(input).isEmpty();
    }

    private String removeAllValidBraces(String input) {
        String simplifiedBraces = input;
        String originalBraces;
        do {
            originalBraces = simplifiedBraces;
            simplifiedBraces = removeValidBracePairs(originalBraces);
        } while (originalBraces.length() != simplifiedBraces.length());

        return simplifiedBraces;
    }

    private String removeValidBracePairs(String input) {
        String result = input;
        for (String braces : VALID_BRACES) {
            result = result.replace(braces, "");
        }
        return result;
    }

}
