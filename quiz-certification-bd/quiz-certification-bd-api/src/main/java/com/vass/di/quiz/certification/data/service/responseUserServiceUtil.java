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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for responseUser. This utility wraps
 * <code>com.vass.di.quiz.certification.data.service.impl.responseUserServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author dgarces
 * @see responseUserService
 * @generated
 */
public class responseUserServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.vass.di.quiz.certification.data.service.impl.responseUserServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.json.JSONArray checkResponse(
		java.util.List<Long> answersId) {

		return getService().checkResponse(answersId);
	}

	public static void createResponseUser(
		long responseUserId, long userId, long questionId,
		java.util.List<Long> answersId) {

		getService().createResponseUser(
			responseUserId, userId, questionId, answersId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static responseUserService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<responseUserService, responseUserService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(responseUserService.class);

		ServiceTracker<responseUserService, responseUserService>
			serviceTracker =
				new ServiceTracker<responseUserService, responseUserService>(
					bundle.getBundleContext(), responseUserService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}