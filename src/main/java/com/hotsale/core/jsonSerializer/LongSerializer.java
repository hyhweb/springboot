package com.hotsale.core.jsonSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Created by Administrator on 2017/6/15.
 */
public class LongSerializer extends JsonSerializer<Long> {
    public void serialize(Long value, JsonGenerator jgen,
                          SerializerProvider provider) throws IOException{
        try {
            if(value==null){
                jgen.writeString("");
            }
            jgen.writeString(String.valueOf(value));
        } catch (Exception e) {
            e.printStackTrace();
            jgen.writeString("");
        }

    }
}
