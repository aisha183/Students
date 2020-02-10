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
public class ArtStudent extends Students {

    private double mid, report, finall;

    public ArtStudent(int id, String name, double mid, double report, double finall) {
        super(id, name);
        this.mid = mid;
        this.report = report;
        this.finall = finall;
        this.setGrade((mid * .40 + report * .10 + finall * 50) * .01);
    }

}
