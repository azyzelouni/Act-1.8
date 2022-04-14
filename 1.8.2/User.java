package playlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class User {
	
	String nom;
	String pr�nom;
	String Pseudo;
	ArrayList<PlayListlmpl> playlist = new ArrayList<PlayListlmpl>();
	
	
	public User(String nom, String pr�nom, String pseudo, ArrayList<PlayListlmpl> playlist) {
		super();
		this.nom = nom;
		this.pr�nom = pr�nom;
		Pseudo = pseudo;
		this.playlist = playlist;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

	public String getPseudo() {
		return Pseudo;
	}

	public void setPseudo(String pseudo) {
		Pseudo = pseudo;
	}

	
	public ArrayList<PlayListlmpl> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<PlayListlmpl> playlist) {
		this.playlist = playlist;
	}
	
		 

	//RechercheMusique par titre
	public Musiquelmpl rechercherMusiqueParTitre(ArrayList<Musiquelmpl> monCompte, String titre) {
		for (Musiquelmpl musiqueImpl : monCompte) {
			boolean recherche=false;
			if (musiqueImpl.getTitre().equals(titre))
			{recherche=true;
			System.out.println("Musique trouv�");}
		else
			{System.out.println("Aucune musique trouver");}

				return musiqueImpl;
				}
		
		return null;
		}	
	//RechercheMusique par auteur
		public Musiquelmpl rechercherMusiqueParAuteur(ArrayList<Musiquelmpl> array, String auteur) {
			for (Musiquelmpl musiqueImpl : array) {
				boolean recherche=false;
				if (musiqueImpl.getAutheur().equals(auteur)) 
					{recherche=true;
					System.out.println("Musique trouv�");}
				else
					{System.out.println("Aucune musique trouver");}

					return musiqueImpl;
					}
					
			return null;
		}
		//Afficher les playlist
		public void Afficherlesplaylist(ArrayList<PlayListlmpl> monCompte) {
			for(PlayListlmpl pl: monCompte)
			System.out.println(pl);}
		
		   // supprimer musique
		public void SupprimerMusique(ArrayList<Musiquelmpl> playlist, String Musique1) {
			for(Musiquelmpl m: playlist) {
			if(m.getTitre().equals(Musique1)) {
			playlist.remove(m);
			break;}
			}}
		
		//Comparator pour le tri par ordre croissant

				public static Comparator<Musiquelmpl> ComparatorTitreCroissant = new Comparator<Musiquelmpl>() {

					@Override
					public int compare(Musiquelmpl e1, Musiquelmpl e2) {
						return e1.getTitre().compareTo(e2.getTitre());
					}
				};
						
						

		// Comparator pour le tri par ordre d�croissant

		public static Comparator<Musiquelmpl> ComparatorTitreDecroissant = new Comparator<Musiquelmpl>() {

			@Override
		public int compare(Musiquelmpl e1, Musiquelmpl e2) {
		return e2.getTitre().compareTo(e1.getTitre());
			}
		};
				
				
				
		// Fonction Affichage playliste dans l'ordre croissant
			public void triCroissant(ArrayList<Musiquelmpl> arrayList) {
											
			Collections.sort(arrayList, ComparatorTitreDecroissant );
			System.out.println("Affichage de la playliste ordonn�e par titre dans l'ordre croissant : "); 
			for (Musiquelmpl e:arrayList) { 
					System.out.println(e);
						}}

		// Fonction Affichage playliste dans l'ordre d�croissant
				public void triDeCroissant(ArrayList<Musiquelmpl> arrayList) {
				Collections.reverse(arrayList);
				System.out.println("Affichage de la playliste ordonn�e dans l'ordre d�croissant par titre : ");
		}
}
