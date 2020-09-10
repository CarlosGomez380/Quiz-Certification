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
 * Provides the local service utility for responseUser. This utility wraps
 * <code>com.vass.di.quiz.certification.data.service.impl.responseUserLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author dgarces
 * @see responseUserLocalService
 * @generated
 */
public class responseUserLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.vass.di.quiz.certification.data.service.impl.responseUserLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the response user to the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUser the response user
	 * @return the response user that was added
	 */
	public static com.vass.di.quiz.certification.data.model.responseUser
		addresponseUser(
			com.vass.di.quiz.certification.data.model.responseUser
				responseUser) {

		return getService().addresponseUser(responseUser);
	}

	public static com.liferay.portal.kernel.json.JSONArray checkResponse(
		java.util.List<Long> answersId) {

		return getService().checkResponse(answersId);
	}

	/**
	 * Creates a new response user with the primary key. Does not add the response user to the database.
	 *
	 * @param responseUserId the primary key for the new response user
	 * @return the new response user
	 */
	public static com.vass.di.quiz.certification.data.model.responseUser
		createresponseUser(long responseUserId) {

		return getService().createresponseUser(responseUserId);
	}

	public static void createResponseUser(
		long responseUserId, long userId, long questionId,
		java.util.List<Long> answersId) {

		getService().createResponseUser(
			responseUserId, userId, questionId, answersId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the response user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user that was removed
	 * @throws PortalException if a response user with the primary key could not be found
	 */
	public static com.vass.di.quiz.certification.data.model.responseUser
			deleteresponseUser(long responseUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteresponseUser(responseUserId);
	}

	/**
	 * Deletes the response user from the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUser the response user
	 * @return the response user that was removed
	 */
	public static com.vass.di.quiz.certification.data.model.responseUser
		deleteresponseUser(
			com.vass.di.quiz.certification.data.model.responseUser
				responseUser) {

		return getService().deleteresponseUser(responseUser);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.vass.di.quiz.certification.data.model.impl.responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.vass.di.quiz.certification.data.model.impl.responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.vass.di.quiz.certification.data.model.responseUser
		fetchresponseUser(long responseUserId) {

		return getService().fetchresponseUser(responseUserId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the response user with the primary key.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user
	 * @throws PortalException if a response user with the primary key could not be found
	 */
	public static com.vass.di.quiz.certification.data.model.responseUser
			getresponseUser(long responseUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getresponseUser(responseUserId);
	}

	/**
	 * Returns a range of all the response users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.vass.di.quiz.certification.data.model.impl.responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of response users
	 * @param end the upper bound of the range of response users (not inclusive)
	 * @return the range of response users
	 */
	public static java.util.List
		<com.vass.di.quiz.certification.data.model.responseUser>
			getresponseUsers(int start, int end) {

		return getService().getresponseUsers(start, end);
	}

	/**
	 * Returns the number of response users.
	 *
	 * @return the number of response users
	 */
	public static int getresponseUsersCount() {
		return getService().getresponseUsersCount();
	}

	/**
	 * Updates the response user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param responseUser the response user
	 * @return the response user that was updated
	 */
	public static com.vass.di.quiz.certification.data.model.responseUser
		updateresponseUser(
			com.vass.di.quiz.certification.data.model.responseUser
				responseUser) {

		return getService().updateresponseUser(responseUser);
	}

	public static responseUserLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<responseUserLocalService, responseUserLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(responseUserLocalService.class);

		ServiceTracker<responseUserLocalService, responseUserLocalService>
			serviceTracker =
				new ServiceTracker
					<responseUserLocalService, responseUserLocalService>(
						bundle.getBundleContext(),
						responseUserLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}