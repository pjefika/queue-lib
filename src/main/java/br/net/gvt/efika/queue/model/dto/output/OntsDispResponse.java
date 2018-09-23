/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.queue.model.dto.output;

import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class OntsDispResponse extends GenericQueueOutput {

    private List<SerialOntGpon> onts;

    public OntsDispResponse() {
        super("ontsDisp");
    }

    public List<SerialOntGpon> getOnts() {
        return onts;
    }

    public void setOnts(List<SerialOntGpon> onts) {
        this.onts = onts;
    }

}
