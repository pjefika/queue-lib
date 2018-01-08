/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.queue.dto;

import br.net.gvt.efika.model.entity.fulltest.FullTest;

/**
 *
 * @author G0042204
 */
public class FulltestResponse extends GenericQueueOutput {

    private FullTest fulltest;

    public FulltestResponse() {
    }

    public FullTest getFulltest() {
        return fulltest;
    }

    public void setFulltest(FullTest fulltest) {
        this.fulltest = fulltest;
    }

}
