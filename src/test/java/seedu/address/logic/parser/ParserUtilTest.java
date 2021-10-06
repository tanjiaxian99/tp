package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.address.logic.parser.ParserUtil.MESSAGE_INVALID_INDEX;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_STUDENT;

import org.junit.jupiter.api.Test;

import seedu.address.logic.parser.exceptions.ParseException;
<<<<<<< HEAD
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.TelegramHandle;
import seedu.address.model.tag.Tag;

public class ParserUtilTest {
    private static final String INVALID_NAME = "R@chel";
    private static final String INVALID_TELEGRAM_HANDLE = "@RACHEL";
    private static final String INVALID_ADDRESS = " ";
=======
import seedu.address.model.student.Email;
import seedu.address.model.student.Name;
import seedu.address.model.student.Phone;

public class ParserUtilTest {
    private static final String INVALID_NAME = "R@chel";
    private static final String INVALID_PHONE = "+651234";
>>>>>>> ff2a7f5e7e87f9b02e1a6e604ac83958baa27998
    private static final String INVALID_EMAIL = "example.com";

    private static final String VALID_NAME = "Rachel Walker";
<<<<<<< HEAD
    private static final String VALID_TELEGRAM_HANDLE = "@rachel_walker";
    private static final String VALID_ADDRESS = "123 Main Street #0505";
=======
    private static final String VALID_PHONE = "123456";
>>>>>>> ff2a7f5e7e87f9b02e1a6e604ac83958baa27998
    private static final String VALID_EMAIL = "rachel@example.com";

    private static final String WHITESPACE = " \t\r\n";

    @Test
    public void parseIndex_invalidInput_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseIndex("10 a"));
    }

    @Test
    public void parseIndex_outOfRangeInput_throwsParseException() {
        assertThrows(ParseException.class, MESSAGE_INVALID_INDEX, ()
            -> ParserUtil.parseIndex(Long.toString(Integer.MAX_VALUE + 1)));
    }

    @Test
    public void parseIndex_validInput_success() throws Exception {
        // No whitespaces
        assertEquals(INDEX_FIRST_STUDENT, ParserUtil.parseIndex("1"));

        // Leading and trailing whitespaces
        assertEquals(INDEX_FIRST_STUDENT, ParserUtil.parseIndex("  1  "));
    }

    @Test
    public void parseName_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseName((String) null));
    }

    @Test
    public void parseName_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseName(INVALID_NAME));
    }

    @Test
    public void parseName_validValueWithoutWhitespace_returnsName() throws Exception {
        Name expectedName = new Name(VALID_NAME);
        assertEquals(expectedName, ParserUtil.parseName(VALID_NAME));
    }

    @Test
    public void parseName_validValueWithWhitespace_returnsTrimmedName() throws Exception {
        String nameWithWhitespace = WHITESPACE + VALID_NAME + WHITESPACE;
        Name expectedName = new Name(VALID_NAME);
        assertEquals(expectedName, ParserUtil.parseName(nameWithWhitespace));
    }

    @Test
    public void parseTelegramHandle_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseTelegramHandle((String) null));
    }

    @Test
    public void parseTelegramHandle_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseTelegramHandle(INVALID_TELEGRAM_HANDLE));
    }

    @Test
    public void parseTelegramHandle_validValueWithoutWhitespace_returnsTelegramHandle() throws Exception {
        TelegramHandle expectedTelegramHandle = new TelegramHandle(VALID_TELEGRAM_HANDLE);
        assertEquals(expectedTelegramHandle, ParserUtil.parseTelegramHandle(VALID_TELEGRAM_HANDLE));
    }

    @Test
    public void parseTelegramHandle_validValueWithWhitespace_returnsTrimmedTelegramHandle() throws Exception {
        String telegramHandleWithWhitespace = WHITESPACE + VALID_TELEGRAM_HANDLE + WHITESPACE;
        TelegramHandle expectedTelegramHandle = new TelegramHandle(VALID_TELEGRAM_HANDLE);
        assertEquals(expectedTelegramHandle, ParserUtil.parseTelegramHandle(telegramHandleWithWhitespace));
    }

    @Test
    public void parseEmail_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseEmail((String) null));
    }

    @Test
    public void parseEmail_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseEmail(INVALID_EMAIL));
    }

    @Test
    public void parseEmail_validValueWithoutWhitespace_returnsEmail() throws Exception {
        Email expectedEmail = new Email(VALID_EMAIL);
        assertEquals(expectedEmail, ParserUtil.parseEmail(VALID_EMAIL));
    }

    @Test
    public void parseEmail_validValueWithWhitespace_returnsTrimmedEmail() throws Exception {
        String emailWithWhitespace = WHITESPACE + VALID_EMAIL + WHITESPACE;
        Email expectedEmail = new Email(VALID_EMAIL);
        assertEquals(expectedEmail, ParserUtil.parseEmail(emailWithWhitespace));
    }

}
