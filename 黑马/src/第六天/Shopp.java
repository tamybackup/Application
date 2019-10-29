package 第六天;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建ArrayList集合，存储Goods类型
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
	 * 展示菜单
	 */
	public static int chooseNumber() {
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		//获取键盘的键入
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		return number;
	}
	
	/*
	 * 修改商品库存数量
	 */
	public static void  update(ArrayList<Goods> array) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.size();i++) {
			Goods g=array.get(i);
			System.out.println("请输入"+g.rands+"的数量：");
			int p=sc.nextInt();
			g.count=p;
		}
		
	}
	
	/*
	 * 查看商品信息
	 */
	public static void showGoods(ArrayList<Goods> array) {
		for(int i=0;i<array.size();i++) {
			Goods g=array.get(i);
			System.out.println(g.rands+"  "+g.size+"  "+g.price+"  "+g.count);
		}
	}
	
	/*
	 * 添加商品
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
