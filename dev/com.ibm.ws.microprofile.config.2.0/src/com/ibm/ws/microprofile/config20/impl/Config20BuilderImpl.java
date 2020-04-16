/*******************************************************************************
 * Copyright (c) 2019, 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.config20.impl;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

import org.eclipse.microprofile.config.spi.ConfigBuilder;
import org.eclipse.microprofile.config.spi.ConfigSource;

import com.ibm.ws.microprofile.config14.impl.Config14BuilderImpl;

public class Config20BuilderImpl extends Config14BuilderImpl implements ConfigBuilder {

    public Config20BuilderImpl(ClassLoader classLoader, ScheduledExecutorService executor, Set<ConfigSource> internalConfigSources) {
        super(classLoader, executor, internalConfigSources);
    }

}
