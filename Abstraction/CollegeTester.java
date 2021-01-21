package abstraction;

public class CollegeTester {

	public static void main(String[] args) 
	{
		UGC ugc = new MIETKUMON(); //Will excess all method of UGC INterface only
		ugc.classroom();
		ugc.conferenceroom();
		ugc.placementcell();
		ugc.lab();
		ugc.runMBA();
		
		AICTE aicte = new MIETMEERUT();	//Will excess all methods of AICTE Interface only
		aicte.classroom();
		aicte.conferenceroom();
		aicte.lab();
		aicte.placementcell();
		aicte.runBtech();
		aicte.technicaltrainer();
		
		MIETMEERUT mietmrt = new MIETMEERUT();	//Will excess all methods of MIETMEERUT class
		mietmrt.classroom();
		mietmrt.conferenceroom();
		mietmrt.lab();
		mietmrt.placementcell();
		mietmrt.runBtech();
		mietmrt.runMBA();
		mietmrt.technicaltrainer();
		
		UGC ugcmiet = new MIETMEERUT();	//will onlu excess methods of UGC INTERFACE only
		ugcmiet.classroom();
		ugcmiet.conferenceroom();
		ugcmiet.placementcell();
		ugcmiet.lab();
		ugcmiet.runMBA();
	}

}
