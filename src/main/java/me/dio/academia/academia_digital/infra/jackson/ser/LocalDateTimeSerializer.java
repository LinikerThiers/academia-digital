package me.dio.academia.academia_digital.infra.jackson.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import me.dio.academia.academia_digital.infra.utils.JavaTimeUtils;

import java.io.IOException;
import java.time.LocalDateTime;

public class LocalDateTimeSerializer  extends StdSerializer<LocalDateTime> {

    private static final long serialVersionUID = -6347158617481757931L;

    public LocalDateTimeSerializer() {
        super(LocalDateTime.class);
    }
    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(localDateTime.format(JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER));
    }

}
