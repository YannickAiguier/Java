package Demenagement;

public class OnDemenage {
	public static void main(String[] args) {
		int nbcartons = 34;
		int nbrestants = 9;
		int nbdanscamion = 0;
		while (nbcartons > 0) {
		  if (nbcartons < 9) {
		    nbrestants = nbcartons;
		  }
		  while (nbdanscamion < nbrestants) {
		    // mettre 1 carton dans le camion
		    nbdanscamion = nbdanscamion + 1;
		    nbcartons = nbcartons - 1;
		  }
		  if (nbdanscamion>1) {
		    System.out.println("Un voyage de " + nbdanscamion + " cartons");
		  } else {
			  System.out.println("Un voyage de " + nbdanscamion + " carton");
		  }
		  nbdanscamion = 0;
		}
	}
}
