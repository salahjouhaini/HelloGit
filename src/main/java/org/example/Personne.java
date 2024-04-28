package org.example;

public class Personne {
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    public Personne(Long id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(){
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
}
