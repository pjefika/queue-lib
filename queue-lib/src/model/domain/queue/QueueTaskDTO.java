/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.queue;

import java.util.Date;
import java.util.List;
import model.domain.queue.enuns.TaskState;
import model.domain.queue.enuns.TasksEnum;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.mongodb.morphia.annotations.Embedded;

/**
 *
 * @author G0042204
 */
public class QueueTaskDTO {

    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;

    private Date dateQueueIn;

    private Date dateConsumed;

    private Date dateQueueOut;

    private TaskState state;

    private TasksEnum task;

    private List<Item> input;

    private String executor;

    private String consumer;

    @Embedded
    private List<Item> output;

    public QueueTaskDTO() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getDateQueueIn() {
        return dateQueueIn;
    }

    public void setDateQueueIn(Date dateQueueIn) {
        this.dateQueueIn = dateQueueIn;
    }

    public Date getDateConsumed() {
        return dateConsumed;
    }

    public void setDateConsumed(Date dateConsumed) {
        this.dateConsumed = dateConsumed;
    }

    public Date getDateQueueOut() {
        return dateQueueOut;
    }

    public void setDateQueueOut(Date dateQueueOut) {
        this.dateQueueOut = dateQueueOut;
    }

    public TaskState getState() {
        return state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public TasksEnum getTask() {
        return task;
    }

    public void setTask(TasksEnum task) {
        this.task = task;
    }

    public List<Item> getInput() {
        return input;
    }

    public void setInput(List<Item> input) {
        this.input = input;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public List<Item> getOutput() {
        return output;
    }

    public void setOutput(List<Item> output) {
        this.output = output;
    }

}
