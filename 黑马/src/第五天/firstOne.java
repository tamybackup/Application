package ������;

import java.util.Scanner;

public class firstOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		add();
//		System.out.println();
//		ismax();
//		System.out.println();
//		max();
//		printStart(3,3);
		printMultiplicationTable(3);
	}
	
//	����¼����������,����������֮��(������С��)
	public static void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������������");
		int x=sc.nextInt();
		double y=sc.nextDouble();
		double sum=x+y;
		System.out.println(sum);
	}
	
//	����¼����������,�ж����������Ƿ����(������С��)
	public static void ismax() {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������������");
		int x=sc.nextInt();
		double y=sc.nextDouble();
		if(x==y) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
//	����¼����������,��ȡ�������нϴ��ֵ(������С��)
	public static void max() {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������������");
		int x=sc.nextInt();
		double y=sc.nextDouble();
		int z=sc.nextInt();
		double temp=x<y?y:x;
		temp=temp<z?z:temp;
		System.out.println(temp);
	}
	
//	��ӡm��n�е����ξ���
	public static void printStart(int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	��ӡnn�˷���
	public static void printMultiplicationTable(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(i);
				System.out.print("*");
				System.out.print(j+"=");
				System.out.print(i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

















































