/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstLibrary;

/**
 *
 * @author tss
 */
public class LibreriaFunzioniArray {
    
    private LibreriaFunzioniArray() {

}
    
    /**
     * Ordinamento con bubble sort!
     *
     * @param array
     */
    public static void ordina(Comparable[] array) {
        boolean disordinato;

        do {
            disordinato = false;
            for (int i = 0; i < array.length - 1; i++) {
                Comparable p = array[i];
                Comparable pNext = array[i + 1];
                if (p.compareTo(pNext) >= 0) {
                    
                    //scambio le posizioni
                    array[i] = pNext;
                    array[i + 1] = p;

                    disordinato = true;
                }
            }
        } while (disordinato);

    }
    
     public static void stampa(Object[] objects) {
        System.out.println("---------------STAMPA---------------");
        for (Object object : objects) {               //metodo for "ristretto" per sfogliare il contenuto dell'array e stamparlo a video
            System.out.println(object.toString());
        }
        System.out.println("------------FINE STAMPA-------------");
    }
     
     /**
      * 
      * @param objects Array dove ricercare
      * @param item Oggetto da cercare
      * @return return -1 se non trova l'oggetto
      */
    
     public static int cerca (Object [] objects, Object item) {
         int result = -1;
         for (int i = 0; i < objects.length; i++) {
             if (objects[i].equals(item)){
                 result = i;
                 break;
             }
         }
         return result;
             
         }
     /**
      * 
      * @param objects Array dove eseguire la ricerca
      * @param item Oggetto da ricercare
      * @return true se esiste, false se non esiste
      */
     
     public static boolean contiene (Object [] objects, Object item) {
         return cerca(objects, item) != -1;
     }
}
