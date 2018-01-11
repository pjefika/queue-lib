/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.queue.dto;

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
    @Type(value = CustomerRequest.class, name = "customer")
    , 
  @Type(value = CustomerRequest.class, name = "customer1")
})
public abstract class GenericQueueInput {

    private String type;

    public GenericQueueInput() {
    }

//    public String getType() {
//        return type;
    
//    }

    public void setType(String type) {
        this.type = type;
    }

}
