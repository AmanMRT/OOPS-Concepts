package abstraction;
//Testclass for Phone.java
public class PhoneTester {

	public static void main(String[] args) 
	{
		MobilePhone mp = new MobilePhone();
		mp.makeCall();
		mp.receiveCall();
		mp.redial();
		mp.sendSMS();
		
		TelePhone tp = new TelePhone();
		tp.makeCall();
		tp.receiveCall();
		tp.redial();
		
		SmartPhone sp = new SmartPhone();
		sp.makeCall();
		sp.receiveCall();
		sp.redial();
		sp.sendSMS();
		sp.touch();
		sp.internet();
	}

}
