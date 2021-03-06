/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.awspring.cloud.jdbc.config.xml;

import io.awspring.cloud.core.support.documentation.RuntimeUse;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * {@link org.springframework.beans.factory.xml.NamespaceHandler} implementation for the
 * Spring Cloud AWS jdbc namespace.
 *
 * @author Agim Emruli
 * @since 1.0
 */
@RuntimeUse
@Deprecated
public class JdbcNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("data-source", new AmazonRdsDataSourceBeanDefinitionParser());
		registerBeanDefinitionParser("retry-interceptor", new AmazonRdsRetryInterceptorBeanDefinitionParser());
	}

}
