/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto.output;

import fulltest.ValidacaoResult;

/**
 *
 * @author G0042204
 */
public class ConfRedeResponse extends GenericQueueOutput {

    private ValidacaoResult tabRede;

    public ConfRedeResponse() {
        super("confRede");
    }

    public ValidacaoResult getTabRede() {
        return tabRede;
    }

    public void setTabRede(ValidacaoResult tabRede) {
        this.tabRede = tabRede;
    }

}
