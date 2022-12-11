package Algorithm;

public class Selection {

  int[] arr = {5, 1, 3, 4, 2};

  public static void selectionSort(int[] arr) {
    /*
    Представим что в цикле for = 0 элемент массива 0 мы вставили число 5,
    в переменную min мы переносим переменную arr[i],
    в переменную min_i мы преносим переменую i.

     Если в цикле for истина,то цикл идёт дальше , Eсли пременная arr[j] < min , то мы в переменую min преносим переменую arr[j],
     а в переменую min_i переносим переменую j.

     Если переменая i не равна переменой min_i,
     то в переменую  tmp засоуваем переменую arr[i],
     в переменую arr[i] засоуваем переменую arr[min_i],
     и в переменую arr[min_i] засоуваем переменую tmp.
     */

    for (int i = 0; i < arr.length; i++) {
      int min = arr[i];
      int min_i = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < min) {
          min = arr[j];
          min_i = j;
        }
      }

      if (i != min_i) {
        int tmp = arr[i];
        arr[i] = arr[min_i];
        arr[min_i] = tmp;
      }

    }
  }
}
