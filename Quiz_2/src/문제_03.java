import java.util.Scanner;

public class 문제_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("학년 입력:");
		int grade=scan.nextInt();
		System.out.print("점수 입력:");
		int score=scan.nextInt();
		
		if(score<0 || score>100)
			{System.out.println("경고!");}
		
		else { 
			if(grade==4)
				{
				if(score>=70)
					System.out.println("합격");
				else
					System.out.println("불합격");
				}
			else
				{
				if(score>=60)
					System.out.println("합격");
				else
					System.out.println("불합격");
				}
			}
	}

}
