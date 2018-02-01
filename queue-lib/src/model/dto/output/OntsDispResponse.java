/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto.output;

import java.util.List;
import telecom.properties.gpon.SerialOntGpon;

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
