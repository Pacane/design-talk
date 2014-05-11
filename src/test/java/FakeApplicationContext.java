public class FakeApplicationContext implements ApplicationContext {
    @Override
    public Utilisateur obtenirUtilisateurConnecte() {
        final Utilisateur utilisateur = new Utilisateur();
        utilisateur.email = "bobby@baube.bob";
        return utilisateur;
    }
}
