package week04_day2_overriding_Car;



public class Sense extends Car{
	
		
		@Override
		public void process(  String time, String place ) {
			System.out.println("�ֺ������� �����մϴ�");
			System.out.println("�����ڸ� �����մϴ�");
			System.out.println("�����⵿������ ���� �̵��մϴ�");
			System.out.println("��ֹ��� ���� �̵��մϴ�");
			System.out.println("�����ڸ� �ν��ϸ� ���ǿ� ���� �̵��մϴ�");
	}
}
