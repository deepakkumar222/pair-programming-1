package org.tg.ppad.bean;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class SortListBean implements Serializable {

    private static final long serialVersionUID = -8256606463941371919L;

    private String name;
    private Integer seq;
}