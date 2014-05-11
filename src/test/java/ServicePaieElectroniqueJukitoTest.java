import javax.inject.Inject;
import javax.inject.Provider;

import org.jukito.JukitoRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(JukitoRunner.class)
public class ServicePaieElectroniqueJukitoTest {

    @Inject
    Provider<ServicePaieElectronique> provider;

    @Test
    public void test(CalculateurPaie calculateurPaie, ServiceCourriel serviceCourriel, ApplicationContext applicationContext) {
        Utilisateur bob = new Utilisateur();
        bob.email = "baube";
        given(applicationContext.obtenirUtilisateurConnecte()).willReturn(bob);
        given(calculateurPaie.calculerPaie(bob)).willReturn(10);

        provider.get().envoyerMessagePaie();

        verify(serviceCourriel).envoyerMessage(bob.email, 10);
    }
}