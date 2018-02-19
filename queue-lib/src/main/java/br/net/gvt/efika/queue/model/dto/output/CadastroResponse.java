/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.queue.model.dto.output;

import br.net.gvt.efika.customer.model.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public class CadastroResponse extends GenericQueueOutput {

    private String instancia;

    private EfikaCustomer customer;

    public CadastroResponse() {
        super("cadastro");
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

}
