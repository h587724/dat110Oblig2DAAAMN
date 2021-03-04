package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required
	private String topic;
	private String message;
	private String user;
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public PublishMsg (String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
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
		return message;
	}

	public void setMessage(String mess) {
		this.message = mess;
	}
	
	@Override
	public String toString () {
		return "[publishing the message \"" + message + "\" on the topic " + topic + "]";
	}
}
