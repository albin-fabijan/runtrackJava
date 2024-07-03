package com.example;

// Classe abstraite Carte
abstract class Carte {
    protected int cout;

    public Carte(   int cout) {
        this.cout = cout;
        System.out.println(this.getClass().getSimpleName() + " créée");
    }

    public abstract void afficher();
}

// Classe Terrain
class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur) {
        super(0);  // Le coût d'un terrain est toujours 0
        this.couleur = couleur;
    }

    @Override
    public void afficher() {
        System.out.println("Terrain [Couleur: " + couleur + ", Coût: " + cout + "]");
    }
}

// Classe Creature
class Creature extends Carte {
    private String nom;
    private int pointsDegats;
    private int pointsVie;

    public Creature(String nom, int pointsDegats, int pointsVie, int cout) {
        super(cout);
        this.nom = nom;
        this.pointsDegats = pointsDegats;
        this.pointsVie = pointsVie;
    }

    @Override
    public void afficher() {
        System.out.println("Créature [Nom: " + nom + ", Dégâts: " + pointsDegats + ", Vie: " + pointsVie + ", Coût: " + cout + "]");
    }
}

// Classe Sortilege
class Sortilege extends Carte {
    private String nom;
    private String explication;

    public Sortilege(String nom, String explication, int cout) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
    }

    @Override
    public void afficher() {
        System.out.println("Sortilège [Nom: " + nom + ", Explication: " + explication + ", Coût: " + cout + "]");
    }
}

// Classe Jeu
class Jeu {
    private Carte[] cartes;
    private int index;

    public Jeu() {
        cartes = new Carte[10];
        index = 0;
    }

    public void piocher(Carte carte) {
        if (index < 10) {
            cartes[index] = carte;
            index++;
        } else {
            System.out.println("Le jeu est plein !");
        }
    }

    public void jouer() {
        for (int i = 0; i < index; i++) {
            if (cartes[i] != null) {
                cartes[i].afficher();
                cartes[i] = null;  // La carte jouée est mise à null
                break;
            }
        }
    }

    public void afficher() {
        System.out.println("Contenu du jeu :");
        for (int i = 0; i < index; i++) {
            if (cartes[i] != null) {
                cartes[i].afficher();
            }
        }
    }

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        
        jeu.piocher(new Terrain('B'));
        jeu.piocher(new Creature("Dragon", 5, 8, 3));
        jeu.piocher(new Sortilege("Boule de Feu", "Inflige 3 dégâts à l'adversaire", 2));
        
        jeu.afficher();
        
        System.out.println("\nJouer une carte:");
        jeu.jouer();
        
        System.out.println("\nContenu du jeu après avoir joué une carte:");
        jeu.afficher();
    }
}
