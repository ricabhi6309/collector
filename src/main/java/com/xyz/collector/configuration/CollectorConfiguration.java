package com.xyz.collector.configuration;


import io.dropwizard.Configuration;

import javax.validation.Valid;

public class CollectorConfiguration extends Configuration {

	@Valid
    private MessagesConfiguration messages;

    public MessagesConfiguration getMessages() {
        return messages;
    }

    public void setMessages(MessagesConfiguration messages) {
        this.messages = messages;
    }
}
