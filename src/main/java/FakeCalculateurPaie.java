public class FakeCalculateurPaie implements CalculateurPaie {
    @Override
    public int calculerPaie(Utilisateur utilisateur) {
        return 100;
    }
}
