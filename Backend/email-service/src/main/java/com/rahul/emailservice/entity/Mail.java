package com.rahul.emailservice.entity;
/**
 * 
 * @author Rahul Kumar
 *
 */
public class Mail {
	/**
	 *  An email can have three fields that is
	 *  mailTo - specifies the receviers Id
	 *  mailSubject- the subject of your mail
	 *  mailBody - the body of your mail
	 */
	private String mailTo;
	private String mailSubject;
	private String mailBody;
	
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getMailSubject() {
		return mailSubject;
	}
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}
	public String getMailBody() {
		return mailBody;
	}
	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}

}
