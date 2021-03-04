package no.hvl.dat110.messages;

import no.hvl.dat110.messagetransport.Connection;

public enum MessageType {

	CONNECT, DISCONNECT, SUBSCRIBE, UNSUBSCRIBE, PUBLISH, CREATETOPIC, DELETETOPIC, STATUS;
	
}
