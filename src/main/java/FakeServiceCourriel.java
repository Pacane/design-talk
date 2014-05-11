public class FakeServiceCourriel implements ServiceCourriel {
    @Override
    public void envoyerMessage(String courrielUtilisateur, int montant) {
        System.out.println(String.format("L'utilisateur %s a eu %d", courrielUtilisateur, montant));
    }
}
