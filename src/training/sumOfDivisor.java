package training;

//약수의 합

import java.util.Scanner;

public class sumOfDivisor {
	public int solution(int n) {
		int answer = 0;
		for(int i =1; i<= n; i++) {
			if (n%i==0) {
				System.out.print(i+", ");
				answer += i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		sumOfDivisor sd = new sumOfDivisor();
		int result = sd.solution(a);
		System.out.println(a+"의 약수의 합은 "+result+"이다.");
		
		scanner.close();
		
		
	}
}
