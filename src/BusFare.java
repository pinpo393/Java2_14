import java.util.Scanner;
public class BusFare {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//BusCalk busCalk= new BusCalk(); 
		
		
		
		
		System.out.println("年齢を入力してください");
		int inputAge = scanner.nextInt();
		
		System.out.println("移動距離を入力してください");
		double inputDistance = scanner.nextDouble();
		
		//busCalk PrintBusFare(inputAge, inputDistance);
		
		
		int price = (int)inputDistance * 100;
		
		if(inputAge < 6) {
			price = 0;
		
		}else if(inputAge <12) {
			price = price / 2;
		
		}else if(inputAge > 65) {
			price = price -150;
		}
			System.out.println("料金は" + price + "円です");
		
		
		
		scanner.close();
	}

}
