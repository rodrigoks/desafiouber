package br.com.jbusiness.uber.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);

}
