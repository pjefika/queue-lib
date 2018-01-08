/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.queue.dto;

/**
 *
 * @author G0042204
 */
public abstract class ExecutorRequestDTO {

    private String executor;

    public ExecutorRequestDTO() {
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

}
