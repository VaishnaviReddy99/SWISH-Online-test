import java.util.*;

public class swish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int p = sc.nextInt();
		p = 100-p;
		float y = (float)p;
		float pr = y/100.0f;
		float price = (float)x;
		float sum = price;
		float temp = 0.0f;
		while(price >0) {
			temp = (pr*price);
			price = temp;
			sum += temp;
		}
		int total= (int)sum;
		System.out.println(total+"\n");	

	}

}
