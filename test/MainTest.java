import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main testing = new Main();

    @Test
    void sum() {
        Integer result = testing.sum(1, 2);
        assertEquals(3, result, "Il risultato dovrebbe essere 3" );
    }
    @Test
    void sommaDiIntegerNegativo() {
        Integer result = testing.sum(- 1, 2);
        assertEquals(1, result, "Il risultato dovrebbe essere 1" );
    }
    @Test
    void sommaDiIntegerNull() {
        Integer result = testing.sum(null, 2);
        //assertEquals(null, result, "Il risultato dovrebbe essere null" );
        assertNull(result);
    }
    @Test
    void moltiplicazioneDiDueInteger() {
        Integer result = testing.moltiplicazione(1, 2);
        assertEquals(2, result, "Il risultato dovrebbe essere 2" );

    }
}