import java.lang.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("wprowadź 5 elementów do tablicy 1");
   
    String tablica1[] = new String[5];

    for (int i=0;i<5;i++){
      tablica1[i]= scan.nextLine();
    }

    String tablica2[] = new String[5];

    for (int i=0;i<5;i++){
      tablica2[i]=tablica1[i];
    }
    for(int i=0;i<5;i++){
      System.out.println(tablica2[i]);
    }
}
}