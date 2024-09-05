package me.dio.academia.academia_digital.infra.jackson.deser;


import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import me.dio.academia.academia_digital.infra.utils.JavaTimeUtils;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @author Venilton Falvo Jr
 */
public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {
    private static final long serialVersionUID = -7209271947629593913L;

    public LocalDateTimeDeserializer() {
        super(LocalDateTime.class);
    }
    @Override
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return LocalDateTime.parse(jsonParser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER);
    }
}
