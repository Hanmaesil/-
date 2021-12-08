
public class MemberVO {
	//�ڷ���� ��� �ִ� �͵���  VO(VALUE OF)�� �ٿ��ش�.
	//Ŭ������ �ڷ����̴�!!!!!!
	//class�� ������ ũ�� 2������ ���ǵȴ�.
	//1. �ʵ� : �����͸� ������ �� �ִ� ����
	
	//������ : ��ü�� ����� �༮
	//������ Ư¡ 3���� : ����Ÿ���� ����, Ŭ�����̸��� �Ȱ���, ��ü�� ������ �� ������ �����ؾ� �Ѵ�.
	
	private String name;  //�޼ҵ带 ���� ��ȸ�ؼ� �����ؾ��Ѵ�.
	private int age;
	private double height;
	private boolean marriage;
	
	//�����ڸ� �����Ͽ� �������� ���.
	public MemberVO(String name, int age, double height, boolean marriage) {
//		super(); //�θ�Ŭ������ �����ڸ� ȣ���ϰڴ�.
		this.name = name;
		this.age = age;
		this.height = height;
		this.marriage = marriage;
	}
	
	//2. �޼ҵ� : ����� �����ϴ� �༮!
	//source �� getter and setter �� ���� ����� ����
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
	public boolean isMarriage() { //boolean �� get��� is��! 
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	
	
	//source���� genr~~~ tostring ������ ���´�.
	@Override //������Ʈ�� tostring�� ������ �� ��.
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + ", marriage=" + marriage + "]";
	}
	
	
	
	
	
}
