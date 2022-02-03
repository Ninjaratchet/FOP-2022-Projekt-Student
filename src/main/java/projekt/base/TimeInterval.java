package projekt.base;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;

public class TimeInterval {
    private LocalDateTime start;
    private LocalDateTime end;

    /**
     * Constructs TimeInterval object by assigning start and end
     * with the parameters if, neither are null and start is not after end.
     * @param start beginning time (of delivery)
     * @param end finish time (of delivery)
     */
    public TimeInterval(LocalDateTime start, LocalDateTime end) {
        if (start == null){
            throw new NullPointerException("start");
        }
        else if (end == null){
            throw new NullPointerException("end");
        }
        else if (start.isAfter(end)){
            throw new IllegalArgumentException("Start " + start.toString() + " is after end " + end.toString());
        }
        this.start = start;
        this.end = end;
    }

    /**
     * The start time of any delivery.
     * @return start time of any delivery
     */
    public LocalDateTime getStart() {
        return start;
    }
    /**
     * The end time of any delivery.
     * @return end time of any delivery
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     * The duration between start and end. (i. e. duration of the delivery)
     * @return duration between start and end
     */
    public Duration getDuration(){
        return Duration.between(start,end);
    }
}
