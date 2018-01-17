/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto.input;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 *
 * @author G0042204
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        //        include = JsonTypeInfo.As.PROPERTY,
        visible = true,
        property = "type")
@JsonSubTypes({
    @Type(value = CertiticationInput.class, name = "customer")
    , 
  @Type(value = CertiticationInput.class, name = "customer1")
})
public abstract class GenericQueueInput {

    private String type;

    public GenericQueueInput(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
