public abstract class Task {

    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void setIsDone(boolean value) {
        this.isDone = value;
    }

    public String getStatusIcon() {
        return (isDone? "[X]" : "[ ]");
    }

    public abstract String getFileString();

    @Override
    public String toString() {
        return String.format("%s %s", getStatusIcon(), this.description);
    }
}
