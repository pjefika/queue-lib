/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto.input;

/**
 *
 * @author G0042204
 */
public class CertiticationInput extends GenericQueueInput {

    private String instancia;

    public CertiticationInput() {
        super("certification");
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

}
