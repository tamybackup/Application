package ������;

public class printNumber {
	public static void main(String[] args) {
		int count=0;
		for(int i=1000;i<10000;i++) {
			
			int a=i/1000;//ǧλ
			int b=i%1000/100;//��λ
			int c=i%100/10;//ʮλ
			int d=i%10;//��λ
			if((b+d)==(a+c)) {
				System.out.print(i+" ");
				count++;
				if(count%5==0) {
					System.out.println();
				}
			}
		}
		System.out.println(count);
	}
}
