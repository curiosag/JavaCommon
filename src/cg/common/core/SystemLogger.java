package cg.common.core;

import java.util.Observable;

import com.google.common.base.Optional;

public class SystemLogger extends AbstractLogger {
	
	@Override
	protected void hdlInfo(String info) {
		System.out.println("INFO: " + info);
	};

	@Override
	protected void hdlError(String error) {
		System.out.println("ERROR: " + error);
	};

}
