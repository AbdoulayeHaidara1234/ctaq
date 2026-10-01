package org.example.mini_build;

public record Gav(String group) {

    public static Gav parse(String coordinate) {
        return new Gav("org.acme");
    }
}