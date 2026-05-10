package main.com.learning.modernjava;

public class PatternMatching {

    void main() {


    }

    String match(Object o) {
        if (o instanceof Integer) {
            Integer i = (Integer) o;
            return "Integer " + i;
        } else if (o instanceof String) {
            String s = (String) o;
            return "String " + s.length();
        } else {
            return "Not a String or Integer";
        }
    }

    // Java 16
    String matchUsingPattern(Object o) {
        if (o instanceof Integer i) {
            return "Integer " + i;
        } else if (o instanceof String s) {
            return "String " + s.length();
        } else {
            return "Not a String or Integer";
        }
    }

    // Java 21
    String matchUsingSwitch(Object o) {
        return switch (o) {
            case Integer i  -> "Integer " + i;
            case String s -> "String " + s.length();
            case null, default -> "Not a String or Integer";
        };
    }
}
