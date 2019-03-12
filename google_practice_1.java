import java.util.Scanner;
public class google_practice_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int carry = num-1;
		int[] index = new int[num];
		for(int a = 0;a<num-1;a++)
			index[a]=0;
		show(carry,index);
	}
	public static void show(int carry,int[] index){
		int count = 0;
		for(int a =1;a<index.length - carry-1;a++)
			count = count+index[a];
		if(count%2 == 0)
			for(int a = 0;a<10;a++){
				index[carry]=a;
				if(carry>0){
					System.out.println();
					show(carry-1,index);
				}else{
					int ans = 0;
					for(int b = index.length-1;b>=0;b--)
						ans = ans+(int)Math.pow(10, b)*index[b];
					System.out.print(ans+" ");
				}			
			}
		else{
			for(int a = 9;a>=0;a--){
				index[carry]=a;
				if(carry>0){
					System.out.println();
					show(carry-1,index);
				}else{
					int ans = 0;
					for(int b = index.length-1;b>=0;b--)
						ans = ans+(int)Math.pow(10, b)*index[b];
					System.out.print(ans+" ");
				}
			}
		}

	}
}