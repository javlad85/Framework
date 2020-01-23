package com.cerebus.program;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		/*String pseudo = "vladimir";
		String [] names= { "vladimir", "Billy", "Peterson"};
		
		if(pseudo == names[2]) {
			System.out.println("c'est bien lui, l'enfoire!");
		}else
		{
			System.out.println("celui la c Peterson");
		
		}*/
	
		int solde = 3000;
		int retrait = 20;
		int depot = 500;
		int n_solde = 0;
		
		if(retrait <=10) {
			n_solde = solde-0;
			System.out.println(n_solde +  "veuillez rentrer un montant superieur a 10");
		}
		//if(retrait == 3000){
		//	System.out.println("le montant ne peut pas etre egal a votre solde ");
		//}
		else if (n_solde == solde-retrait) {
			System.out.println("votre nouveau solde");
		}
		//if(retrait <=3000){
		//	System.out.println("impossible");
		//}
		
	}

}
