package login;

public class GirlsData {
	private String name;
	private int age;
	private String city;
	private String height;
	private String weight;
	private String body;
	
	
	public GirlsData() {
		super();
	}
	public GirlsData(String name, int age, String city, String height, String weight, String body) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.height = height;
		this.weight = weight;
		this.body = body;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return this.getName()+"-"+this.getAge()+"-"+this.getHeight()+"-"+this.getWeight()+"-"+this.getBody()+"-"+this.getCity();
	}
	
}
