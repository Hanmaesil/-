
public class MemberVO {
	//자료들을 담고 있는 것들은  VO(VALUE OF)를 붙여준다.
	//클래스는 자료형이다!!!!!!
	//class의 구조는 크게 2가지로 정의된다.
	//1. 필드 : 데이터를 저장할 수 있는 변수
	
	//생성자 : 객체를 만드는 녀석
	//생성자 특징 3가지 : 리턴타입이 없음, 클래스이름과 똑같다, 객체를 생성할 때 무조건 생성해야 한다.
	
	private String name;  //메소드를 통해 우회해서 접근해야한다.
	private int age;
	private double height;
	private boolean marriage;
	
	//생성자를 설정하여 강제성을 띈다.
	public MemberVO(String name, int age, double height, boolean marriage) {
//		super(); //부모클래스의 생성자를 호출하겠다.
		this.name = name;
		this.age = age;
		this.height = height;
		this.marriage = marriage;
	}
	
	//2. 메소드 : 기능을 실행하는 녀석!
	//source 의 getter and setter 로 쉽게 만들수 있음
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() { //boolean 은 get대신 is로! 
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	
	
	//source에서 genr~~~ tostring 누르면 나온다.
	@Override //오브젝트의 tostring을 재정의 한 것.
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + ", marriage=" + marriage + "]";
	}
	
	
	
	
	
}
