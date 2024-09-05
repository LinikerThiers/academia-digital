package me.dio.academia.academia_digital.infra.jackson.deser;


import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import me.dio.academia.academia_digital.infra.utils.JavaTimeUtils;

import java.io.IOException;
import java.time.LocalDate;

/**
 * @author Venilton Falvo Jr
 */
public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

    private static final long serialVersionUID = -4589164298310392227L;

    public LocalDateDeserializer() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return LocalDate.parse(jsonParser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_FORMATTER);
    }

}
