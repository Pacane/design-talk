import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

class PaieService {

    CourrielService courrielService;

    PaieService() {
        courrielService = new CourrielService();
    }

    public void envoyerMessagePaie(String email, String prenom, String nom, int montant) {

        Path path = FileSystems.getDefault().getPath("", "template.html");
        try {
            String contenu = Files.lines(path)
                    .map(s -> s.replace("$email", email))
                    .map(s -> s.replace("$prenom", prenom))
                    .map(s -> s.replace("$nom", nom))
                    .map(s -> s.replace("$montant", Integer.toString(montant)))
                    .collect(Collectors.joining());
            courrielService.envoyerMessage(email, contenu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
