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

package com.vass.di.quiz.certification.data.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.vass.di.quiz.certification.data.model.responseUser;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the response user service. This utility wraps <code>com.vass.di.quiz.certification.data.service.persistence.impl.responseUserPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dgarces
 * @see responseUserPersistence
 * @generated
 */
public class responseUserUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(responseUser responseUser) {
		getPersistence().clearCache(responseUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, responseUser> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<responseUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<responseUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<responseUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<responseUser> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static responseUser update(responseUser responseUser) {
		return getPersistence().update(responseUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static responseUser update(
		responseUser responseUser, ServiceContext serviceContext) {

		return getPersistence().update(responseUser, serviceContext);
	}

	/**
	 * Returns all the response users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching response users
	 */
	public static List<responseUser> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the response users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of response users
	 * @param end the upper bound of the range of response users (not inclusive)
	 * @return the range of matching response users
	 */
	public static List<responseUser> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the response users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of response users
	 * @param end the upper bound of the range of response users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching response users
	 */
	public static List<responseUser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<responseUser> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the response users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of response users
	 * @param end the upper bound of the range of response users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching response users
	 */
	public static List<responseUser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<responseUser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching response user
	 * @throws NoSuchresponseUserException if a matching response user could not be found
	 */
	public static responseUser findByUuid_First(
			String uuid, OrderByComparator<responseUser> orderByComparator)
		throws com.vass.di.quiz.certification.data.exception.
			NoSuchresponseUserException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching response user, or <code>null</code> if a matching response user could not be found
	 */
	public static responseUser fetchByUuid_First(
		String uuid, OrderByComparator<responseUser> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching response user
	 * @throws NoSuchresponseUserException if a matching response user could not be found
	 */
	public static responseUser findByUuid_Last(
			String uuid, OrderByComparator<responseUser> orderByComparator)
		throws com.vass.di.quiz.certification.data.exception.
			NoSuchresponseUserException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching response user, or <code>null</code> if a matching response user could not be found
	 */
	public static responseUser fetchByUuid_Last(
		String uuid, OrderByComparator<responseUser> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the response users before and after the current response user in the ordered set where uuid = &#63;.
	 *
	 * @param responseUserId the primary key of the current response user
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next response user
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	public static responseUser[] findByUuid_PrevAndNext(
			long responseUserId, String uuid,
			OrderByComparator<responseUser> orderByComparator)
		throws com.vass.di.quiz.certification.data.exception.
			NoSuchresponseUserException {

		return getPersistence().findByUuid_PrevAndNext(
			responseUserId, uuid, orderByComparator);
	}

	/**
	 * Removes all the response users where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of response users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching response users
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the response user in the entity cache if it is enabled.
	 *
	 * @param responseUser the response user
	 */
	public static void cacheResult(responseUser responseUser) {
		getPersistence().cacheResult(responseUser);
	}

	/**
	 * Caches the response users in the entity cache if it is enabled.
	 *
	 * @param responseUsers the response users
	 */
	public static void cacheResult(List<responseUser> responseUsers) {
		getPersistence().cacheResult(responseUsers);
	}

	/**
	 * Creates a new response user with the primary key. Does not add the response user to the database.
	 *
	 * @param responseUserId the primary key for the new response user
	 * @return the new response user
	 */
	public static responseUser create(long responseUserId) {
		return getPersistence().create(responseUserId);
	}

	/**
	 * Removes the response user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user that was removed
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	public static responseUser remove(long responseUserId)
		throws com.vass.di.quiz.certification.data.exception.
			NoSuchresponseUserException {

		return getPersistence().remove(responseUserId);
	}

	public static responseUser updateImpl(responseUser responseUser) {
		return getPersistence().updateImpl(responseUser);
	}

	/**
	 * Returns the response user with the primary key or throws a <code>NoSuchresponseUserException</code> if it could not be found.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	public static responseUser findByPrimaryKey(long responseUserId)
		throws com.vass.di.quiz.certification.data.exception.
			NoSuchresponseUserException {

		return getPersistence().findByPrimaryKey(responseUserId);
	}

	/**
	 * Returns the response user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user, or <code>null</code> if a response user with the primary key could not be found
	 */
	public static responseUser fetchByPrimaryKey(long responseUserId) {
		return getPersistence().fetchByPrimaryKey(responseUserId);
	}

	/**
	 * Returns all the response users.
	 *
	 * @return the response users
	 */
	public static List<responseUser> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the response users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of response users
	 * @param end the upper bound of the range of response users (not inclusive)
	 * @return the range of response users
	 */
	public static List<responseUser> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the response users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of response users
	 * @param end the upper bound of the range of response users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of response users
	 */
	public static List<responseUser> findAll(
		int start, int end, OrderByComparator<responseUser> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the response users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>responseUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of response users
	 * @param end the upper bound of the range of response users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of response users
	 */
	public static List<responseUser> findAll(
		int start, int end, OrderByComparator<responseUser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the response users from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of response users.
	 *
	 * @return the number of response users
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static responseUserPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<responseUserPersistence, responseUserPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(responseUserPersistence.class);

		ServiceTracker<responseUserPersistence, responseUserPersistence>
			serviceTracker =
				new ServiceTracker
					<responseUserPersistence, responseUserPersistence>(
						bundle.getBundleContext(),
						responseUserPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}