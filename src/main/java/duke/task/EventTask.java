package duke.task;

/**
 * This class handles the eventTask.
 */
public class EventTask extends Task {

    /**
     * Constructor for event
     *
     * @param task
     */
    public EventTask(String task) {
        super(task);
    }


    /**
     * String representation of event
     *
     * @return
     */
    @Override
    public String toString() {
        String taskRepresent = "";
        taskRepresent = getName() + " (at: " + getDateFormat();
        taskRepresent += getTime() == null ? ")"
                : " " + getTimeFormat() + ")";
        if (this.isDone()) {
            return "[E][X] " + taskRepresent;
        } else {
            return "[E][-] " + taskRepresent;
        }
    }
}
