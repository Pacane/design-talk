class PaieService {

    public void envoyerMessagePaie(String email, int montant) {
        String message = String.format("Bonjour %s, vous avez gagné %s", email, montant);

        CourrielService courrielService = new CourrielService();
        courrielService.envoyerMessage(email, message);
    }
}
