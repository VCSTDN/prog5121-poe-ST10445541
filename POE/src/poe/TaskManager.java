/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

/**
 *
 * @author byron
 */
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String developer, String taskName, String taskId, int duration, String status) {
        tasks.add(new Task(developer, taskName, taskId, duration, status));
    }

    public List<Task> getTasksByStatus(String status) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus().equalsIgnoreCase(status)) {
                result.add(task);
            }
        }
        return result;
    }

    public Task getTaskWithLongestDuration() {
        Task longestTask = null;
        for (Task task : tasks) {
            if (longestTask == null || task.getDuration() > longestTask.getDuration()) {
                longestTask = task;
            }
        }
        return longestTask;
    }

    public Task searchTaskByName(String taskName) {
        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                return task;
            }
        }
        return null;
    }

    public List<Task> searchTasksByDeveloper(String developer) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getDeveloper().equalsIgnoreCase(developer)) {
                result.add(task);
            }
        }
        return result;
    }

    public boolean deleteTaskByName(String taskName) {
        return tasks.removeIf(task -> task.getTaskName().equalsIgnoreCase(taskName));
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

}