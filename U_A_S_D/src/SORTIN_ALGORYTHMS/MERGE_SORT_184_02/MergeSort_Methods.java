package SORTIN_ALGORYTHMS.MERGE_SORT_184_02;

public class MergeSort_Methods {

    // Divide Method
public static void Divide(int[] ARR, int l, int r ){

    if(l < r){ // Дъно на рекурсията
        int m = (l + r) / 2; // ОПРЕДЕЛЯМЕ СРЕДНАТА ТОЧКА ЗА РАЗДЕЛЯНЕ

        Divide(ARR,l,m);// СОРТИРАМЕ ЛЕВИЯ
        Divide(ARR,m+1,r);// СОРТИРАМЕ ДЕСНИЯ

        SortAndMerge(ARR,l,m,r);// СЛИВАМЕ
    }
}// end of Divide



    // SortAndMerge Method
public static void SortAndMerge(int[] ARR, int l, int m, int r){

    int n1 = m - l + 1;//Дължина на левия помощен масив
    int n2 = r - m;//Дължината на десния помощен масив

    int[] L = new int[n1];// Ляв помощен масив
    int[] R = new int[n2];// Десен помощен масив


    // Запълване на помощните масиви със стойности от оригиналния масив
    for (int i = 0; i < n1; i++) {
        L[i] = ARR[l+i];
    }


    for (int j = 0; j < n2; j++) {
        R[j] = ARR[m+1+j]; // m = 2; Според обяснението за конкректния пример
    }

    // Сравняване и обединяване на Ляв и Десен помощни масиви :
    int i = 0;// Променлива за индекса на елемент на Левия масив
    int j = 0;// Променлива за индекса на елемент на Десния масив
    int k = l;//Променлива за индекса на елемнта на обединяващия масив

    while(i < n1 && j < n2){
        if (L[i] <= R[j]){
            ARR[k] = L[i];
            i++;
        }else{
            ARR[k] = R[j];
            j++;
        }
        k++;
    }


    //Копираме всички оставащи елементи ако има такива:
    // за Левия масив
    while(i<n1){
        ARR[k] = L[i];
        i++;
        k++;
    }

    // за Десния масив
    while(j<n2){
        ARR[k] = R[j];
        j++;
        k++;
    }

}// end of SortAndMerge



}// еnd of class
