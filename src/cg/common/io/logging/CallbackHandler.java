package cg.common.io.logging;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import cg.common.check.Check;

public class CallbackHandler extends Handler {

	private OnLogLineWritten callback;
	
	public CallbackHandler(OnLogLineWritten callback){
		Check.notNull(callback);
		this.callback = callback;
	}
	
	@Override
	public void publish(LogRecord record) {
		callback.notify(record.getMessage());
	}

	@Override
	public void flush() {

	}

	@Override
	public void close() throws SecurityException {
		
	}

}
