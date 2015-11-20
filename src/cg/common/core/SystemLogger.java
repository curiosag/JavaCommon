package cg.common.core;

public class SystemLogger implements Logging {

	@Override
	public void Info(String info) {
		System.out.println("INFO: " + info);
	}

	@Override
	public void Error(String error) {
		System.out.println("ERROR: " + error);
	}

}
