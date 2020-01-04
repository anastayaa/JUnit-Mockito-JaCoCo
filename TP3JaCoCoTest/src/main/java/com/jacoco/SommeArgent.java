package com.jacoco;


public class SommeArgent {
    private int quantite;
    private String unite;

    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
        if (!m.getUnite().equals(this.getUnite())) {
            throw new UniteDistincteException(this, m);
        } else {
            return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
        }
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject != null) {
            SommeArgent sommeArgent = (SommeArgent) anObject;
            return (this.getQuantite() == sommeArgent.getQuantite() &&
                    this.getUnite().equals(sommeArgent.getUnite()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "SommeArgent{" +
                "quantite=" + quantite +
                ", unite='" + unite + '\'' +
                '}';
    }
}
