import org.junit.Test;

public class ServicePaieElectroniqueTest {

    @Test
    public void testEnvoyerMessagePaie() throws Exception {
        ServicePaieElectronique service = new ServicePaieElectronique();

        service.envoyerMessagePaie();

        // On test quoi?
    }
}