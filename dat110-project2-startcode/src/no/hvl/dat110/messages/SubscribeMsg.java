package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required
	private String topic;
	private String user;
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public SubscribeMsg (String user, String topic) {
		super(MessageType.SUBSCRIBE, topic);
		this.user = user;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString () {
		return "[connecting to the topic " + topic + " for the user " + user + "]";
	}
	
}
