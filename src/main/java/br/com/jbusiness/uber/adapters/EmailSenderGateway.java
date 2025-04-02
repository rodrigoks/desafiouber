package br.com.jbusiness.uber.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);

}
