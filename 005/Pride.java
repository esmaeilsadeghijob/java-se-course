public class Pride extends Car 
				   implements CarIntrface, CarSetting{
	
	@Override
	public void start(){
		System.out.println("start by swich");
	}
	
	@Override
	public void setSize(){
		System.out.println("setting");
	}
	
	@Override
	public void stop(){
		System.out.println("stop");
	}
}