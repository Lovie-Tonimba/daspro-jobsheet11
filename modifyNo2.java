import java.util.Scanner;
public class modifyNo2 {
    public static void main(String[] args) {
        //Modifikasi Kode Program assignment no 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of students  : ");
        int numStudent = sc.nextInt();
        System.out.print("Input number of weeks     : ");
        int numWeeks = sc.nextInt();

        String [] names = new String[numStudent];
        int [][] weeks = new int[numStudent][numWeeks];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Input the name of student-" + (i+1) + ": ");
            names[i] = sc.next();
        }

        inputStudentsGrade(names, weeks);
        displayStudentsGrades(names, weeks);
        highestGradeOfWeek(names, weeks);
        studentHighestGrade(names, weeks);
    }
    static void inputStudentsGrade(String[]names, int[][]weeks){
        Scanner sc = new Scanner(System.in);
        System.out.println("==========INPUT STUDENT'S GRADE DATA==========");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            for (int j = 0; j < weeks[i].length; j++) {
                System.out.print("Week-" + (j+1)+ ": ");
                weeks[i][j] = sc.nextInt();
            }
        }
    }
    static void displayStudentsGrades(String[]names, int[][]weeks){
        System.out.println("==========DISPLAY ALL STUDENT'S GRADE==========");
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            int totalGradeEachstudent = 0;
            System.out.println(names[i]);
            for (int j = 0; j < weeks[i].length; j++) {
                System.out.println("Week-" + (j+1) + ": " + weeks[i][j]);
                totalGradeEachstudent += weeks[i][j];
                sum += weeks[i][j];
            }
            System.out.println("Total " + names[i] + "'s grade for all weeks: " + totalGradeEachstudent);
        }
        System.out.println("Total all students grade for all weeks: " + sum);
    }
    static void highestGradeOfWeek(String[]names, int[][]weeks){
        System.out.println("==========FIND THE WEEK THAT HAS THE HIGHEST GRADE FROM ALL STUDENTS==========");
        int [] eachWeekTotal = new int[7]; //array untuk menyimpan total student grade per minggu
        for (int j = 0; j < weeks[0].length; j++) {
            for (int i = 0; i < names.length; i++) {
                eachWeekTotal[j] += weeks[i][j];
            }
            System.out.println("Week-" + (j+1) + ": " + eachWeekTotal[j]);
        }
        int maxWeek = 0;
        for (int j = 0; j < eachWeekTotal.length; j++) {
            if(eachWeekTotal[j] > eachWeekTotal[maxWeek]){
                maxWeek = j;
            }
        }
        System.out.println("Week-" + (maxWeek+1) + " has the highest grade with total: " + eachWeekTotal[maxWeek]);
    }
    static void studentHighestGrade(String[]names, int[][]weeks){
        System.out.println("==========FIND THE STUDENT WITH THE HIGHEST GRADE==========");
        //Mencari nama siswa dengan nilai tertinggi untuk setiap minggu
        for (int j = 0; j < weeks[0].length; j++) {
            int maxGrade = 0;
            String name = " ";
            for (int i = 0; i < names.length; i++) {
                if(weeks[i][j] > maxGrade){
                    maxGrade = weeks[i][j];
                    name = names[i];
                }
            }
            System.out.println("Week-" + (j+1) + " " + name + " has the highest grade with total " + maxGrade);
        } 
        //Mencari nama siswa dengan nilai tertinggi dari semua siswa untuk 7 minggu
        int highestGrade = 0;
        String studentName = " ";
        for (int i = 0; i < names.length; i++) {
            int totalGradeEachstudent = 0;
            for (int j = 0; j < weeks[i].length; j++) {
                totalGradeEachstudent += weeks[i][j];
            }
            System.out.println("Total " + names[i] + "'s grade for all weeks: " + totalGradeEachstudent);
            if (totalGradeEachstudent> highestGrade) {
                highestGrade = totalGradeEachstudent;
                studentName = names[i];
            }
        }
        System.out.println("Student " + studentName + " with the highest grade " + highestGrade + " for all weeks");
    }
}