package School_semester2.AlgorytmZamiana;

import java.util.Arrays;

class Main { 

 public static void main(String[] args) {

int[] wek = {7,9,12,13,14,17,45,57,89,95,0,0,0,0,0};
int[] wek2 = new int[wek.length + 1 ];
int liczba_dostawiona = 100;
int miejsce_dostawienia = 5;
boolean Sorotwanie = true; // ON/OFF Sorotowania 
int temp;

for(int i = 0; i < wek.length; i++) {
    if(i < miejsce_dostawienia) {
        wek2[i] = wek[i];
    }
    if(i == miejsce_dostawienia) { 
        wek2[miejsce_dostawienia] = liczba_dostawiona;
    }
    if(i >= miejsce_dostawienia) {
        wek2[i + 1] = wek[i]; 
    }
}
if(Sorotwanie == true) {
    for(int i=0; i<wek2.length-1; i++){
        if(wek2[i]>wek2[i+1]){
        temp = wek2[i+1];
        wek2[i+1] = wek2[i];
        wek2[i] = temp;
}
    
}
}



System.out.println(Arrays.toString(wek2));
 }
}
 




    

