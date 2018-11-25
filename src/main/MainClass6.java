package main;

public class MainClass6 {
	public static int total=100,buyers=0;
	public double answer6(int m) {
		double T,ans=0;
		int[] ara=new int[]{1,10,20,40};
		for(int i=0;i<4;i++) {
			T=m*ara[i]*ara[i];
			T=T/3.0;
			if(T>60) break;
			ans=T;
		}
		return ans;
	}
	public int answer7(int m) {
		if(m>4) {
			return -1;
		}
		else if(m>total) return -1;
		else total=total-m;
		buyers++;
		return total;
	}
	public int getBuyer() {
		return buyers;
	}
}
