/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.queue.model.enuns;

/**
 *
 * @author G0042204
 */
public enum TasksEnum {

    CERTIFICATION("Certificação"),
    MANOBRA("Manobra"),
    HPNA("Hpna"),
    AUTH("Autenticação"),
    CADASTRO("Cadastro"),
    CONF_REDE("Confiabilidade de Rede"), 
    ONTS_DISP("ONTs Disponíveis"), 
    SET_ONT("Associar ONT a OLT");

    private final String desc;

    private TasksEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
