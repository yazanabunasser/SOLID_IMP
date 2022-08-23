import javax.management.monitor.Monitor;

public class WindowsMachine {
    public final Keyboard keyboard;
    public final Monitor monitor;
    public WindowsMachine(Keyboard keyboard , Monitor monitor){
      this.keyboard = keyboard;
      this.monitor = monitor;
    }
}
