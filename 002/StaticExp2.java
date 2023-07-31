public class StaticExp2{
	
	// 1.7 JDK
	public StaticExp2(){
		System.out.println("one project");

	}

	static{ //log
			System.out.println("config project");
	}

    public static void main(String[] arg){
		StaticExp2 e = new StaticExp2();
		System.out.print("start project");
	}

}