package com.exception;

public class TestMainException {

    public static void main(String[] args) throws CustomCheckedException {
        throwException(false);
    }

    static void throwException(boolean unchecked) throws CustomCheckedException {
        if (unchecked)
            throw new CustomUncheckedException("Custom Unchecked Exception");
        else
            throw new CustomCheckedException("Custom checked Exception");
    }
}
