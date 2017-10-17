package com.algorithm.done.level4.noovertime;

class NoOvertime {
    /*
     * Process
     * 1. 주어진 횟수(n)만큼 루프한다
     * 2. 가장 높은 시간이 걸리는 work 값을 -1해준다.
     * 3. -1해준 값보다 높은 값이 있을 때 그 값을 -1, 없으면 같은 값(또는 해당 값을) 다시 -1해준다.
     * 4. 2-3을 횟수만큼 반복한다
     * 5. 횟수만큼 다 돌았으면 해당 배열을 제곱하여 값을 구한다
     */
    public int noOvertime(int no, int[] works) {
        int result = 0;

        while (no != 0) {
            getWorktime(no, works);
            no--;
        }

        for (int i = 0; i < works.length; i++) {
            result += Math.pow(works[i], 2);
        }

        return result;
    }

    void getWorktime(int n, int[] works) {
        int selected = 0;
        int index = 0;
        for (int i = 0; i < works.length; i++) {
            if (works[i] > selected) {
                selected = works[i];
                index = i;
            }
        }
        works[index]--;
    }

    public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int[] test = {4, 3, 3};
        System.out.println(c.noOvertime(4, test));
    }
}
