package abstraction;

public class TelePhone extends Phone
{
	@Override
	void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Making Call by TelePhone");
	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("Receiving Call by TelePhone");
	}

	@Override
	void redial() {
		// TODO Auto-generated method stub
		System.out.println("Redial Call by TelePhone");
	}

}
