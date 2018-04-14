package com.algorithm.programmers.progress.level4.buildingairport;

public class TryHelloWorld {
    /*
    * 1. 계산을 위한 임시 거리값 배열을 선언한다
    * 2. 도시 수 만큼 루프를 돌린다
    * 3. 해당 i위치에 공항을 지었을 때의 위치 값 계산
    *  - 하나라도 0보다 작으면 절대값처리 후 -
    *  - 둘다 0보다 크면 -이후 절대값처리
    * 4. 구해진 위치값을 각 j 갑과 곱한다
    *  - i 값은 제외하면 나머지는 각 인구수와 곱하여 result 값에 담는다
    *  - 각 i가 끝날때마다 각 result값을 비교하여 작은 값을 채택한다
    *  - 해당 i값의 거리가 가장낮은지 확인하고 결과가 같을시 더 낮은 도시를 고른다
    * */

    public int chooseCity(int n, int[][] city) {
        int answer = 0;

        int[] tempPosition = new int[n];

        return answer;
    }

    int getPostionValue(int[][] city){
        int[] temp = city[0];

        int resultIndex = 0;
        int result = 0;

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if(i != j){
                    temp[i] = getSumValue(city[0][j], city[0][j]);
                }
            }
        }
        return resultIndex;
    }

    int getSumValue(int a, int b){
        if(a < 0 || b < 0){
            return Math.abs(a) - Math.abs(b);
        }
        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int tn = 3;
        int[][] tcity = {{1, 5}, {2, 2}, {3, 3}};
        System.out.println(test.chooseCity(tn, tcity));
    }
}
