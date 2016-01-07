package cg.common.io.logging;

import java.io.PrintStream;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//credits to Nick Stephen at https://blogs.oracle.com/nickstephen/entry/java_redirecting_system_out_and

public class StdIORedirect {
	
	public static void addRedirect(Handler handler) {

		PrintStream stdout = System.out; // just in case
		PrintStream stderr = System.err;

		LoggingOutputStream los;
	
		los = new LoggingOutputStream(Logger.getLogger("stdout"), StdOutErrLevel.STDOUT);
		System.setOut(new PrintStream(los, true));
		
		los = new LoggingOutputStream(Logger.getLogger("stderr"), StdOutErrLevel.STDERR);
		System.setErr(new PrintStream(los, true));
		
		handler.setFormatter(new SimpleFormatter());
        Logger.getLogger("").addHandler(handler);
	}

}
