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
public class CustomerRequest extends GenericQueueInput {

    private String instancia;

    public CustomerRequest() {
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

}
