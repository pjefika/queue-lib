/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.queue.dto;

import java.util.List;

/**
 *
 * @author G0042204
 */
public class PendingTasksResponseDTO {

    private List<QueueTaskDTO> tasks;

    public PendingTasksResponseDTO() {
    }

    public List<QueueTaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<QueueTaskDTO> tasks) {
        this.tasks = tasks;
    }

}
