import java.util.Random;

class RealCalculateurPaie implements CalculateurPaie {
    public int calculerPaie(Utilisateur utilisateur) {
        return new Random().nextInt();
    }
}
