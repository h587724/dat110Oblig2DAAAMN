package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required
	private String topic;
	private String mess;
	private transient String user;
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public PublishMsg (String user, String topic, String message) {
		super(MessageType.PUBLISH, message);
		this.topic = topic;
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getMessage() {
		return mess;
	}

	public void setMessage(String mess) {
		this.mess = mess;
	}
	
	@Override
	public String toString () {
		return "[publishing the message \"" + mess + "\" on the topic " + topic + "]";
	}
}
