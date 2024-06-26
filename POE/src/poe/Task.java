/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

/**
 *
 * @author byron
 */
public class Task {
        private String developer;
        private String taskName;
        private String taskId;
        private int duration;
        private String status;

        public Task(String developer, String taskName, String taskId, int duration, String status) {
            this.developer = developer;
            this.taskName = taskName;
            this.taskId = taskId;
            this.duration = duration;
            this.status = status;
        }

        public String getDeveloper() {
            return developer;
        }

        public String getTaskName() {
            return taskName;
        }

        public String getTaskId() {
            return taskId;
        }

        public int getDuration() {
            return duration;
        }

        public String getStatus() {
            return status;
        }
    }

