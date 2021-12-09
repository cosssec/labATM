package atm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATMTest {
    @Test
    public void processCorrectArguments() {
        ATM atm = new ATM();
        atm.process(120);
    }

}
