package atm;

import lombok.Getter;

@Getter
public abstract class DefaultTray implements Tray {
    private final int BILL;
    private Tray nextTray;

    public DefaultTray(int bill) {
        this.BILL = bill;

    }
    public void process(int amount) {
        if (nextTray != null) {
            nextTray.process(amount % BILL);
        }
        else if (amount % BILL > 0) {
            throw new IllegalArgumentException("Cannot process this bill, try different amount");
        }
        System.out.println("extracted " + amount / BILL + " bills with amount of " + BILL);
    }

    public void setNext(Tray tray) {
        this.nextTray = tray;
    }
}