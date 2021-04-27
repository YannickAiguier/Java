package Demenagement;

import java.util.Scanner;

public class OnDemenage {
	public static void main(String[] args) {
		int nbcartons;
		int nbrestants = 9;
		int nbdanscamion = 0;
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Nombre de cartons à déménager : ");
		nbcartons = clavier.nextInt();
		clavier.nextLine();
		while (nbcartons > 0) {
			if (nbcartons < 9) {
				nbrestants = nbcartons;
			}
			while (nbdanscamion < nbrestants) {
				// mettre 1 carton dans le camion
				nbdanscamion = nbdanscamion + 1;
				nbcartons = nbcartons - 1;
			}
			if (nbdanscamion > 1) {
				System.out.println("Un voyage de " + nbdanscamion + " cartons");
			} else {
				System.out.println("Un voyage de " + nbdanscamion + " carton");
			}
			nbdanscamion = 0;
		}
		clavier.close();
	}
}
