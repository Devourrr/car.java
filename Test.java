package week04_day2_overriding_Car;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		Car message = new Message();
		Car sense = new Sense();
		Car pass = new Pass();
		Car stop = new Stop();
		
		
	
		String time;
		String place;
		time= sc.next();
		place=sc.next();
		
		
		message.process( time, place);
		
		
		System.out.println("\n");
		pass.process(place, place);
		System.out.println("\n");	//if 조건문 생성
		sense.process(place, place);
		System.out.println("\n");  //if 조건문 생성
		stop.process(place, place);
//		
		
//		Car process[] = new Car[4];
//		String time ;
//		String place;
//		time= sc.next();
//		place=sc.next();
//		process[0] = new Message(time, place);
//		process[1] = new Pass();
//		process[2] = new Sense();
//		process[3] = new Stop();
//		
//		for(int i=0; i<process.length; i++) {
//		process[i]. process();
//
//		}
	}
}



