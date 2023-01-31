package bowlingscorecalculator;

import bowlingscorecalculator.Wrappers.ScannerWrapper;
import bowlingscorecalculator.Wrappers.SystemWrapper;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ScoreCard(), new ScannerWrapper(), new SystemWrapper());
        calculator.Launch();
    }
}
