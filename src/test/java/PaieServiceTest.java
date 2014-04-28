import org.junit.Test;

public class PaieServiceTest {

    @Test
    public void testEnvoyerMessagePaie() throws Exception {
        PaieService service = new PaieService();

        service.envoyerMessagePaie("monCourriel@gmail.com", 100);
    }
}