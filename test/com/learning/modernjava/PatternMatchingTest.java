package com.learning.modernjava;

import main.com.learning.modernjava.PatternMatching;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatternMatchingTest {

    PatternMatching patternMatching = new PatternMatching();

    @ParameterizedTest
    @MethodSource("input")
    void match(Object value, String expectedResult) {
        var output =  patternMatching.match(value);
        assertEquals(expectedResult, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void matchUsingPattern(Object value, String expectedResult) {
        var output =  patternMatching.matchUsingPattern(value);
        assertEquals(expectedResult, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void matchUsingSwitch(Object value, String expectedResult) {
        var output =  patternMatching.matchUsingSwitch(value);
        assertEquals(expectedResult, output);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("Dilip", "String 5"),
                Arguments.of(1, "Integer 1"),
                Arguments.of(null, "Not a String or Integer")
        );
    }
}
