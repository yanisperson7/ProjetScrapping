package fr.cda.voiture.projetscrapping.model;

/**
 * Type de transmission d'une voiture.
 */
public enum Transmission {
    AUTOMATIQUE("Automatique"),
    MANUELLE("Manuelle"),
    INCONNUE("Inconnue");

    private final String libelle;

    /**
     * Construit une valeur de Transmission avec le libellé.
     *
     * @param libelle le texte à afficher
     */
    Transmission(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return le libellé affichable de la transmission
     */
    public String getLibelle() {
        return libelle;
    }
}
