import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegexValidationUC11Test {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(RegexValidationUC11.isValidTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(RegexValidationUC11.isValidTrainID("TRAIN12"));
        assertFalse(RegexValidationUC11.isValidTrainID("TRN12A"));
        assertFalse(RegexValidationUC11.isValidTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(RegexValidationUC11.isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(RegexValidationUC11.isValidCargoCode("PET-ab"));
        assertFalse(RegexValidationUC11.isValidCargoCode("PET123"));
        assertFalse(RegexValidationUC11.isValidCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(RegexValidationUC11.isValidTrainID("TRN-123"));
        assertFalse(RegexValidationUC11.isValidTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(RegexValidationUC11.isValidCargoCode("PET-aB"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(RegexValidationUC11.isValidTrainID(""));
        assertFalse(RegexValidationUC11.isValidCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(RegexValidationUC11.isValidTrainID("TRN-1234EXTRA"));
        assertFalse(RegexValidationUC11.isValidCargoCode("PET-ABCD"));
    }
}