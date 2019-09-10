package duke.task;

/**
 * Encapsulates a task object of type Event.
 */
public class Event extends Task {
    private String date;
    private String[] tentativeDates;

    /**
     * Constructs an Event object.
     *
     * @param topic the topic of the event.
     * @param date the date of the event.
     */
    public Event(String topic, String date) {
        super(topic);
        this.type = "E";
        this.date = date;
        // this.details = String.format("%s (at: %s)", topic, date);
        // this.detailsForDatabase = String.format("%s | %s", topic, date);
    }

    public Event(String topic, String[] tentativeDates) {
        this(topic, "hello");
    }

    /**
     * Returns the string representation of the task.
     * It takes the form of [type][done status][details].
     *
     * @return string representation of the task.
     */
    @Override
    public String toString() {
        return String.format("[%s][%s] %s (at: %s)", type, status, title, date);
    }

    /**
     * Returns the data summary of this task to record this task in the database.
     *
     * @return the data summary of this task.
     */
    public String getSummaryForDatabase() {
        int status = isDone ? 1 : 0;
        return String.format("%s | %d | %s | %s", type, status, title, date);
    }
}
