/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml.saml2.authentication;

import org.springframework.security.saml.key.SimpleKey;
import org.springframework.security.saml.saml2.metadata.Binding;
import org.springframework.security.saml.saml2.metadata.Endpoint;
import org.springframework.security.saml.saml2.signature.AlgorithmMethod;
import org.springframework.security.saml.saml2.signature.DigestMethod;

/**
 * Implementation samlp:AuthnRequestType as defined by
 * https://www.oasis-open.org/committees/download.php/35711/sstc-saml-core-errata-2.0-wd-06-diff.pdf
 * Page 50, Line 2147
 */
public class AuthenticationRequest extends Request<AuthenticationRequest> {

	private String providerName;
	private Binding binding;
	private Boolean forceAuth;
	private Boolean isPassive;
	private Endpoint assertionConsumerService;
	private RequestedAuthenticationContext requestedAuthenticationContext;
	private AuthenticationContextClassReference authenticationContextClassReference;
	private SimpleKey signingKey;
	private AlgorithmMethod algorithm;
	private DigestMethod digest;

	private NameIdPolicy nameIdPolicy;

	public String getProviderName() {
		return providerName;
	}

	public AuthenticationRequest setProviderName(String providerName) {
		this.providerName = providerName;
		return _this();
	}

	public Binding getBinding() {
		return binding;
	}

	public AuthenticationRequest setBinding(Binding binding) {
		this.binding = binding;
		return _this();
	}

	public Endpoint getAssertionConsumerService() {
		return assertionConsumerService;
	}

	public AuthenticationRequest setAssertionConsumerService(Endpoint assertionConsumerService) {
		this.assertionConsumerService = assertionConsumerService;
		return _this();
	}

	public RequestedAuthenticationContext getRequestedAuthenticationContext() {
		return requestedAuthenticationContext;
	}

	public AuthenticationRequest setRequestedAuthenticationContext(
		RequestedAuthenticationContext requestedAuthenticationContext
	) {
		this.requestedAuthenticationContext = requestedAuthenticationContext;
		return _this();
	}

	public AuthenticationContextClassReference getAuthenticationContextClassReference() {
		return authenticationContextClassReference;
	}

	public AuthenticationRequest setAuthenticationContextClassReference(
		AuthenticationContextClassReference authenticationContextClassReference
	) {
		this.authenticationContextClassReference = authenticationContextClassReference;
		return _this();
	}

	public SimpleKey getSigningKey() {
		return signingKey;
	}

	public AlgorithmMethod getAlgorithm() {
		return algorithm;
	}

	public DigestMethod getDigest() {
		return digest;
	}

	public NameIdPolicy getNameIdPolicy() {
		return nameIdPolicy;
	}

	public AuthenticationRequest setNameIdPolicy(NameIdPolicy nameIdPolicy) {
		this.nameIdPolicy = nameIdPolicy;
		return _this();
	}

	public AuthenticationRequest setForceAuth(Boolean forceAuth) {
		this.forceAuth = forceAuth;
		return _this();
	}

	public AuthenticationRequest setPassive(Boolean passive) {
		isPassive = passive;
		return _this();
	}

	public Boolean isForceAuth() {
		return forceAuth;
	}

	public Boolean isPassive() {
		return isPassive;
	}

	public AuthenticationRequest setSigningKey(SimpleKey signingKey, AlgorithmMethod algorithm, DigestMethod digest) {
		this.signingKey = signingKey;
		this.algorithm = algorithm;
		this.digest = digest;
		return _this();
	}
}
