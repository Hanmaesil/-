import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//클래스는 내가 원하는 대로 만다는 자료형이다!!!!!
		//내가 원하는 대로 데이터 타입을 한군데에 저장하는 것.
		//장민서의 정보를 저장하자(이름, 나이, 키, 결혼유무)
		
		MemberVO m1 = new MemberVO("장민서", 32, 186.5, false);//->> new 뒤의  member();가 생성자이다. //생성자 : 객체 생성 //객체랑 변수는 같은말.
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>(); //여러명을 담을 수 있다.
		list.add(m1);
		
		
		System.out.println(m1.toString());
	}

}
