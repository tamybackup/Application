package ������;

import java.util.Scanner;

/**
 * ʵ����Ʒ�Ĵ洢����
 * 	���ܣ�
 * 		1.չʾ�û�ѡ�����嵥
 * 		2.����ѡ��Ĺ��ܱ�ţ����в�ͬ�Ĳ���
 * 			A.չʾ���п��
 * 			B.�޸Ŀ������
 * 	������
 * 		1.չʾ�û��嵥
 * 			�����䣬�û����룬ѡ�������
 * 		2.����ѡ�񣬵��ò�ͬ�ķ���
 * 			switch���
 * 				case 1 2 3
 * 			A	չʾ���
 * 				���洢��Ʒ�����飬����
 * 			B	�޸Ŀ��
 * 				�޸����еĿ������
 * @author Tamy
 *
 */

public class Shopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ�����飬������Ʒ����Ϣ
		//Ʒ�����ߴ磬�۸񣬿����������4������
		String[] brand= {"MackBookAir","ThinkPad"};
		double[] size= {13.3,15.6};
		double[] price= {9999.78,3454.4};
		int[] count= {0,0};
		
		while(true) {
			int chooseNumber=chooseFunction();
			switch(chooseNumber) {
			case 1:
				//���ò鿴��溯��
				printStore(brand,size,price,count);
				break;
			case 2:
				//�����޸Ŀ�溯��
				update(brand,count);
				break;
			case 3:
				return;
			}
		}
	}
	/*
	 *���巽�����޸�������Ʒ�Ŀ��
	 *�û�����һ�����޸�һ��
	 *����ֵ��û��
	 *����������������� ,Ʒ������
	 */
	public static void update(String[] brand,int[] count) {
		//�������飬������һ�����޸�һ��
		Scanner sc=new Scanner(System.in);
		//���ռ��̼���
		for(int i=0;i<brand.length;i++) {
			System.out.println("��������Ҫ�޸ĵ�"+brand[i]+"�Ŀ������");
			int newCount=sc.nextInt();
			count[i]=newCount;
		}
	}
	
	/*
	 * �������嵥
	 */
	public static void printStore(String brand[],double[] size,double[] price,int[] count) {
		System.out.println("---------------------------�鿴����嵥--------------------------");
		System.out.println("Ʒ���ͺ�		�ߴ�	�۸�	�����");
		int totalCount=0;
		double totalMoney=0;
		for(int i=0;i<brand.length;i++) {
			System.out.println(brand[i]+"  "+size[i]+"  "+price[i]+"  "+count[i]);
			totalCount+=count[i];
			totalMoney+=count[i]*price[i];
		}
	}
	
	/*
	 * ���巽����ʵ���û���ѡ���ܣ����ܵ���ŷ���
	 * ����ֵ��int
	 * ������û��
	 */
	public static int chooseFunction() {
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//���ռ��̼���
		Scanner sc=new Scanner(System.in);
		int chooseNumber=sc.nextInt();
		return chooseNumber;
	}

}
































