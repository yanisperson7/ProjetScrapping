package fr.cda.voiture.projetscrapping.model;

/**
 * Type d'énergie (carburant) d'une voiture.
 */
public enum Energie {
    ESSENCE("Essence"),
    DIESEL("Diesel"),
    HYBRIDE("Hybride"),
    GPL("GPL"),
    ELECTRIQUE("Électrique"),
    INCONNUE("Inconnue");

    private final String libelle;

    /**
     * Construit une valeur d'énergie avec son libellé.
     *
     * @param libelle le texte à afficher
     */
    Energie(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return le libellé affichable de l'énergie
     */
    public String getLibelle() {
        return libelle;
    }
}