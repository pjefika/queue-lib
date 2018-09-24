/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.queue.model.dto.output;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import org.json.JSONObject;

import java.util.HashMap;

/**
 *
 * @author G0042204
 */
public class ManobraResponse extends GenericQueueOutput {

    private String instancia;

    private EfikaCustomer customer;

    private HashMap<String, Object> resposta;

    public ManobraResponse() {
        super("manobra");
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

    public HashMap<String, Object> getResposta() {
        return resposta;
    }

    public void setResposta(HashMap<String, Object> resposta) {
        this.resposta = resposta;
    }
}