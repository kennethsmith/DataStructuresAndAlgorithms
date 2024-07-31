package org.example;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {

    private final static String a = "SHA-256";
    private final static Charset cs = StandardCharsets.UTF_8;

    public static String hash(String s) throws Exception {
        return hash(a, s);
    }

    public static String hash(String a, String s) throws Exception {
        try {
            byte[] h = MessageDigest.getInstance(a).digest(s.getBytes(cs));
            return new String(h, cs);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
            throw new Exception(e);
        }
    }

}
