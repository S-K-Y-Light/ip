package sora.Tasks;

import java.util.List;

public abstract class Task {
    protected boolean isDone;
    protected String description;

    public Task(String description) {
        this.isDone = false;
        this.description = description;
    }

    public String getStatus() {
        return isDone ? "X" : " ";
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void markAsNotDone() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        return "[" + getStatus() + "] " + description;
    }

    public boolean descriptionContainsString(String s) {
        return this.description.toLowerCase().contains(s.toLowerCase());
    }

    public abstract List<String> getTaskDetails();
}
