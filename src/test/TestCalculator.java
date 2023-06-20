import org.example.StringCalculatorInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculator {

    //private StringCalculatorInterface StringCalculator;


    @Test
    public void negativeExceptionTest()
    {
       // int number = 0;
        assertThrows(
                IllegalArgumentException.class, () ->{
                   //  int number = StringCalculator.add("-1,5");
                    int number = StringCalculator.add("-1,5");
                }

        );


    };


    @Test
    public void numberBiggerthen1000()
    {
        int returnNumber = StringCalculator.add("1,1000");

        assertEquals(returnNumber, 1);


    }
}
