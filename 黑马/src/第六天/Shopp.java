package ������;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ArrayList���ϣ��洢Goods����
		ArrayList<Goods> array=new ArrayList<Goods>();
		addGoods(array);
		
		
		while(true) {
			switch(chooseNumber()) {
			case 1:
				showGoods(array);
				break;
			case 2:
				update(array);
				break;
			case 3:
				return;
			}
		}
	}
	/*
	 * չʾ�˵�
	 */
	public static int chooseNumber() {
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//��ȡ���̵ļ���
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		return number;
	}
	
	/*
	 * �޸���Ʒ�������
	 */
	public static void  update(ArrayList<Goods> array) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.size();i++) {
			Goods g=array.get(i);
			System.out.println("������"+g.rands+"��������");
			int p=sc.nextInt();
			g.count=p;
		}
		
	}
	
	/*
	 * �鿴��Ʒ��Ϣ
	 */
	public static void showGoods(ArrayList<Goods> array) {
		for(int i=0;i<array.size();i++) {
			Goods g=array.get(i);
			System.out.println(g.rands+"  "+g.size+"  "+g.price+"  "+g.count);
		}
	}
	
	/*
	 * �����Ʒ
	 */
	public static void addGoods(ArrayList<Goods> array) {
		Goods g1=new Goods();
		Goods g2=new Goods();
		
		g1.rands="MacBook";
		g1.size=13.2;
		g1.price=2132.1;
		g1.count=3;
		
		g2.rands="Thinkpad";
		g2.size=15.2;
		g2.price=9132.1;
		g2.count=1;
		
		array.add(g1);
		array.add(g2);
	}
}
