/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.queue.model.dto.input;

import br.net.gvt.efika.customer.model.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public class SetOntToOltInput extends GenericQueueInput {

    private String instancia;

    private String serial;

    private EfikaCustomer customer;

    public SetOntToOltInput() {
        super("setOntToOlt");
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public EfikaCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(EfikaCustomer customer) {
        this.customer = customer;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}
