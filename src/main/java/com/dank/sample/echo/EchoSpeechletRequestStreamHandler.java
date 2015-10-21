package com.dank.sample.echo;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public final class EchoSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
	private static final Set<String> supportedApplicationIds = new HashSet<String>();
	static {
	    /*
	     * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
	     * Alexa Skill and put the relevant Application Ids in this Set.
	     */
	    supportedApplicationIds.add("amzn1.echo-sdk-ams.app.71caec52-e36b-47d4-9577-00968df1a5a1");
	}
	
	public EchoSpeechletRequestStreamHandler() {
	    super(new EchoSpeechlet(), supportedApplicationIds);
	}
}
