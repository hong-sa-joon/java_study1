package ch05.sec07;

import javax.swing.plaf.IconUIResource;

public class MultiDimesion {
    public static void main(String[] args) {
//        int[] scores= {1,2};//1차원 배열
        //2차원 배열 생성: 배열 안에 배열이 들어간 형태

        int[][] scores = {
                {80, 90, 96},//1반 점수
                {76, 88, }//2반 점수
        };
        //1반의 평균점수 구하기

        int class1Sum=0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];//scores[0][0],scores[0][1],scores[0][2]
        }
        double classAvg = (double)class1Sum/ scores[0].length;
        System.out.println("1반의 평균 점수"+classAvg);

        //2반의 평균점수 구하기
int class2Sum=0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum+=scores[1][i];
        }
double classAvg2=(double)class2Sum/scores[1].length;
        System.out.println("2반의 평균점수: "+classAvg2);

        //전체학생의 평균점수 구하기
//double classAll=(classAvg+classAvg2)/scores.length;
//        System.out.println("전체 학생의 평균: "+classAll);
//2차원 배열의 전체 데이터를 한꺼번에 출력할 시 => 중첩for문을 사용
        int totalStudent=0;
        int totalSum=0;
        for (int i = 0; i < scores.length; i++) {//반의 객수만큼 반복
            totalStudent += scores[i].length;//scores[0],scores[1]//1반, 2반의 전체 학생 수를 더한다.
            for (int j = 0; j < scores[i].length; j++) {//해당 반의 학생 수만큼 반복
                totalSum+= scores[i][j];//학생 점수 합산.
            } 
        }
        double totalAvg=(double)totalSum/totalStudent;
        System.out.println("전체 학생의 평균 점수: "+totalAvg);








//배열길이 출력
        System.out.println("학급의 수: "+scores.length);//배열은 2개

        System.out.println("1반의 학생 수:"+scores[0].length);
        System.out.println("1반의 학생 수:"+scores[1].length);

        //1반에서 세번째 학생의 점수 읽기
        System.out.println("1반에서 세번째 학생: "+ scores[0][2]);
        System.out.println("1반에서 세번째 학생: "+ scores[1][1]);


        //2반에서 두번째 학생의 점수 읽기
    }
}
