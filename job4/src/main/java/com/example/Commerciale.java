package com.example;

import java.util.Scanner;
import java.util.Vector;
import java.util.Date;

public class Commerciale {

    private Vector<Article> articles = new Vector<>();
    private Vector<Client> clients = new Vector<>();
    private Vector<Commande> commandes = new Vector<>();
    private Vector<Ligne> lignes = new Vector<>();

    public void passerCommande(Commande c) {
        // Méthode pour passer une commande
        commandes.add(c);
    }

    public void annulerCommande(Commande c) {
        // Méthode pour annuler une commande
        commandes.remove(c);
    }

    public void ajouterArticle(Article a) {
        // Méthode pour ajouter un article
        articles.add(a);
    }

    public void supprimerArticle(Article a) {
        // Méthode pour supprimer un article
        articles.remove(a);
    }

    public void ajouterClient(Client c) {
        // Méthode pour ajouter un client
        clients.add(c);
    }

    public void supprimerClient(Client c) {
        // Méthode pour supprimer un client
        clients.remove(c);
    }

    public static void main(String[] args) {
        // Méthode principale du programme

        Scanner scanner = new Scanner(System.in);
        Commerciale commerciale = new Commerciale();
        boolean quit = false;

        while (!quit) {
            System.out.println("\n=== Menu Gestion Commerciale ===");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Supprimer un article");
            System.out.println("3. Ajouter un client");
            System.out.println("4. Supprimer un client");
            System.out.println("5. Passer une commande");
            System.out.println("6. Annuler une commande");
            System.out.println("7. Afficher les articles");
            System.out.println("8. Afficher les clients");
            System.out.println("9. Afficher les commandes");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Référence: ");
                    int reference = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Désignation: ");
                    String designation = scanner.nextLine();
                    System.out.print("Prix Unitaire: ");
                    double prixUnitaire = scanner.nextDouble();
                    System.out.print("Quantité en Stock: ");
                    int quantiteStock = scanner.nextInt();
                    Article article = new Article(reference, designation, prixUnitaire, quantiteStock);
                    commerciale.ajouterArticle(article);
                    System.out.println("Article ajouté avec succès !");
                    break;
                case 2:
                    System.out.print("Référence de l'article à supprimer: ");
                    reference = scanner.nextInt();
                    article = commerciale.articles.stream()
                        .filter(a -> a.getReference() == reference)
                        .findFirst()
                        .orElse(null);
                    if (article != null) {
                        commerciale.supprimerArticle(article);
                        System.out.println("Article supprimé avec succès !");
                    } else {
                        System.out.println("Article non trouvé !");
                    }
                    break;
                case 3:
                    System.out.print("Identité: ");
                    int identite = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nom Social: ");
                    String nomSocial = scanner.nextLine();
                    System.out.print("Adresse: ");
                    String adresse = scanner.nextLine();
                    System.out.print("Chiffre d'Affaire: ");
                    double chiffreAffaire = scanner.nextDouble();
                    Client client = new Client(identite, nomSocial, adresse, chiffreAffaire);
                    commerciale.ajouterClient(client);
                    System.out.println("Client ajouté avec succès !");
                    break;
                case 4:
                    System.out.print("Identité du client à supprimer: ");
                    identite = scanner.nextInt();
                    client = commerciale.clients.stream()
                        .filter(c -> c.getIdentite() == identite)
                        .findFirst()
                        .orElse(null);
                    if (client != null) {
                        commerciale.supprimerClient(client);
                        System.out.println("Client supprimé avec succès !");
                    } else {
                        System.out.println("Client non trouvé !");
                    }
                    break;
                case 5:
                    System.out.print("Numéro de Commande: ");
                    int numeroCommande = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Date de Commande (yyyy-MM-dd): ");
                    String dateCommandeStr = scanner.nextLine();
                    System.out.print("Identité du Client: ");
                    identite = scanner.nextInt();
                    client = commerciale.clients.stream()
                        .filter(c -> c.getIdentite() == identite)
                        .findFirst()
                        .orElse(null);
                    if (client != null) {
                        try {
                            Date dateCommande = new Date(); // Convertir la date
                            Commande commande = new Commande(numeroCommande, dateCommande, client);
                            commerciale.passerCommande(commande);
                            System.out.println("Commande passée avec succès !");
                        } catch (Exception e) {
                            System.out.println("Format de date invalide !");
                        }
                    } else {
                        System.out.println("Client non trouvé !");
                    }
                    break;
                case 6:
                    System.out.print("Numéro de la commande à annuler: ");
                    numeroCommande = scanner.nextInt();
                    Commande commande = commerciale.commandes.stream()
                        .filter(c -> c.getNumeroCommande() == numeroCommande)
                        .findFirst()
                        .orElse(null);
                    if (commande != null) {
                        commerciale.annulerCommande(commande);
                        System.out.println("Commande annulée avec succès !");
                    } else {
                        System.out.println("Commande non trouvée !");
                    }
                    break;
                case 7:
                    System.out.println("Liste des articles:");
                    for (Article a : commerciale.articles) {
                        a.affiche();
                        System.out.println("-------------------");
                    }
                    break;
                case 8:
                    System.out.println("Liste des clients:");
                    for (Client c : commerciale.clients) {
                        c.affiche();
                        System.out.println("-------------------");
                    }
                    break;
                case 9:
                    System.out.println("Liste des commandes:");
                    for (Commande c : commerciale.commandes) {
                        c.affiche();
                        System.out.println("-------------------");
                    }
                    break;
                case 0:
                    quit = true;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide !");
            }
        }

        scanner.close();
    }
}
