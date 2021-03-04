package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required
	private String topic;
	private String user;
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public UnsubscribeMsg (String user, String topic) {
		super(MessageType.UNSUBSCRIBE, topic);
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
		return "[unsubscribing from the topic " + topic + " for the user " + user + "]";
	}
}
