/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Students> student = new ArrayList<>();
        itStudent iS1 = new itStudent(1, "Aliaa", 25, 30, 35);
        itStudent iS2 = new itStudent(2, "Hafsa", 30, 20, 40);
        itStudent iS3 = new itStudent(3, "Seham", 25, 25, 30);
        ArtStudent aS1 = new ArtStudent(5, "gada", 30, 5, 40);
        ArtStudent aS2 = new ArtStudent(7, "Eman", 40, 10, 50);
        ArtStudent aS3 = new ArtStudent(6, "gada", 35, 8, 39);

        student.add(iS1);
        student.add(iS2);
        student.add(iS3);
        student.add(aS1);
        student.add(aS2);
        student.add(aS3);

        for (Students s : student) {

            System.out.println(s.getGrade());
        }

        List<Students> studentList = student
                .stream()
                .sorted(Comparator.comparing(Students::getGrade).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted Students ================");
        for (Students s : studentList) {
            System.out.println(s);
        }
    }

}
