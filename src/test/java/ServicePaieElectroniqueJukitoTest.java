import javax.inject.Inject;
import javax.inject.Provider;

import org.jukito.JukitoRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import autofixture.publicinterface.Fixture;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(JukitoRunner.class)
public class ServicePaieElectroniqueJukitoTest {

    @Inject
    Provider<ServicePaieElectronique> provider;
    public int MONTANT_PAIE;

    @Inject
    private ApplicationContext applicationContext;
    private Utilisateur bob;

    @Before
    public void setup() {
        Fixture fixture = new Fixture();
        bob = fixture.create(Utilisateur.class);
        MONTANT_PAIE = fixture.create(int.class);
    }

    @Test
    public void devraitEnvoyerCourrielAvecMontantPaie(CalculateurPaie calculateurPaie, ServiceCourriel serviceCourriel) {
        // Given
        given(applicationContext.obtenirUtilisateurConnecte()).willReturn(bob);
        given(calculateurPaie.calculerPaie(bob)).willReturn(MONTANT_PAIE);

        // When
        provider.get().envoyerMessagePaie();

        // Then
        verify(serviceCourriel).envoyerMessage(bob.email, MONTANT_PAIE);
    }
}