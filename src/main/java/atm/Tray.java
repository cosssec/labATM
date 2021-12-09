package atm;
import lombok.*;

public interface Tray {
    void process(int amount);
    void setNext(Tray tray);
}