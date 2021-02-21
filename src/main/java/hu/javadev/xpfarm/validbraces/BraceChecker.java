package hu.javadev.xpfarm.validbraces;

import java.util.List;

public class BraceChecker {

    private static final List<String> VALID_BRACES = List.of("()", "[]", "{}");

    public boolean isValid(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        String simplifiedBraces = input;
        String originalBraces;
        do {
            originalBraces = simplifiedBraces;
            simplifiedBraces = removeValidBraces(originalBraces);
        } while (originalBraces.length() != simplifiedBraces.length());

        return simplifiedBraces.isEmpty();
    }

    private String removeValidBraces(String input) {
        String result = input;
        for (String braces : VALID_BRACES) {
            result = result.replace(braces, "");
        }
        return result;
    }

}
