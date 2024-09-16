import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

/**
 * The test class SkillBuilder3Test.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SkillBuilder1Test extends OutputTest {
    /**
     * Default constructor for test class SkillBuilder2Test
     */
    public SkillBuilder1Test() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    /**
     * Tears down the test fixture.
     * <p>
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
        super.tearDown();
    }

    @Test
    @DisplayName("[1] testMain_1")
    public void testMain_1() {
        setTestInput("Jean Claude\n2.45");
        SkillBuilder1.main(new String[]{});
        String expected = "You're Jane's friend!\n" +
                "\"What's your name?\"\n" +
                "Enter a floating-point number:\n" +
                "Well Jean Claude, the spice value resulted in 1.4815297665908702\n" +
                "And the converted value is 1.48";
        String expected_match = "Well Jean Claude, the spice value resulted in 1\\.481\\d+\n" +
                "And the converted value is 1\\.48?[^0-9]*";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n" + expected + "\nActual:\n" + actual;
        assertTrue(Pattern.compile(expected_match.replaceAll("\\s", ""))
                .matcher(actual.replaceAll("\\s", "")).find(), message);
    }

    @Test
    @DisplayName("[1] testMain_2")
    public void testMain_2() {
        setTestInput("Jean Claude\n3.01");
        SkillBuilder1.main(new String[]{});
        String expected = "You're Jane's friend!\n" +
                "\"What's your name?\"\n" +
                "Enter a floating-point number:\n" +
                "Well Jean Claude, the spice value resulted in 1.4113072927010246\n" +
                "And the converted value is 1.41";
        String expected_match = "Well Jean Claude, the spice value resulted in 1\\.411\\d+\n" +
                "And the converted value is 1\\.41[^0-9]*";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n" + expected + "\nActual:\n" + actual;
        assertTrue(Pattern.compile(expected_match.replaceAll("\\s", ""))
                .matcher(actual.replaceAll("\\s", "")).find(), message);
    }

    @Test
    @DisplayName("[2] testCalcWallPaint_1")
    public void testCalcWallPaint_1()
    {
        setTestInput("12\n15");
        SkillBuilder1.calcWallPaint();
        String expected = "Enter wall height (feet):\n" +
                "Enter wall width (feet):\n" +
                "Wall area: 180 square feet\n" +
                "Paint needed: 0.51 gallons\n" +
                "Cans needed: 1 can(s)\n";
        String expected_match = "Wall area: 180(.0)? square feet\n";
        expected_match += "Paint needed: 0.51\\s* gallons\n";
        expected_match += "Cans needed: 1 can\\(s\\)";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected_match.replaceAll("\\s",""))
                .matcher(actual.replaceAll("\\s","")).find(),message);
    }

    @Test
    @DisplayName("[2] testCalcWallPaint_2")
    public void testCalcWallPaint_2()
    {
        setTestInput("22\n33");
        SkillBuilder1.calcWallPaint();
        String expected = "Enter wall height (feet):\n" +
                "Enter wall width (feet):\n" +
                "Wall area: 726.0 square feet\n" +
                "Paint needed: 2.07 gallons\n" +
                "Cans needed: 3 can(s)\n";
        String expected_match = "Wall area: 726(.0)? square feet\n";
        expected_match += "Paint needed: 2.07\\s* gallons\n";
        expected_match += "Cans needed: 3 can\\(s\\)";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected_match.replaceAll("\\s",""))
                .matcher(actual.replaceAll("\\s","")).find(),message);
    }

    @Test
    @DisplayName("[2] testCalcWallPaint_3")
    public void testCalcWallPaint_3()
    {
        setTestInput("35\n54");
        SkillBuilder1.calcWallPaint();
        String expected = "Enter wall height (feet):\n" +
                "Enter wall width (feet):\n" +
                "Wall area: 1890.0 square feet\n" +
                "Paint needed: 5.40 gallons\n" +
                "Cans needed: 6 can(s)\n";
        String expected_match = "Wall area: 1890(.0)? square feet\n";
        expected_match += "Paint needed: 5.40\\s* gallons\n";
        expected_match += "Cans needed: 6 can\\(s\\)";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected_match.replaceAll("\\s",""))
                .matcher(actual.replaceAll("\\s","")).find(),message);
    }
}
