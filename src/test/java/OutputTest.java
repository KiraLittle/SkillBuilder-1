import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OutputTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OutputTest
{
    private PipedInputStream input;
    private PrintStream testInput;
    private InputStreamReader resultReader;
    private PrintStream stdOut;
    private InputStream stdIn;

    /**
     * Default constructor for test class OutputTest
     */
    public OutputTest()
    {
        stdOut = System.out;
        stdIn = System.in;
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        try{
            input = new PipedInputStream();
            System.setOut(new PrintStream(new PipedOutputStream(input)));
            resultReader = new InputStreamReader(input);
            input = new PipedInputStream();
            testInput = new PrintStream(new PipedOutputStream(input));
            System.setIn(input);
        } catch (IOException ioe){
        }
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
       
        try 
        {
            System.out.close();
            System.in.close();
        } catch (IOException ioe){
        }
        System.setOut(stdOut);
        System.setIn(stdIn);
    }

    public String getTestOutput()
    {
        String res = "";
        try {
            while (resultReader.ready()){
                res += (char)resultReader.read();
            }
        } catch (IOException ioe){
        }
        return res;
    }
    
    public void setTestInput(String input)
    {
        testInput.println(input);
    }
}
