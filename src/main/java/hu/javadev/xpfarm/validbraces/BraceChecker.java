package hu.javadev.xpfarm.validbraces;

import java.util.List;

public class BraceChecker {

    private static final List<String> VALID_BRACES = List.of("()", "[]", "{}");

    public boolean isValid(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        for (String braces : VALID_BRACES) {
            input = input.replace(braces, "");
        }
        return input.isEmpty();
    }

}
