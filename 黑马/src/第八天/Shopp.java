package �ڰ���;

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
					//���û����嵥������
					goodsList(array);
					break;
				case 2:
					//��������»��﷽��
					createGoods(array);		
					break;
				case 3:
					//����ɾ�����﷽��
					break;
				case 4:
					//�����޸Ļ��﷽��
					break;
				case 5:
					//�˳�
					return;
	
				default:
					System.out.println("��������ȷ����ţ�");
			}
		}
		
	}
	/*
	 * ���巽����ʵ����ӻ��﹦��
	 * ����ֵ����
	 * ����������
	 */
	public static void createGoods(ArrayList<GoodsList> array) {
		System.out.println("����ѡ�������ӻ���ϵͳ");
		System.out.println("��������Ҫ�޸���Ʒ�ı�ţ�");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		
		for(int i=0;i<array.size();i++) {
			GoodsList goodsList=array.get(i);
			if(goodsList.id==id) {
				System.out.println("�������޸ĵ���Ʒ���ƣ�");
				goodsList.name=sc.next();
				System.out.println("�������޸ĵ���Ʒ���ۣ�");
				goodsList.proce=sc.nextDouble();
				return;
			}
		}
		System.out.println("û������Ҫ�޸ĵ���Ʒ��");
	}
	
	/*
	 * ���巽����ʵ�ֹ��ܵ�ѡ��
	 * ����ֵ��int
	 * ��������
	 * 
	 * ��ȡ�û��ļ��̼���
	 */
	public static int chooseFunction() {
		Scanner sc=new Scanner(System.in);
		int choose=sc.nextInt();
		return choose;
	}
	
	
	/*
	 *���庯����ʵ�ֿ��ϵͳ����ҳ
	 *����ֵ����
	 *�������� 
	 */
	public static void goodsListSystem() {
		System.out.println();
		System.out.println("==============================��Ʒ���ϵͳ==============================");
		System.out.println("1.�����嵥	2.����»���	3.ɾ������	4.�޸Ļ���	5.�˳�");
		System.out.println("������Ҫ�����Ĺ�����ţ�");
	}
	
	/*
	 * ���巽����ʵ�ֻ����嵥����ʾ
	 * ����ֵ����
	 * ����������
	 */
	public static void goodsList(ArrayList<GoodsList> array) {
		System.out.println("==============================��Ʒ����嵥==============================");
		System.out.println("��Ʒ���"+"    "+"��Ʒ����"+"             "+"��Ʒ����");
		for(int i=0;i<array.size();i++) {
			GoodsList list=array.get(i);
			System.out.println(list.id+"    "+list.name+"             "+list.proce);
		}
	}
	
	/*
	 * ���巽����ʵ����Ʒ�ĳ�ʼ��
	 * ����ֵ����
	 * ����������
	 */
	public static void goodsInit(ArrayList<GoodsList> array) {
		GoodsList gl=new GoodsList();
		gl.id=9001;
		gl.name="������";
		gl.proce=120;
		
		GoodsList g2=new GoodsList();
		g2.id=9002;
		g2.name="������";
		g2.proce=120;

		GoodsList g3=new GoodsList();
		g3.id=9003;
		g3.name="������";
		g3.proce=120;
		
		array.add(gl);
		array.add(g2);
		array.add(g3);
	}

}
