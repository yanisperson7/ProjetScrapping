package fr.cda.voiture.projetscrapping.model;

/**
 * Annonce de voiture d'occasion récupérée sur un site de vente
 * (Leboncoin, La Centrale ou AutoScout24).
 */
public class AnnonceVoiture {
    private int idAnnonce;
    private String marque;
    private String modele;
    private Energie energie;
    private int kms;
    private int prix;
    private int annee;
    private String lieu;
    private Transmission transmission;
    private String urlPhoto;
    private String description;
    private Site site;
    private String urlAnnonce;


    public AnnonceVoiture(int idAnnonce, String marque, String modele, Energie energie, int kms, int prix, int annee, String lieu, Transmission transmission, String urlPhoto, String description, Site site, String urlAnnonce) {
        this.idAnnonce = idAnnonce;
        this.marque = marque;
        this.modele = modele;
        this.energie = energie;
        this.kms = kms;
        this.prix = prix;
        this.annee = annee;
        this.lieu = lieu;
        this.transmission = transmission;
        this.urlPhoto = urlPhoto;
        this.description = description;
        this.site = site;
        this.urlAnnonce = urlAnnonce;
    }

    public AnnonceVoiture(String marque, String modele, Energie energie, int kms, int prix, int annee, String lieu, Transmission transmission, String urlPhoto, String description, Site site, String urlAnnonce) {
        this.marque = marque;
        this.modele = modele;
        this.energie = energie;
        this.kms = kms;
        this.prix = prix;
        this.annee = annee;
        this.lieu = lieu;
        this.transmission = transmission;
        this.urlPhoto = urlPhoto;
        this.description = description;
        this.site = site;
        this.urlAnnonce = urlAnnonce;
    }

    public int getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce(int idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Energie getEnergie() {
        return energie;
    }

    public void setEnergie(Energie energie) {
        this.energie = energie;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getUrlAnnonce() {
        return urlAnnonce;
    }

    public void setUrlAnnonce(String urlAnnonce) {
        this.urlAnnonce = urlAnnonce;
    }

    @Override
    public String toString() {
        return "AnnonceVoiture{" +
                "idAnnonce=" + idAnnonce +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", energie=" + energie +
                ", kms=" + kms +
                ", prix=" + prix +
                ", annee=" + annee +
                ", lieu='" + lieu + '\'' +
                ", transmission=" + transmission +
                ", urlPhoto='" + urlPhoto + '\'' +
                ", description='" + description + '\'' +
                ", site=" + site +
                ", urlAnnonce='" + urlAnnonce + '\'' +
                '}';
    }
}
