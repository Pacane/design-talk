import org.junit.Test;

public class ServicePaieElectroniqueTest {

    @Test
    public void testEnvoyerMessagePaie() throws Exception {
        // Dépendances explicites
        CalculateurPaie calculateurPaie = new CalculateurPaie();
        ServiceCourriel serviceCourriel = new ServiceCourriel();
        ServicePaieElectronique service = new ServicePaieElectronique(calculateurPaie, serviceCourriel);

        service.envoyerMessagePaie();

        // On test quoi?
    }
}