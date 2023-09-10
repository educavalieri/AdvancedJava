package org.example.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Converter {

    public static String encode(String str) throws UnsupportedEncodingException {

        return Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));

    }

    public static String decode(String str){

        return new String(Base64.getDecoder().decode(str), StandardCharsets.UTF_8);
    }

}
