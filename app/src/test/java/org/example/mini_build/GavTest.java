package org.example.mini_build;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GavTest {

    @Test
    void testExtraireGroupe() {
        Gav gav = Gav.parse("org.acme:lib-a:1.0.0"); // SUT = parse()
        assertEquals("org.acme", gav.group());
    }

    @Test
    void testExtraireGroupeArtifactVersion() {
        Gav gav = Gav.parse("org.other:lib-c:3.0.0");
        assertEquals("org.other", gav.group());
        assertEquals("lib-c", gav.artifact());
        assertEquals("3.0.0", gav.version());
    }
}