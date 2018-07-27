package com.hotsale.core.jsonSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.io.IOException;
import java.util.Date;

/**
 * 日期格式化
 * 年-月-份 时
 * @author 
 *
 */
public class DateTimeDivisionSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date date, JsonGenerator gen, SerializerProvider arg2)
			throws IOException {

		try {
			if(date==null){
				gen.writeString("");
			}
			String formatDate = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm");
			gen.writeString(formatDate);
		} catch (Exception e) {
			e.printStackTrace();
			gen.writeString("");
		}
	}

}
