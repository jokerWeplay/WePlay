package weplay.spring;

public class HelloWorld {
	private String name;
	private String pwd;
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public HelloWorld(){
		System.out.println("name="+name);
	}
	
	public void hello(){
		System.out.println("hello "+name);
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + ", pwd=" + pwd + "]";
	}
	
	
	
	
}
