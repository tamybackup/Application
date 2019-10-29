package 第五天;
/**
 * 随机点名气
 * 	1.存储姓名
 * 	2.预览所有人的姓名
 * 	3.随机出一个人的姓名
 */

import java.util.Random;

public class randomPointNamer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		存储姓名，姓名存储在数组中
//		数组存储姓名，姓名的数据类型，String
		String[] names=new String[8];
		addStudentName(names);
		printStudentName(names);
		
		String name=randomPrintStudent(names);
		System.out.println();
		System.out.println(name);
	}
	
	/*
	 *在数组中添加学生姓名 
	 */
	public static void addStudentName(String[] names) {
		names[0]="1";
		names[1]="2";
		names[2]="3";
		names[3]="4";
		names[4]="5";
		names[5]="6";
		names[6]="7";
		names[7]="8";
	}
	/*
	 *遍历数组 
	 */
	public static void printStudentName(String names[]) {
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
	/*
	 *随机输出一个数组中的元素 
	 */
	public static String randomPrintStudent(String names[]) {
		Random ran=new Random();
		int name=ran.nextInt(names.length);
		return names[name];
	}

}
