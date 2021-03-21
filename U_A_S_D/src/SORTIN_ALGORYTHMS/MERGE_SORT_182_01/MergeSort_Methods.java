package SORTIN_ALGORYTHMS.MERGE_SORT_182_01;

public class MergeSort_Methods {


    // SORT
    public static void Divide(int[] ARR, int l, int r){

        if(l < r){ //ДЪНО НА РЕКУРСИЯТА
            int m = (l+r)/2;    // НАМИРАМЕ СРЕДНИЯ ЕЛЕМЕНТ

            Divide(ARR,l,m);     // РАЗДЕЛЯМЕ ЛЯВАТА ЧАСТ
            Divide(ARR,m+1,r); // РАЗДЕЛЯМЕ ДЯСНАТА ЧАСТ

            CompareAndMerge(ARR,l,m,r); // СОРТИРАНЕ И ОБЕДИНЯВАМЕ ЛЯВАТА И ДЯСНАТА ЧАСТ
            // ДА Я ПРЕИМЕНУВАМЕ /SortAndMerge/ ЗА ДА СТАВА ЯСНО ЗА КАКВО СЛУЖИ
        }

    }// end of sort


    //MERGE
    public static void CompareAndMerge(int[] ARR, int l, int m, int r){

        int LArrLenght = m - l + 1;
        int RArrLenght = r - m;

        //Дефинираме помощни масиви L[]; R[];
        int[] L = new int[LArrLenght];
        int[] R = new int[RArrLenght];

        //ЗАПЪЛВАНЕ НА ЛЕВИЯ ПОМОЩЕН МАСИВ
        for (int i = 0; i < LArrLenght; i++) {
            L[i] = ARR[l+i];
        }

        //ЗАПЪЛВАНЕ НА ДЕСНИЯ ПОМОЩЕН МАСИВ
        for (int j = 0; j < RArrLenght; j++) {
            R[j] = ARR[m + 1 + j];
        }


        // СРАВНЯВАНЕ И СЛИВАНЕ НА ЛЕВИЯ И ДЕСНИЯ ПОМОЩЕН МАСИВ
        // ВЪВ ОРИГИНАЛНИЯ ARR[]
        int LeftIDX = 0;
        int RightIDX = 0;
        int MainIDX = l;

        while (LeftIDX < LArrLenght && RightIDX < RArrLenght){
            if(L[LeftIDX] <= R[RightIDX]){
                ARR[MainIDX] = L[LeftIDX];
                LeftIDX++;
            }else{
                ARR[MainIDX] = R[RightIDX];
                RightIDX++;
            }

            MainIDX++;
        }



        // ЗАПИСВАНЕ НА ОСТАНАЛИТЕ ЕЛЕМЕНТИ ОТ ПОМОЩНИТЕ ЛЯВ L[] И ДЕСЕН R[] МАСИВ
        //В ОРИГИНАЛНИЯ МАСИВ - ARR[]
        while(LeftIDX < LArrLenght){
            ARR[MainIDX] = L[LeftIDX];
            LeftIDX++;
            MainIDX++;
        }

        while(RightIDX < RArrLenght){
            ARR[MainIDX] = R[RightIDX];
            RightIDX++;
            MainIDX++;
        }




    }// end of merge


}

