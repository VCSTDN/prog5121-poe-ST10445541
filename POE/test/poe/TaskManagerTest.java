/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author byron
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskManagerTest {
    private TaskManager taskManager;

    @BeforeEach
    public void setUp() {
        taskManager = new TaskManager();
        taskManager.addTask("Mike Smith", "Create Login", "T001", 5, "To Do");
        taskManager.addTask("Edward Harrison", "Create Add Features", "T002", 8, "Doing");
        taskManager.addTask("Samantha Paulson", "Create Reports", "T003", 2, "Done");
        taskManager.addTask("Glenda Oberholzer", "Add Arrays", "T004", 11, "To Do");
    }

    @Test
    public void testGetTasksByStatus() {
        assertEquals(1, taskManager.getTasksByStatus("Done").size());
    }

    @Test
    public void testGetTaskWithLongestDuration() {
        assertEquals("Add Arrays", taskManager.getTaskWithLongestDuration().getTaskName());
    }

    @Test
    public void testSearchTaskByName() {
        assertEquals("Mike Smith", taskManager.searchTaskByName("Create Login").getDeveloper());
    }

    @Test
    public void testSearchTasksByDeveloper() {
        assertEquals(1, taskManager.searchTasksByDeveloper("Samantha Paulson").size());
    }

    @Test
    public void testDeleteTaskByName() {
        assertTrue(taskManager.deleteTaskByName("Create Reports"));
        assertNull(taskManager.searchTaskByName("Create Reports"));
    }

    @Test
    public void testGetAllTasks() {
        assertEquals(4, taskManager.getAllTasks().size());
    }
}









