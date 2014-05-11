class ServicePaieElectronique {

    private final CalculateurPaie calculateurPaie;
    private final ServiceCourriel serviceCourriel;
    private final ApplicationContext applicationContext;

    ServicePaieElectronique(
            CalculateurPaie calculateurPaie,
            ServiceCourriel serviceCourriel,
            ApplicationContext applicationContext) {
        this.calculateurPaie = calculateurPaie;
        this.serviceCourriel = serviceCourriel;
        this.applicationContext = applicationContext;
    }

    public void envoyerMessagePaie() {
        Utilisateur utilisateur = applicationContext.obtenirUtilisateurConnecte();

        int montant = calculateurPaie.calculerPaie(utilisateur);

        serviceCourriel.envoyerMessage(utilisateur.email, montant);
    }
}
