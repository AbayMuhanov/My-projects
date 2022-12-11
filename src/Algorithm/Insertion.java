package Algorithm;

public class Insertion {
  public static void insertionSort(int[] array) {
/*
 Представим что в цикле for = 1, в элемент саммива 1 мы вставили число 5,
 мы переносим его в переменную current,
 переменная j равна 0.
 Если в цикле while истина, while (j >= 0 && current < array[j])=(5 < 3) = истина.
 то пременую array[j] мы преносим в переменну array[j + 1](В следуйший элемент массива),
 Дальше j равна 0, и т.д.
 Но если цикл while ложь то мы пропускаем его и переменную current преносим в переменную array[j + 1].

 Смысл алгоритма в том чтобы он отсортировал на отсортирорваниые и не отсортированые.
 */

    for (int i = 1; i < array.length; i++) {
      int current = array[i];
      int j = i - 1;

      while (j >= 0 && current < array[j]) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = current;
    }

  }
}
