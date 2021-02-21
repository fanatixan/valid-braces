package hu.javadev.xpfarm.validbraces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BraceCheckerTest {

    private BraceChecker checker;

    @BeforeEach
    void setup() {
        checker = new BraceChecker();
    }

    @Test
    @DisplayName("single opening brace should be invalid")
    void givenOpeningBraceOnly_isValid_shouldReturnFalse() {
        // given
        String input = "(";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isFalse();
    }

    @Test
    @DisplayName("opening then closing brace should be valid")
    void givenOpeningAndClosingBrace_isValid_shouldReturnTrue() {
        // given
        String input = "()";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isTrue();
    }

    @Test
    @DisplayName("closing then opening brace should be invalid")
    void givenClosingAndOpeningBrace_isValid_shouldReturnFalse() {
        // given
        String input = ")(";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isFalse();
    }

    @Test
    @DisplayName("opening then closing bracket should be valid")
    void givenOpeningAndClosingBracket_isValid_shouldReturnTrue() {
        // given
        String input = "[]";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isTrue();
    }

    @Test
    @DisplayName("closing then opening bracket should be invalid")
    void givenClosingAndOpeningBracket_isValid_shouldReturnFalse() {
        // given
        String input = "][";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isFalse();
    }

    @Test
    @DisplayName("opening then closing curly brace should be valid")
    void givenOpeningAndClosingCurlyBraces_isValid_shouldReturnTrue() {
        // given
        String input = "{}";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isTrue();
    }

    @Test
    @DisplayName("closing then opening curly brace should be invalid")
    void givenClosingAndOpeningCurlyBrace_isValid_shouldReturnFalse() {
        // given
        String input = "}{";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isFalse();
    }

    @Test
    @DisplayName("opening then closing brace of different type should be invalid")
    void givenNonMatchingClosingBrace_isValid_shouldReturnFalse() {
        // given
        String input = "(]";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isFalse();
    }

    @Test
    @DisplayName("multiple valid brace pairs should be valid")
    void givenMultipleValidBracePairs_isValid_shouldReturnTrue() {
        // given
        String input = "()()";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isTrue();
    }

    @Test
    @DisplayName("multiple brace pairs with some invalid should be invalid")
    void givenMultipleBracePairsWithSomeInvalid_isValid_shouldReturnFalse() {
        // given
        String input = "())(";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isFalse();
    }

    @Test
    @DisplayName("multiple valid brace pairs of different types should be valid")
    void givenMultipleValidBracePairsOfDifferentTypes_isValid_shouldReturnTrue() {
        // given
        String input = "()[]";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isTrue();
    }

    @Test
    @DisplayName("embedded brace pairs with valid closing should be valid")
    void givenEmbeddedBracePairsWithValidClosing_isValid_shouldReturnTrue() {
        // given
        String input = "([])";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isTrue();
    }

    @Test
    @DisplayName("overlapping brace pairs should be invalid")
    void givenOverlappingBracePairs_isValid_shouldReturnFalse() {
        // given
        String input = "([)]";

        // when
        boolean valid = checker.isValid(input);

        // then
        assertThat(valid).isFalse();
    }

}
