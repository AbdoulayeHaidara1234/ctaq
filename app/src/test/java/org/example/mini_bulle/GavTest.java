import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GavTest {

    @Test
    void testExtraireGroupe() {
        Gav gav = Gav.parse("org.acme:lib-a:1.0.0"); // SUT = parse()
        assertEquals("org.acme", gav.group());
    }
}