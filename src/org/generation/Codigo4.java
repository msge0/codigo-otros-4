package org.generation;

import java.util.Scanner;

public class Codigo4 {

	//se aniade main 
	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in); // se importa scanner y se aniade system.in 
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = sc.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    //se elimina este scanner no tiene utilidad
	    String j2 = sc.nextLine();
	    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }
	          break; //se aniade break

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          } //cierre de if
	          //se aniade break 
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	    }
}
