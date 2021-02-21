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

}
