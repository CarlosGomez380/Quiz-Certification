/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.vass.di.quiz.certification.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link responseUserService}.
 *
 * @author dgarces
 * @see responseUserService
 * @generated
 */
public class responseUserServiceWrapper
	implements responseUserService, ServiceWrapper<responseUserService> {

	public responseUserServiceWrapper(responseUserService responseUserService) {
		_responseUserService = responseUserService;
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray checkResponse(
		java.util.List<Long> answersId) {

		return _responseUserService.checkResponse(answersId);
	}

	@Override
	public void createResponseUser(
		long responseUserId, long userId, long questionId,
		java.util.List<Long> answersId) {

		_responseUserService.createResponseUser(
			responseUserId, userId, questionId, answersId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _responseUserService.getOSGiServiceIdentifier();
	}

	@Override
	public responseUserService getWrappedService() {
		return _responseUserService;
	}

	@Override
	public void setWrappedService(responseUserService responseUserService) {
		_responseUserService = responseUserService;
	}

	private responseUserService _responseUserService;

}