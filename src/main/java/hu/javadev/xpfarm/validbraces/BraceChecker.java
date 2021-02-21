package hu.javadev.xpfarm.validbraces;

public class BraceChecker {

    public boolean isValid(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        return input.charAt(1) - input.charAt(0) == 1;
    }

}
