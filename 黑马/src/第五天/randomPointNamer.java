package ������;
/**
 * ���������
 * 	1.�洢����
 * 	2.Ԥ�������˵�����
 * 	3.�����һ���˵�����
 */

import java.util.Random;

public class randomPointNamer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�洢�����������洢��������
//		����洢�������������������ͣ�String
		String[] names=new String[8];
		addStudentName(names);
		printStudentName(names);
		
		String name=randomPrintStudent(names);
		System.out.println();
		System.out.println(name);
	}
	
	/*
	 *�����������ѧ������ 
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
	 *�������� 
	 */
	public static void printStudentName(String names[]) {
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
	/*
	 *������һ�������е�Ԫ�� 
	 */
	public static String randomPrintStudent(String names[]) {
		Random ran=new Random();
		int name=ran.nextInt(names.length);
		return names[name];
	}

}
