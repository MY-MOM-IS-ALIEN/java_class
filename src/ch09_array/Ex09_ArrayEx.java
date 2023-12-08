package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int[] score = null;
        int maxscore = 0;
        int max = 0;
        double avg = 0;

        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.학생 | " + "2.점수 | " + "3.점수목록 | " + "4.분석 | " + "5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택 : ");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.print("학생수 : ");
                int ans1 = scanner.nextInt();
                score = new int[ans1];
            }else if(num == 2){
                for(int i = 0; i < score.length; i++) {
                    System.out.print(i + 1 + "번 학생 점수 : ");
                    int ans2 = scanner.nextInt();
                    score[i] = ans2;
                    maxscore = maxscore + score[i];
                    avg = score[i]/score.length;
                    if (max < score[i])
                    {
                        max = score[i];
                    }
                }
            } else if (num == 3) {
                for(int i = 0; i < score.length; i++){
                    System.out.println(i + 1 + "번 학생 점수 " + score[i]);
                }
            } else if (num == 4) {
                System.out.println("최고점수 : " + max);
                System.out.println("평균점수 : " + avg);

                    for (int i = 0; i < score.length - 1; i++) {
                        int mini = i;
                        for (int j = i + 1; j < score.length; j++) {
                            if (score[j] > score[mini]) {
                                mini = j;
                            }
                        }

                        int temp = score[mini];
                        score[mini] = score[i];
                        score[i] = temp;
                    }

                    for (int i = 0; i < score.length; i++) {
                        if (i != 0) {
                        }
                        System.out.println(i + 1 + "등 : " + score[i]);
                    }
                }else if(num == 5){
                run = false;
            }

            }
        }

    }
