package duke.task;

/**
 * This class handles the deadlineTasks
 */
public class DeadlineTask extends Task {
    /**
     * Constructor for deadlines
     *
     * @param task
     */
    public DeadlineTask(String task) {
        super(task);
    }

    /**
     * String representation of the deadline
     *
     * @return
     */
    @Override
    public String toString() {
        String taskRepresent = "";
        taskRepresent = getName() + " (by: " + getDateFormat();
        taskRepresent += getTime() == null ? ")"
                : " " + getTimeFormat() + ")";
        if (this.isDone()) {
            return "[D][X] " + taskRepresent;
        } else {
            return "[D][-] " + taskRepresent;
        }
    }
}
