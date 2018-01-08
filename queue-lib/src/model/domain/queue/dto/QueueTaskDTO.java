package model.domain.queue.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Date;
import model.domain.queue.enuns.TaskState;
import model.domain.queue.enuns.TasksEnum;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

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

    private String executor;

    private String consumer;

    private GenericQueueInput input;

    private GenericQueueOutput output;

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

    public GenericQueueInput getInput() {
        return input;
    }

    public void setInput(GenericQueueInput input) {
        this.input = input;
    }

    public GenericQueueOutput getOutput() {
        return output;
    }

    public void setOutput(GenericQueueOutput output) {
        this.output = output;
    }

}
