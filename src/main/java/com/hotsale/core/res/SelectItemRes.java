package com.hotsale.core.res;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hotsale.core.jsonSerializer.LongSerializer;

public class SelectItemRes {

    private Long value;

    private String text;

    private String other;

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @JsonSerialize(using = LongSerializer.class)
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SelectItemRes{" +
                "value=" + value +
                ", text='" + text + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
