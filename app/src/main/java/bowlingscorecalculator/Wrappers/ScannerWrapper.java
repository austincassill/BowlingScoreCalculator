package bowlingscorecalculator.Wrappers;

import java.util.Scanner;

public class ScannerWrapper implements IScannerWrapper {

    public String nextLine() {
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        scanner.close();
        return input;
    }    
}
