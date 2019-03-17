package AlgorytmProsty;

class Szukanie {

     static int szukaj(int[] wek, int liczba_szukana) {
      
        for (int i = 0; i < wek.length; i++) {
            if ( wek[i] == liczba_szukana) 
                return i;
            }
            return -1;
        }
    }

    