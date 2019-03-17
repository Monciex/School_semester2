package AlgorytmProsty;

class Main {

    public static void main(String[] args) {

     int[] wek = {7,9,12,13,14,14,17,45,57,89,95};
     int liczba_szukana = 7;

     if(Szukanie.szukaj(wek, liczba_szukana) == -1) {
         System.out.println("Brak liczy w tablicy");
     }
     else {
        System.out.println(Szukanie.szukaj(wek, liczba_szukana));
     }
    }
}




            


   
    


     






     