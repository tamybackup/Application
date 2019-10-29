package 第八天;

import java.util.*;


public class Shopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GoodsList> array=new ArrayList<GoodsList>();
		while(true) {
			goodsListSystem();
			goodsInit(array);
			switch (chooseFunction()) {
				case 1:
					//调用货物清单方方法
					goodsList(array);
					break;
				case 2:
					//调用添加新货物方法
					createGoods(array);		
					break;
				case 3:
					//调用删除货物方法
					break;
				case 4:
					//调用修改货物方法
					break;
				case 5:
					//退出
					return;
	
				default:
					System.out.println("请输入正确的序号！");
			}
		}
		
	}
	/*
	 * 定义方法，实现添加货物功能
	 * 返回值：无
	 * 参数：集合
	 */
	public static void createGoods(ArrayList<GoodsList> array) {
		System.out.println("现在选择的是添加货物系统");
		System.out.println("请输入你要修改商品的编号：");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		
		for(int i=0;i<array.size();i++) {
			GoodsList goodsList=array.get(i);
			if(goodsList.id==id) {
				System.out.println("请输入修改的商品名称：");
				goodsList.name=sc.next();
				System.out.println("请输入修改的商品单价：");
				goodsList.proce=sc.nextDouble();
				return;
			}
		}
		System.out.println("没有你想要修改的商品！");
	}
	
	/*
	 * 定义方法，实现功能的选择
	 * 返回值：int
	 * 参数：无
	 * 
	 * 获取用户的键盘键入
	 */
	public static int chooseFunction() {
		Scanner sc=new Scanner(System.in);
		int choose=sc.nextInt();
		return choose;
	}
	
	
	/*
	 *定义函数，实现库存系统的首页
	 *返回值：无
	 *参数：无 
	 */
	public static void goodsListSystem() {
		System.out.println();
		System.out.println("==============================商品库存系统==============================");
		System.out.println("1.货物清单	2.添加新货物	3.删除货物	4.修改货物	5.退出");
		System.out.println("请输入要操作的功能序号：");
	}
	
	/*
	 * 定义方法，实现货物清单的显示
	 * 返回值：无
	 * 参数：集合
	 */
	public static void goodsList(ArrayList<GoodsList> array) {
		System.out.println("==============================商品库存清单==============================");
		System.out.println("商品编号"+"    "+"商品名称"+"             "+"商品单价");
		for(int i=0;i<array.size();i++) {
			GoodsList list=array.get(i);
			System.out.println(list.id+"    "+list.name+"             "+list.proce);
		}
	}
	
	/*
	 * 定义方法，实现商品的初始化
	 * 返回值：无
	 * 参数：集合
	 */
	public static void goodsInit(ArrayList<GoodsList> array) {
		GoodsList gl=new GoodsList();
		gl.id=9001;
		gl.name="少陵是";
		gl.proce=120;
		
		GoodsList g2=new GoodsList();
		g2.id=9002;
		g2.name="少陵是";
		g2.proce=120;

		GoodsList g3=new GoodsList();
		g3.id=9003;
		g3.name="少陵是";
		g3.proce=120;
		
		array.add(gl);
		array.add(g2);
		array.add(g3);
	}

}
