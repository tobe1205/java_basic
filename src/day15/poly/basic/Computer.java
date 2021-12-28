package day15.poly.basic;

class Monitor{}
class LGMonitor extends Monitor {}
class HPMonitor extends Monitor {}

public class Computer {

    public Monitor monitor;

    public Computer() {
        this.monitor = new LGMonitor();
        this.monitor = new HPMonitor();
    }
}
