package 第六天;

import java.util.ArrayList;
import java.util.Random;

public class randomPointName {
	public static void main(String[] args) {
		//定义集合，存储的是student类型变量
		ArrayList<student> array=new ArrayList<student>();
		addStudent(array);
		printStudent(array);
		randomStudentName(array);
	}
	/*
	 * 随机点名器
	 */
	public static void randomStudentName(ArrayList<student> array) {
		Random r=new Random();
		int ran=r.nextInt(array.size());
		student s=array.get(ran);
		System.out.println("\n"+s.name+"  "+s.age);
	}
	
	/*
	 * 定义方法，实现存储学生的姓名和年龄
	 * 创建student类型变量，储存到集合中
	 */
	public static void addStudent(ArrayList<student> array) {
		//创建student类型变量
		student s1=new student();
		student s2=new student();
		student s3=new student();
		student s4=new student();
		student s5=new student();
		s1.name="wocao1";
		s1.age=101;
		s2.name="wocao2";
		s2.age=102;
		s3.name="wocao3";
		s3.age=103;
		s4.name="wocao4";
		s4.age=104;
		s5.name="wocao5";
		s5.age=105;
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);		
	}
	
	/*
	 * 总览，遍历集合
	 */
	public static void printStudent(ArrayList<student> array) {
		for(int i=0;i<array.size();i++) {
			student s=array.get(i);
			System.out.println(s.name+"  "+s.age);
		}
	}
}
