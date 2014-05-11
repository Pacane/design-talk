import org.junit.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class ServicePaieElectroniqueTest {

    @Test
    public void testEnvoyerMessagePaieFake() throws Exception {
        ApplicationContext context = new FakeApplicationContext();
        CalculateurPaie calculateurPaie = new FakeCalculateurPaie();
        ServiceCourriel serviceCourriel = new FakeServiceCourriel();
        ServicePaieElectronique service = new ServicePaieElectronique(calculateurPaie, serviceCourriel, context);

        service.envoyerMessagePaie();

        // Assert
    }

    @Test
    public void testEnvoyerMessagePaieStub() {
        ApplicationContext context = mock(ApplicationContext.class);
        Utilisateur bob = new Utilisateur();
        bob.email = "bobby@baube.bob";
        given(context.obtenirUtilisateurConnecte()).willReturn(bob);
        CalculateurPaie calculateurPaie = new FakeCalculateurPaie();
        ServiceCourriel serviceCourriel = new FakeServiceCourriel();
        ServicePaieElectronique service = new ServicePaieElectronique(calculateurPaie, serviceCourriel, context);

        service.envoyerMessagePaie();

        // Assert
    }
}