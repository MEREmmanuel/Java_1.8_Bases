import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public List<String> listTasks() {
        return tasks;
    }
}