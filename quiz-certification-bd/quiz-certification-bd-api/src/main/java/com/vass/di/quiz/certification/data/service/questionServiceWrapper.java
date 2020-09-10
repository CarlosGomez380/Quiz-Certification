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
 * Provides a wrapper for {@link questionService}.
 *
 * @author dgarces
 * @see questionService
 * @generated
 */
public class questionServiceWrapper
	implements questionService, ServiceWrapper<questionService> {

	public questionServiceWrapper(questionService questionService) {
		_questionService = questionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _questionService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getQuestionAnswer(
		int cantQuestion, String category) {

		return _questionService.getQuestionAnswer(cantQuestion, category);
	}

	@Override
	public questionService getWrappedService() {
		return _questionService;
	}

	@Override
	public void setWrappedService(questionService questionService) {
		_questionService = questionService;
	}

	private questionService _questionService;

}