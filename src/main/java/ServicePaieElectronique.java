class ServicePaieElectronique {
    public void envoyerMessagePaie() {
        CalculateurPaie calculateurPaie = new CalculateurPaie();
        ServiceCourriel serviceCourriel = new ServiceCourriel();
        Utilisateur utilisateur = ApplicationContext.obtenirUtilisateurConnecte();

        int montant = calculateurPaie.calculerPaie(utilisateur);

        serviceCourriel.envoyerMessage(utilisateur.email, montant);
    }
}
