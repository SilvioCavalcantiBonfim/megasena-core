package spi;

import exception.InvalidInputTypeException;

public interface Input {
    int nextInt() throws InvalidInputTypeException;
    void clearBuffer();
    void close();
}
