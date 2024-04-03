public class Main {
    public static void main(String[] args) {
        int[] massiv1 = {12, 16, 13, -8, 7, 9};
        printArray("исходный массив", massiv1);
        bubbleSort(massiv1);
        printArray("упорядоченный массив", massiv1);
    }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message +" "+ massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            //пройти по массиву от начала, проверяя попарно каждый элемент со следующим
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1])
                {//поменять местами
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }

    public static void bubbleSortImproved(int[] array){
        int swapCounter;
        for (int i = 0; i < array.length-1; i++) {
            swapCounter=0;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1])
                {//поменять местами
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                    swapCounter++;
                }
            }
            if (swapCounter == 0)
                break;
        }
    }
}