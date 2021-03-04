package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	
	String topic;
	// message sent from client to create topic on the broker
public DeleteTopicMsg(String topic, String user) {
	super(MessageType.DELETETOPIC,user);
	this.topic = topic;
	
}
public String getTopic() {
	return topic;
}
public void setTopic(String topic) {
	this.topic = topic;
}
@Override
public String toString() {
	return "DeleteTopicMsg [topic=" + topic + "]";
}

	
	
	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

}