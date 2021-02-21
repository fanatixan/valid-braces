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

}
