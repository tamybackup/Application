package 第五天;

import java.util.Scanner;

/**
 * 实现商品的存储管理
 * 	功能：
 * 		1.展示用户选择功能清单
 * 		2.根据选择的功能编号，进行不同的操作
 * 			A.展示所有库存
 * 			B.修改库存数量
 * 	分析：
 * 		1.展示用户清单
 * 			输出语句，用户输入，选择功能序号
 * 		2.根据选择，调用不同的方法
 * 			switch语句
 * 				case 1 2 3
 * 			A	展示库存
 * 				将存储商品的数组，遍历
 * 			B	修改库存
 * 				修改所有的库存数量
 * @author Tamy
 *
 */

public class Shopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用数组，保存商品的信息
		//品名，尺寸，价格，库存数，定义4个数组
		String[] brand= {"MackBookAir","ThinkPad"};
		double[] size= {13.3,15.6};
		double[] price= {9999.78,3454.4};
		int[] count= {0,0};
		
		while(true) {
			int chooseNumber=chooseFunction();
			switch(chooseNumber) {
			case 1:
				//调用查看库存函数
				printStore(brand,size,price,count);
				break;
			case 2:
				//调用修改库存函数
				update(brand,count);
				break;
			case 3:
				return;
			}
		}
	}
	/*
	 *定义方法，修改所有商品的库存
	 *用户输入一个，修改一个
	 *返回值，没有
	 *参数，库存数的数组 ,品名数组
	 */
	public static void update(String[] brand,int[] count) {
		//遍历数组，遍历到一个，修改一个
		Scanner sc=new Scanner(System.in);
		//接收键盘键入
		for(int i=0;i<brand.length;i++) {
			System.out.println("请输入你要修改的"+brand[i]+"的库存数：");
			int newCount=sc.nextInt();
			count[i]=newCount;
		}
	}
	
	/*
	 * 输出库存清单
	 */
	public static void printStore(String brand[],double[] size,double[] price,int[] count) {
		System.out.println("---------------------------查看库存清单--------------------------");
		System.out.println("品牌型号		尺寸	价格	库存数");
		int totalCount=0;
		double totalMoney=0;
		for(int i=0;i<brand.length;i++) {
			System.out.println(brand[i]+"  "+size[i]+"  "+price[i]+"  "+count[i]);
			totalCount+=count[i];
			totalMoney+=count[i]*price[i];
		}
	}
	
	/*
	 * 定义方法，实现用户的选择功能，功能的序号返回
	 * 返回值，int
	 * 参数，没有
	 */
	public static int chooseFunction() {
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		//接收键盘键入
		Scanner sc=new Scanner(System.in);
		int chooseNumber=sc.nextInt();
		return chooseNumber;
	}

}
































