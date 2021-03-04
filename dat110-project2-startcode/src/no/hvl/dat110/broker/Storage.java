package no.hvl.dat110.broker;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import no.hvl.dat110.common.TODO;
import no.hvl.dat110.common.Logger;
import no.hvl.dat110.messagetransport.Connection;

public class Storage {

	// data structure for managing subscriptions
	// maps from a topic to set of subscribed users
	protected ConcurrentHashMap<String, Set<String>> subscriptions; //<topic, set of users> set of users = hashSet (ordered list)
	
	// data structure for managing currently connected clients
	// maps from user to corresponding client session object
	
	protected ConcurrentHashMap<String, ClientSession> clients; //<user, session>

	public Storage() {
		subscriptions = new ConcurrentHashMap<String, Set<String>>();
		clients = new ConcurrentHashMap<String, ClientSession>();
	}

	public Collection<ClientSession> getSessions() {
		return clients.values();
	}

	public Set<String> getTopics() {

		return subscriptions.keySet();

	}

	// get the session object for a given user
	// session object can be used to send a message to the user
	
	public ClientSession getSession(String user) {

		ClientSession session = clients.get(user);

		return session;
	}

	public Set<String> getSubscribers(String topic) {

		return (subscriptions.get(topic));

	}

	public void addClientSession(String user, Connection connection) {

		// TODO: add corresponding client session to the storage
		
		clients.put(user, new ClientSession(user, connection));
		
	}

	public void removeClientSession(String user) {

		// TODO: remove client session for user from the storage

		clients.remove(user);
		
	}

	public void createTopic(String topic) {

		// TODO: create topic in the storage

		subscriptions.put(topic, new HashSet<String>());
	
	}

	public void deleteTopic(String topic) {

		// TODO: delete topic from the storage

		subscriptions.remove(topic);
		
	}

	public void addSubscriber(String user, String topic) {

		// TODO: add the user as subscriber to the topic
		
		if (subscriptions.containsKey(topic)) {
			Set<String> set = subscriptions.get(topic);
			set.add(user);
			subscriptions.put(topic, set);
		} else {
			Set<String> set = new HashSet<String>();
			set.add(user);
			subscriptions.put(topic, set);
		}
		
	}

	public void removeSubscriber(String user, String topic) {

		// TODO: remove the user as subscriber to the topic

		if (subscriptions.containsKey(topic)){
			Set<String> set = subscriptions.get(topic);
			set.remove(user);
			subscriptions.put(topic, set);
		} else {
			System.out.println("The topic \"" + topic + "\" you are trying to reach is absent! (broker.Storage.removeSubscriber)");
		}
	}
}
