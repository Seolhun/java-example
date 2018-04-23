package com.algorithm.sort;

public class QuickSort {
    private static int[] unsorted_array = {2, 1390, 425, 1122, 1208, 1443, 462, 1155, 849, 455, 1053, 1155, 318, 79, 788};

    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        quickSort.sort(unsorted_array, 0, unsorted_array.length - 1);
    }

    void sort(int[] list, int lowest, int highest) {
        if (lowest >= highest) {
            return;
        }

        int mid = lowest + ((highest - lowest) / 2);
        int pivot = list[mid];

        int low = lowest;
        int high = highest;
        while (low <= high) {
            // 1. Mid 값을 기준으로 좌측에 큰 값을, 우측에 작은 값을 찾을때까지 반복한다. 없으면 low 1씩 증가, high 1씩 감소 시킨다.
            while (list[low] < pivot) {
                low++;
            }
            while (list[high] > pivot) {
                high--;
            }

            // 2. 위에 해당되지 않으면 Mid 값 보다 크거나, 작은 값이 좌우측에 같이 배치되어있는 상태이다. 해당 값을 Swap 한다.
            if (low <= high) {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
                low++;
                high--;
            }
        }

        // 3. low > high이 되면 lowest와 highest의 값을 수정해서 재귀시켜서 다시 Sort를 진행합니다.
        if (lowest < high) {
            sort(list, lowest, high);
        }

        if (highest > low) {
            sort(list, low, highest);
        }
    }
}

