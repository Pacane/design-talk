class ServicePaieElectronique {

    private final CalculateurPaie calculateurPaie;
    private final ServiceCourriel serviceCourriel;

    ServicePaieElectronique(CalculateurPaie calculateurPaie, ServiceCourriel serviceCourriel) {
        this.calculateurPaie = calculateurPaie;
        this.serviceCourriel = serviceCourriel;
    }

    public void envoyerMessagePaie() {
        Utilisateur utilisateur = ApplicationContext.obtenirUtilisateurConnecte();

        int montant = calculateurPaie.calculerPaie(utilisateur);

        serviceCourriel.envoyerMessage(utilisateur.email, montant);
    }
}
