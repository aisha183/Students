/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author PC
 */
public class itStudent extends Students {

    private double mid, project, finall;

    public itStudent(int id, String name, double mid, double project, double finall) {
        super(id, name);
        this.mid = mid;
        this.project = project;
        this.finall = finall;
        this.setGrade((mid * .30 + project * .30 + finall * 40) * .01);
    }

}
