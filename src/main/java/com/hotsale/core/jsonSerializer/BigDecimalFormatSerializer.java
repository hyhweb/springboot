package com.hotsale.core.jsonSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/6/13.
 */
public class BigDecimalFormatSerializer extends JsonSerializer<BigDecimal> {

    private final static int SCALE = 2;

    @Override
    public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        try {
           if(value==null){
               gen.writeString("");
           }
            gen.writeString(value.setScale(SCALE, BigDecimal.ROUND_HALF_UP).toPlainString());
        } catch (Exception e) {
            e.printStackTrace();
            gen.writeString(String.valueOf(value));
        }
    }

}
