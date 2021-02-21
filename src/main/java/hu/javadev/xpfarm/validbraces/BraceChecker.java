package hu.javadev.xpfarm.validbraces;

import java.util.List;

public class BraceChecker {

    private static final List<String> VALID_BRACES = List.of("()", "[]", "{}");

    public boolean isValid(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        return removeValidBraces(input).isEmpty();
    }

    private String removeValidBraces(String input) {
        String result = input;
        for (String braces : VALID_BRACES) {
            result = result.replace(braces, "");
        }
        return result;
    }

}
