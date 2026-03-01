import java.io.InputStream;
import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    private String startTime;
    private String stopTime;
    private String elapsedTime;

    public String getStart() {
        return startTime;
    }

    public void setStart(String start) {
        this.startTime = start;
    }

    public String getStop() {
        return stopTime;
    }

    public void setStop(String stop) {
        this.stopTime = stop;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public StopWatch(InputStream in) {

        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        System.out.println("Time Now: ");
        System.out.println(this.startTime = LocalTime.now().toString());
        scanner.nextLine();
        System.out.println("Elapsed Time: ");
        System.out.println(this.elapsedTime = LocalTime.now().toString());
        scanner.nextLine();
        System.out.println("End Time: ");
        System.out.println(this.stopTime = LocalTime.now().toString());
    }
}
