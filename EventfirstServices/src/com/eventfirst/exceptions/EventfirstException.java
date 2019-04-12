package com.eventfirst.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;

public class EventfirstException extends Exception {

	public EventfirstException() {
		super();
	}

	public EventfirstException(String message) {
		this(message, null);
	}

	public EventfirstException(Throwable cause) {
		this(null, cause);
	}

	public EventfirstException(String message, Throwable cause) {
		super(message, cause);
	}

	public void printStackTrace() {
		if (getCause() != null) {
			getCause().printStackTrace();
		} else {
			super.printStackTrace();
		}
	}

	public void printStackTrace(PrintStream s) {
		if (getCause() != null) {
			getCause().printStackTrace(s);
		} else {
			super.printStackTrace(s);
		}
	}

	public void printStackTrace(PrintWriter w) {
		if (getCause() != null) {
			getCause().printStackTrace(w);
		} else {
			super.printStackTrace(w);
		}
	}
}
