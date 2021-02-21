package hu.javadev.xpfarm.validbraces;

import java.util.List;

public class BraceChecker {

    private static final List<String> VALID_BRACES = List.of("()", "[]", "{}");

    public boolean isValid(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        return VALID_BRACES.contains(input);
    }

}
