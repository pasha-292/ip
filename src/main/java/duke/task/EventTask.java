package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This class handles the eventTask.
 */
public class EventTask extends Task {
    private LocalDate date;

    public EventTask(String task) {
        super(task);
    }

    String[] divideCommand = task.split(" ");

    public LocalDate getDate(){
        return this.date;
    }

    @Override
    public String toString() {
        String StringDate = "";
        for (int i = 4; i < divideCommand.length; i++) {
            if (i == divideCommand.length - 1) {
                StringDate += divideCommand[i];
            } else {
                StringDate += divideCommand[i] + " ";
            }
        }
        date = LocalDate.parse(StringDate);
        String dateFormat = date.format(DateTimeFormatter.ofPattern("MMM dd yyyy"));
        String taskRepresent = divideCommand[1] + " " + divideCommand[2]
                + " (" + divideCommand[3].substring(1) + ": " + dateFormat + ")";
        if (this.isDone()) {
            return "E||X " + taskRepresent;
        } else {
            return "E||0 " + taskRepresent;
        }
    }
}
