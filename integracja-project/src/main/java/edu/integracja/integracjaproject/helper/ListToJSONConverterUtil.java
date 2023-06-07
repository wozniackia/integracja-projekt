package edu.integracja.integracjaproject.helper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class ListToJSONConverterUtil<T> {
    public String convert(List<T> list) {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(out, list);
        } catch (IOException e) {
        throw new RuntimeException(e);
        }
        return out.toString();
    }
}
