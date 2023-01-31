package bowlingscorecalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class ScoreCardTests {
    private ScoreCard scoreCard;

    @BeforeEach
    void setup() {
        scoreCard = new ScoreCard();
    }

    @Test
    void Calculate_Returns_0_When_Every_Frame_Is_Zero() {
        assertEquals(0, scoreCard.Calculate("00 00 00 00 00 00 00 00 00 000"));
    }

    @Test
    void Calculate_Returns_1_When_Only_First_Pin_Is_Scored() {
        assertEquals(1, scoreCard.Calculate("10 00 00 00 00 00 00 00 00 000"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"00 00 00 00 00 00 00 00 00 100", "00 00 00 00 00 10 00 00 00 000"})
    void Calculate_Returns_1_When_Any_Single_Pin_Is_Scored(String input) {
        assertEquals(1, scoreCard.Calculate(input));
    }

    @Test
    void Calculate_Returns_Accurate_Score_Without_Strikes_Or_Spares() {
        assertEquals(36, scoreCard.Calculate("90 20 01 05 62 00 00 81 00 110"));
    }
}
