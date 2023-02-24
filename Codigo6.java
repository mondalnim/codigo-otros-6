public class codigo6 {
	  
	    int[] n = new int[20];//se agregó el new

	    for (int i = 0; i < 20; i++) {//faltaba signo + en el for
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " "); //completar el print
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");//faltaba n en rl print
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine();//faltaba paréntesis

	    int multiplo = (opcion == 1) ? 5 : 7; //esta mal este ternario, cambio del lugar de ? y :

	    foreach (char e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	       else {
	        System.in.print(e + " ");
	      }
	    }
	  
	}