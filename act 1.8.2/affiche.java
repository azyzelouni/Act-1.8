import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayListeUI {


public static void main(String[] args) {


MusiqueImpl music1 = new MusiqueImpl("Billie Jean", "MJ", "interprete1", "POP");
MusiqueImpl music2 = new MusiqueImpl("Godzilla","Eminem", "interprete2", "RAP");
MusiqueImpl music3 = new MusiqueImpl("Keys to Imagination", "YANNI", "interprete3", "INSTRUMENTAL");


MusiqueImpl music4 = new MusiqueImpl("maad city", "kendrick lamar", "interprete4", "RAP");
MusiqueImpl music5 = new MusiqueImpl("freedom","pharell", "interprete5", "RNB");
MusiqueImpl music6 = new MusiqueImpl("all about us", "Tatu", "interprete6", "RNB");


List<MusiqueImpl> myList1 = new ArrayList<MusiqueImpl>() ;
List<MusiqueImpl> myList2 = new ArrayList<MusiqueImpl>() ;

PlayListe PlayListe1=new PlayListeImpl("My Hits", "Hits",5,myList1);
PlayListe PlayListe2=new PlayListeImpl("My Hits", "Hits",5,myList2);

Scanner sc = new Scanner(System.in);

System.out.println("Affichage des playlists disponibles : \n");

PlayListe1.AjouterMusiquePlaylist(music1);
PlayListe1.AjouterMusiquePlaylist(music2);
PlayListe1.AjouterMusiquePlaylist(music3);

PlayListe2.AjouterMusiquePlaylist(music4);
PlayListe2.AjouterMusiquePlaylist(music5);
PlayListe2.AjouterMusiquePlaylist(music6);

myList1.addAll(myList2);
PlayListe1.afficherPlayListe();

System.out.println("\ndonner le titre ou l'auteur de la musique : ");
String musique = sc.nextLine();


}

}

