import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Ŭ������ ���� ���ϴ� ��� ���ٴ� �ڷ����̴�!!!!!
		//���� ���ϴ� ��� ������ Ÿ���� �ѱ����� �����ϴ� ��.
		//��μ��� ������ ��������(�̸�, ����, Ű, ��ȥ����)
		
		MemberVO m1 = new MemberVO("��μ�", 32, 186.5, false);//->> new ����  member();�� �������̴�. //������ : ��ü ���� //��ü�� ������ ������.
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>(); //�������� ���� �� �ִ�.
		list.add(m1);
		
		
		System.out.println(m1.toString());
	}

}
