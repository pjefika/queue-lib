/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto.output;

import model.dto.cert.CustomerCertificationDTO;

/**
 *
 * @author G0042204
 */
public class CertificationResponse extends GenericQueueOutput {

    private CustomerCertificationDTO certification;

    public CertificationResponse() {
        super("certification");
    }

    public CustomerCertificationDTO getCertification() {
        return certification;
    }

    public void setCertification(CustomerCertificationDTO certification) {
        this.certification = certification;
    }

}
