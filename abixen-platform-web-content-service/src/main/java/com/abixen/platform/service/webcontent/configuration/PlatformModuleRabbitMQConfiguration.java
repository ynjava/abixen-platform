/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.service.webcontent.configuration;

import com.abixen.platform.common.infrastructure.rabbitmq.AbstractRabbitMQConfiguration;
import com.abixen.platform.service.webcontent.rabbitmq.MessageReceiver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static com.abixen.platform.common.infrastructure.util.PlatformProfiles.DEV;
import static com.abixen.platform.common.infrastructure.util.PlatformProfiles.DOCKER;


@Profile({DEV, DOCKER})
@Slf4j
@Configuration
public class PlatformModuleRabbitMQConfiguration extends AbstractRabbitMQConfiguration {

    private static final String QUEUE_NAME = "abixen-platform-web-content-service";


    public PlatformModuleRabbitMQConfiguration() {
        super(QUEUE_NAME);
    }

    @Bean
    MessageListenerAdapter listenerAdapter(MessageReceiver messageReceiver) {
        return new MessageListenerAdapter(messageReceiver, "receiveMessage");
    }

}
