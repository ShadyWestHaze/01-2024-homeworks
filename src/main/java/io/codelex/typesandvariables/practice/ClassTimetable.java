package src.main.java.io.codelex.typesandvariables.practice;
public class ClassTimetable {
    public static void main(String[] args) {

        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Information Systems";


        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";


        System.out.println("+------------------------------------------------------------+");
        System.out.println("| 1 | " + padRight(course1, 26) + " | " + padRight(teacher1, 15) + " |");
        System.out.println("| 2 | " + padRight(course2, 26) + " | " + padRight(teacher2, 15) + " |");
        System.out.println("| 3 | " + padRight(course3, 26) + " | " + padRight(teacher3, 15) + " |");
        System.out.println("| 4 | " + padRight(course4, 26) + " | " + padRight(teacher4, 15) + " |");
        System.out.println("| 5 | " + padRight(course5, 26) + " | " + padRight(teacher5, 15) + " |");
        System.out.println("| 6 | " + padRight(course6, 26) + " | " + padRight(teacher6, 15) + " |");
        System.out.println("| 7 | " + padRight(course7, 26) + " | " + padRight(teacher7, 15) + " |");
        System.out.println("| 8 | " + padRight(course8, 26) + " | " + padRight(teacher8, 15) + " |");
        System.out.println("+------------------------------------------------------------+");
    }


    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}