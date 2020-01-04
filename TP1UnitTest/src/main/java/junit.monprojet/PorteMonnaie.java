package junit.monprojet;

import java.util.HashMap;
import java.util.Objects;

public class PorteMonnaie {

    private HashMap<String, Integer> contenu;

    public HashMap<String, Integer> getContenu() {
        return contenu;
    }

    public PorteMonnaie() {
        contenu = new HashMap<String, Integer>();
    }

    public void ajouteSomme(SommeArgent sa) {
        if (contenu.containsKey(sa.getUnite())) {
            contenu.put(sa.getUnite(), contenu.get(sa.getUnite()) + sa.getQuantite());
        }
        else{
            contenu.put(sa.getUnite(), sa.getQuantite());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PorteMonnaie that = (PorteMonnaie) o;
        return Objects.equals(contenu, that.contenu);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "PorteMonnaie{" +
                "contenu=" + contenu +
                '}';
    }
}
