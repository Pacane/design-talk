import org.junit.Test;

public class ServicePaieElectroniqueTest {

    @Test
    public void testEnvoyerMessagePaie() throws Exception {

        CalculateurPaie calculateurPaie = new FakeCalculateurPaie();
        ServiceCourriel serviceCourriel = new ServiceCourriel();
        ServicePaieElectronique service = new ServicePaieElectronique(calculateurPaie, serviceCourriel);

        service.envoyerMessagePaie();

        // Résultat attendu? Déterministe!
    }
}