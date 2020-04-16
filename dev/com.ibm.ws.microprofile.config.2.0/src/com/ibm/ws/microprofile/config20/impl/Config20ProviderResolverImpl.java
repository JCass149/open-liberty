/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.config20.impl;

import com.ibm.ws.microprofile.config.impl.AbstractConfigBuilder;
import com.ibm.ws.microprofile.config14.impl.Config14ProviderResolverImpl;

public class Config20ProviderResolverImpl extends Config14ProviderResolverImpl {

    @Override
    protected AbstractConfigBuilder newBuilder(ClassLoader classLoader) {
        return new Config20BuilderImpl(classLoader, getScheduledExecutorService(), getInternalConfigSources());
    }

}
