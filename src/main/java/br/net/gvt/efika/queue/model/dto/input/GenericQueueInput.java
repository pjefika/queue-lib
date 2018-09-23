/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.queue.model.dto.input;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 *
 * @author G0042204
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        visible = true,
        property = "type"
)
@JsonSubTypes({
        @Type(value = CertiticationInput.class, name = "certification")
        ,
        @Type(value = ManobraInput.class, name = "manobra")
        ,
        @Type(value = AuthInput.class, name = "auth")
        ,
        @Type(value = CadastroInput.class, name = "cadastro")
        ,
        @Type(value = SetOntToOltInput.class, name = "setOntToOlt")
        ,
        @Type(value = SetOntToOltInput.class, name = "hpna")
})
public abstract class GenericQueueInput {

    private String type;



    public GenericQueueInput(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericQueueInput{");
        sb.append("type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
