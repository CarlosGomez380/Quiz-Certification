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
 * Provides a wrapper for {@link responseUserLocalService}.
 *
 * @author dgarces
 * @see responseUserLocalService
 * @generated
 */
public class responseUserLocalServiceWrapper
	implements responseUserLocalService,
			   ServiceWrapper<responseUserLocalService> {

	public responseUserLocalServiceWrapper(
		responseUserLocalService responseUserLocalService) {

		_responseUserLocalService = responseUserLocalService;
	}

	/**
	 * Adds the response user to the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUser the response user
	 * @return the response user that was added
	 */
	@Override
	public com.vass.di.quiz.certification.data.model.responseUser
		addresponseUser(
			com.vass.di.quiz.certification.data.model.responseUser
				responseUser) {

		return _responseUserLocalService.addresponseUser(responseUser);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray checkResponse(
		java.util.List<Long> answersId) {

		return _responseUserLocalService.checkResponse(answersId);
	}

	/**
	 * Creates a new response user with the primary key. Does not add the response user to the database.
	 *
	 * @param responseUserId the primary key for the new response user
	 * @return the new response user
	 */
	@Override
	public com.vass.di.quiz.certification.data.model.responseUser
		createresponseUser(long responseUserId) {

		return _responseUserLocalService.createresponseUser(responseUserId);
	}

	@Override
	public void createResponseUser(
		long responseUserId, long userId, long questionId,
		java.util.List<Long> answersId) {

		_responseUserLocalService.createResponseUser(
			responseUserId, userId, questionId, answersId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _responseUserLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the response user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user that was removed
	 * @throws PortalException if a response user with the primary key could not be found
	 */
	@Override
	public com.vass.di.quiz.certification.data.model.responseUser
			deleteresponseUser(long responseUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _responseUserLocalService.deleteresponseUser(responseUserId);
	}

	/**
	 * Deletes the response user from the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUser the response user
	 * @return the response user that was removed
	 */
	@Override
	public com.vass.di.quiz.certification.data.model.responseUser
		deleteresponseUser(
			com.vass.di.quiz.certification.data.model.responseUser
				responseUser) {

		return _responseUserLocalService.deleteresponseUser(responseUser);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _responseUserLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _responseUserLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _responseUserLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _responseUserLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _responseUserLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _responseUserLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.vass.di.quiz.certification.data.model.responseUser
		fetchresponseUser(long responseUserId) {

		return _responseUserLocalService.fetchresponseUser(responseUserId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _responseUserLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _responseUserLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _responseUserLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _responseUserLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the response user with the primary key.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user
	 * @throws PortalException if a response user with the primary key could not be found
	 */
	@Override
	public com.vass.di.quiz.certification.data.model.responseUser
			getresponseUser(long responseUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _responseUserLocalService.getresponseUser(responseUserId);
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
	@Override
	public java.util.List
		<com.vass.di.quiz.certification.data.model.responseUser>
			getresponseUsers(int start, int end) {

		return _responseUserLocalService.getresponseUsers(start, end);
	}

	/**
	 * Returns the number of response users.
	 *
	 * @return the number of response users
	 */
	@Override
	public int getresponseUsersCount() {
		return _responseUserLocalService.getresponseUsersCount();
	}

	/**
	 * Updates the response user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param responseUser the response user
	 * @return the response user that was updated
	 */
	@Override
	public com.vass.di.quiz.certification.data.model.responseUser
		updateresponseUser(
			com.vass.di.quiz.certification.data.model.responseUser
				responseUser) {

		return _responseUserLocalService.updateresponseUser(responseUser);
	}

	@Override
	public responseUserLocalService getWrappedService() {
		return _responseUserLocalService;
	}

	@Override
	public void setWrappedService(
		responseUserLocalService responseUserLocalService) {

		_responseUserLocalService = responseUserLocalService;
	}

	private responseUserLocalService _responseUserLocalService;

}