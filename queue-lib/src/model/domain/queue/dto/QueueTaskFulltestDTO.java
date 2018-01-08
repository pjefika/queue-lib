/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.queue.dto;

import br.net.gvt.efika.model.entity.fulltest.FullTest;

/**
 *
 * @author G0042204
 */
public abstract class QueueTaskFulltestDTO extends QueueTaskDTO {

    private CustomerRequestDTO input;

    private FullTest output;

    public QueueTaskFulltestDTO() {
    }

    public CustomerRequestDTO getInput() {
        return input;
    }

    public void setInput(CustomerRequestDTO input) {
        this.input = input;
    }

    public FullTest getOutput() {
        return output;
    }

    public void setOutput(FullTest output) {
        this.output = output;
    }

}
