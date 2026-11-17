package fr.cda.voiture.projetscrapping.model;

/**
 * Site choisi par l'utilisateur.
 */
public enum Site {
    LEBONCOIN("leBoncoin"),
    LACENTRALE("LaCentrale"),
    AUTOSCOUT24("AutoScout24");

    private final String libelle;

    /**
     * Construit une valeur de site avec le libellé.
     *
     * @param libelle le texte à afficher
     */
    Site(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return le libellé affichable du site
     */
    public String getLibelle() {
        return libelle;
    }
}
