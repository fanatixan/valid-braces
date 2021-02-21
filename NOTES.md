# Plans

Due to specification:
- no validation required (only braces will be present)
- only non-empty string arguments should be expected

Test Cases:
- ✅ `(`: invalid
- `()`: valid
- `)(`: invalid
- `[]`: valid
- `][`: valid
- `{}`: valid
- `}{`: valid
- `(]`: invalid
- `()()`: valid
- `([])`: valid
- `([)]`: invalid
