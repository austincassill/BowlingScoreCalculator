package bowlingscorecalculator;

import bowlingscorecalculator.Wrappers.IScannerWrapper;
import bowlingscorecalculator.Wrappers.ISystemWrapper;
import bowlingscorecalculator.Wrappers.ScannerWrapper;
import bowlingscorecalculator.Wrappers.SystemWrapper;

public class Calculator {
    private IScoreCard scoreCard;
    private IScannerWrapper scannerWrapper;
    private ISystemWrapper systemWrapper;

    public Calculator(ScoreCard scoreCard, ScannerWrapper scannerWrapper, SystemWrapper systemWrapper) {
        this.scoreCard = scoreCard;
        this.scannerWrapper = scannerWrapper; 
        this.systemWrapper = systemWrapper;
    }

    public void Launch() {
        systemWrapper.println("Please enter your score card: ");

        var totalScore = scoreCard.Calculate(scannerWrapper.nextLine());

        systemWrapper.println(String.format("You scored %s", totalScore));
    }
 }
