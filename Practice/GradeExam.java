/*
编写一个可以进行多选题测验评分的程序
*/

public class GradeExam {
    public static void main(String[] args) {
        //学生的答案
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        //标准答案
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        //获取所有答案
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0;j < answers[i].length;j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            System.out.println("学生"+i+"做对了"+correctCount+"道题");
        }
    }
}

/*
输出：
    学生0做对了7道题
    学生1做对了6道题
    学生2做对了5道题
    学生3做对了4道题
    学生4做对了8道题
    学生5做对了7道题
    学生6做对了7道题
    学生7做对了7道题
*/
