package org.tg.ppad.bean;

import lombok.Builder;
import lombok.Data;
import org.tg.ppad.model.Employee;

import java.io.Serializable;
import java.util.List;

@Data
public class ResponseBean implements Serializable {

    private static final long serialVersionUID = -8256606463941371919L;

    private boolean isValid;

    private Object data;
}