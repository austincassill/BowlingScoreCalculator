package bowlingscorecalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import bowlingscorecalculator.Wrappers.ScannerWrapper;
import bowlingscorecalculator.Wrappers.SystemWrapper;

public class CalculatorTests {
    private Calculator calculator;
    private ScoreCard scoreCard;
    private ScannerWrapper scannerWrapper;
    private SystemWrapper systemWrapper;

    @BeforeEach
    void setup() {
        scoreCard = mock(ScoreCard.class);
        scannerWrapper = mock(ScannerWrapper.class);
        systemWrapper = mock(SystemWrapper.class);
        calculator = new Calculator(scoreCard, scannerWrapper, systemWrapper);
    }

    @Test
    void Launch_Displays_Correct_Output(){
        when(scannerWrapper.nextLine()).thenReturn("X X X X X X X X X XXX");
        when(scoreCard.Calculate("X X X X X X X X X XXX")).thenReturn(300);

        calculator.Launch();

        verify(systemWrapper, times(1)).println("Please enter your score card: ");
        verify(systemWrapper, times(1)).println("You scored 300");
    }
}
