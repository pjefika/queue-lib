/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto.output;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import model.enuns.TaskResultState;

/**
 *
 * @author G0042204
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CertificationResponse.class, name = "certification")
    , 
  @JsonSubTypes.Type(value = CadastroResponse.class, name = "cadastro")
    ,
    @JsonSubTypes.Type(value = AuthResponse.class, name = "auth")

})
public abstract class GenericQueueOutput {

    private String type;

    private TaskResultState state;

    private String exceptionMessage;

    public GenericQueueOutput(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TaskResultState getState() {
        return state;
    }

    public void setState(TaskResultState state) {
        this.state = state;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

}
