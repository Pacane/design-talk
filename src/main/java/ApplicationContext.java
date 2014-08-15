public class ApplicationContext {

    private static Utilisateur utilisateurConnecte = new Utilisateur();

    public static Utilisateur obtenirUtilisateurConnecte() {
        utilisateurConnecte.email = "bobby@baube.bob";
        return utilisateurConnecte;
    }
}
