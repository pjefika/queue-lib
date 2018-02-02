/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto.output;

import telecom.properties.gpon.SerialOntGpon;

/**
 *
 * @author G0042204
 */
public class SetOntToOltResponse extends GenericQueueOutput {

    private SerialOntGpon serial;

    public SetOntToOltResponse() {
        super("setOntToOlt");
    }

    public SerialOntGpon getSerial() {
        return serial;
    }

    public void setSerial(SerialOntGpon serial) {
        this.serial = serial;
    }

}
