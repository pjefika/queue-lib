/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.queue.model.dto.output;

/**
 *
 * @author G0042204
 */
public class AuthResponse extends GenericQueueOutput {

    private Boolean match;

    public AuthResponse() {
        super("auth");
    }

    public Boolean getMatch() {
        return match;
    }

    public void setMatch(Boolean match) {
        this.match = match;
    }

}
