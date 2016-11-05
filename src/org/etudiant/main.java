package org.etudiant;

import java.util.Scanner;

public class main extends Etudiant {

	private Scanner scanner = new Scanner(System.in);
	public void main(String[] args) {
		System.out.println("Quel est le nom de votre etudiant(e)?");
		String lastName = scanner.nextLine();
		
		System.out.println("Quel est le prenom de votre etudiant(e)?");
		String firstName = scanner.nextLine();
		System.out.println("Quelle est l'ecole de votre etudiant(e)?");
		System.out.println("Quel est l'age de votre etudiant(e)?");
		System.out.println("Votre etudiant(e) est-il en couple?");
		System.out.println("Votre etudiant(e) est-il social(e)");
		
		Etudiant etudiant;
	}

}
