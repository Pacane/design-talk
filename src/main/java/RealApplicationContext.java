public class RealApplicationContext implements ApplicationContext {
    @Override
    public Utilisateur obtenirUtilisateurConnecte() {
        return new Utilisateur();
    }
}
