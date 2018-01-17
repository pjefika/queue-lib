/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto.output;

import model.dto.input.GenericQueueInput;

/**
 *
 * @author G0042204
 */
public class CadastroResponse extends GenericQueueInput {

    private String instancia;

    public CadastroResponse() {
        super("cadastro");
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

}
