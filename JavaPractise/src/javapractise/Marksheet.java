package javapractise;

import java.util.Scanner;

/**
 *
 * @author M Awais
 */
public class Marksheet {
    public static void main(String[] args){
        Scanner scPrimitive = new Scanner(System.in);
        Scanner scNonPrimitive = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scPrimitive.nextLine();
        System.out.println("Enter Student Roll#: ");
        int rollNo = scNonPrimitive.nextInt();
        int sr1 = 1, sr2 = 2, sr3 = 3, sr4 = 4;
        int total = 100;
        String jName = "Java", cPPName = "C++", phpName = "Php", pyName = "Python";
        System.out.println("Enter Student's Java Marks: ");
        int jMarks = scNonPrimitive.nextInt();
        System.out.println("Enter Student's C++ Marks: ");
        int cPPMarks = scNonPrimitive.nextInt();
        System.out.println("Enter Student's Php Marks: ");
        int phpMarks = scNonPrimitive.nextInt();
        System.out.println("Enter Student's Python Marks: ");
        int pythonMarks = scNonPrimitive.nextInt();
        
        String jGrade;
        String cPPGrade;
        String phpGrade;
        String pyGrade;
        
        if(jMarks >= 80){
            jGrade = "  A1  ";
        }else if(jMarks >= 70){
            jGrade = "  A   ";
        }else if(jMarks >= 60){
            jGrade = "  B   ";
        }else if(jMarks >= 50){
            jGrade = "  C   ";
        }else if(jMarks >= 40){
            jGrade = "  D   ";
        }else{
            jGrade = "Failed";
        }
        
        if(cPPMarks >= 80){
            cPPGrade = "  A1  ";
        }else if(cPPMarks >= 70){
            cPPGrade = "  A   ";
        }else if(cPPMarks >= 60){
            cPPGrade = "  B   ";
        }else if(cPPMarks >= 50){
            cPPGrade = "  C   ";
        }else if(cPPMarks >= 40){
            cPPGrade = "  D   ";
        }else{
            cPPGrade = "Failed";
        }
        
        if(phpMarks >= 80){
            phpGrade = "  A1  ";
        }else if(phpMarks >= 70){
            phpGrade = "  A   ";
        }else if(phpMarks >= 60){
            phpGrade = "  B   ";
        }else if(phpMarks >= 50){
            phpGrade = "  C   ";
        }else if(phpMarks >= 40){
            phpGrade = "  D   ";
        }else{
            phpGrade = "Failed";
        }
        
        if(pythonMarks >= 80){
            pyGrade = "  A1  ";
        }else if(pythonMarks >= 70){
            pyGrade = "  A   ";
        }else if(pythonMarks >= 60){
            pyGrade = "  B   ";
        }else if(pythonMarks >= 50){
            pyGrade = "  C   ";
        }else if(pythonMarks >= 40){
            pyGrade = "  D   ";
        }else{
            pyGrade = "Failed";
        }
        
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|                 Name : "+name+"                   |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|                Roll# : "+rollNo+"                 |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|   Sr#     Sub     Total     Obtain     Grade   |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|   "+sr1+"       "+jName+"     "+total+"        "+jMarks+"       "+jGrade+"  |");
        System.out.println("|   "+sr2+"       "+cPPName+"      "+total+"        "+cPPMarks+"       "+cPPGrade+"  |");
        System.out.println("|   "+sr3+"       "+phpName+"      "+total+"        "+phpMarks+"       "+phpGrade+"  |");
        System.out.println("|   "+sr4+"       "+pyName+"   "+total+"        "+pythonMarks+"       "+pyGrade+"  |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }
}
