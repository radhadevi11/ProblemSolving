package com.radha.onlineproblems.bytes;

import org.junit.Test;

public class StringLengthDecodingTest {

    @Test
    public void alphaEncoding() {
        StringLengthDecoding decoding = new StringLengthDecoding();
        decoding.alphaEncoding(0, "a2b3c2");
    }
    @Test
    public void alphaEncodingEndWithChar() {
        StringLengthDecoding decoding = new StringLengthDecoding();
        decoding.alphaEncoding(0, "a2b3c");
    }
    @Test
    public void alphaEncodingEndWith2Char() {
        StringLengthDecoding decoding = new StringLengthDecoding();
        decoding.alphaEncoding(0, "a2bc");
    }
    @Test
    public void alphaEncodingSingleCharInMid() {
        StringLengthDecoding decoding = new StringLengthDecoding();
        decoding.alphaEncoding(0, "a2bc3d2e");
    }
}