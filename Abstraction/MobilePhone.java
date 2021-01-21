package abstraction;

public class MobilePhone extends Phone
{
	@Override
	void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Making Call by MobilePhone");
	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("Receiving Call by MobilePhone");
	}

	@Override
	void redial() {
		// TODO Auto-generated method stub
		System.out.println("Redial call by MobilePhone");
	}
	
	void sendSMS()
	{
		System.out.println("SMS Sending by MobilePhone");
	}

}
