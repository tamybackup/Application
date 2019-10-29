package 第五天;

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
	
//	键盘录入两个数据,求两个数据之和(整数和小数)
	public static void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数：");
		int x=sc.nextInt();
		double y=sc.nextDouble();
		double sum=x+y;
		System.out.println(sum);
	}
	
//	键盘录入两个数据,判断两个数据是否相等(整数和小数)
	public static void ismax() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数：");
		int x=sc.nextInt();
		double y=sc.nextDouble();
		if(x==y) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
//	键盘录入三个数据,获取两个数中较大的值(整数和小数)
	public static void max() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三个数：");
		int x=sc.nextInt();
		double y=sc.nextDouble();
		int z=sc.nextInt();
		double temp=x<y?y:x;
		temp=temp<z?z:temp;
		System.out.println(temp);
	}
	
//	打印m行n列的星形矩形
	public static void printStart(int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	打印nn乘法表
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

















































