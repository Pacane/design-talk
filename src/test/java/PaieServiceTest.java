import org.junit.Test;

public class PaieServiceTest {

    @Test
    public void testEnvoyerMessagePaie() throws Exception {
        PaieService service = new PaieService();

        service.envoyerMessagePaie("courriel@gmail.com", "Joel", "Trottier-Hebert", 200);

        // Comment tester? Quoi tester?
    }
}