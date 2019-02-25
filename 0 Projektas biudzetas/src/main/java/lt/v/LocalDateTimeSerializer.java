package lt.v;

        import com.fasterxml.jackson.core.JsonGenerator;
        import com.fasterxml.jackson.databind.JsonSerializer;
        import com.fasterxml.jackson.databind.SerializerProvider;
        import com.fasterxml.jackson.databind.ser.std.StdSerializer;

        import java.io.IOException;
        import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;

public class LocalDateTimeSerializer extends StdSerializer<LocalDateTime> {

    public LocalDateTimeSerializer() {
        super(LocalDateTime.class);
    }

    protected LocalDateTimeSerializer(Class<LocalDateTime> t) {
        super(t);
    }

    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
