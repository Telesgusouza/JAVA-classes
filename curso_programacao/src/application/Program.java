package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entitites.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> setList = new HashSet<Integer>();
		
		System.out.print("Quantos alunos por curso A? ");
		int amountStudentsCourseA = sc.nextInt();
		Course courseA = new Course();
		
		for (int i = 1; i <= amountStudentsCourseA; i++) {
			courseA.addStudents(sc.nextInt());
		}
		
		System.out.print("Quantos alunos por curso B? ");
		int amountStudentsCourseB = sc.nextInt();
		Course courseB = new Course();
		
		for (int i = 1; i <= amountStudentsCourseB; i++) {
			courseB.addStudents(sc.nextInt());
		}
		
		System.out.print("Quantos alunos por curso C? ");
		int amountStudentsCourseC = sc.nextInt();
		Course courseC = new Course();
		
		for (int i = 1; i <= amountStudentsCourseC; i++) {
			courseC.addStudents(sc.nextInt());
		}
		
		setList.addAll(courseA.getListStudents());
		setList.addAll(courseB.getListStudents());
		setList.addAll(courseC.getListStudents());
		
		System.out.println("Total students: " + setList.size());
		
		sc.close();
	}

}
