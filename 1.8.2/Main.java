package playlist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Musiquelmpl m1=new Musiquelmpl("Sweat", "snoopdog","NA", "Pop");
		Musiquelmpl m2=new Musiquelmpl("Humble", "KL", "RAS", "Hip Hop");
		m1.AfficherMusique();
		m2.AfficherMusique();
		m1.RessemblanceMusique(m1, m2);
		ArrayList<Musiquelmpl> Liste1 = new ArrayList<>() ;
		ArrayList<Musiquelmpl> Liste2 = new ArrayList<>();
		ArrayList<Musiquelmpl> Liste3 = new ArrayList<>();
		PlayListlmpl pl1=new PlayListlmpl("john", "Hip Hop", 2, Liste1);
		PlayListlmpl pl2=new PlayListlmpl("aziz", "pop", 3, Liste2);
		PlayListlmpl pl3=new PlayListlmpl("elouni", "Rap", 1, Liste3);
		pl1.AjouterMusique(m1);
		pl1.AjouterMusique(m2);
		pl1.AfficherPlaylist();
		ArrayList<PlayListlmpl> monCompte=new ArrayList<>() ;
		monCompte.add(pl1);
		monCompte.add(pl2);
		
		User user1=new User("elouni", "aziz", "aziz2", monCompte);
		user1.rechercherMusiqueParTitre(Liste1, "Sweat");
		user1.rechercherMusiqueParAuteur(Liste1, "Snoopdog");
		user1.SupprimerMusique(Liste3, "Humble");
		user1.Afficherlesplaylist(monCompte);
		user1.triCroissant(Liste1);
		user1.triDeCroissant(Liste1);

	}   

}
