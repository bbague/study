package day02.lib;

import java.util.ArrayList;

public class GradeCalculator {
	String name;
	double score;
	int credit;
	double sums=0;
	int sumc=0;
	ArrayList<String> namearr = new ArrayList<String>();
	ArrayList<Double> scorearr = new ArrayList<Double>();
	ArrayList<Integer> creditarr = new ArrayList<Integer>();
	
	
	public GradeCalculator(String name, double score, int credit) {
		this.name=name;
		this.score=score;
		this.credit=credit;
	}

	public void addCourse(Course course) {
		namearr.add(course.name);
		scorearr.add(course.grade);
		creditarr.add(course.credit);
		
	}

	public void print() {
		for(int i=0; i<scorearr.size();i++) {
			sums += (scorearr.get(i) * creditarr.get(i));
			sumc += creditarr.get(i);
		}
		System.out.println("직전 학기 성적 : " + score + "(총 " + this.credit + "학점)");
		System.out.println("이번 학기 성적 : " + (sums/sumc) + "(총" + this.sumc + "학점)");
		System.out.println("전체 예상 성적 : " + (sums+(score*credit)/(sumc+credit)) + "(총" + (credit+sumc) + "학점)");
	}
	
}
