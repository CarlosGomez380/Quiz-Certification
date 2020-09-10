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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.vass.di.quiz.certification.data.exception.NoSuchresponseUserException;
import com.vass.di.quiz.certification.data.model.responseUser;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the response user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dgarces
 * @see responseUserUtil
 * @generated
 */
@ProviderType
public interface responseUserPersistence extends BasePersistence<responseUser> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link responseUserUtil} to access the response user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the response users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching response users
	 */
	public java.util.List<responseUser> findByUuid(String uuid);

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
	public java.util.List<responseUser> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<responseUser> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<responseUser>
			orderByComparator);

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
	public java.util.List<responseUser> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<responseUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching response user
	 * @throws NoSuchresponseUserException if a matching response user could not be found
	 */
	public responseUser findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<responseUser>
				orderByComparator)
		throws NoSuchresponseUserException;

	/**
	 * Returns the first response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching response user, or <code>null</code> if a matching response user could not be found
	 */
	public responseUser fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<responseUser>
			orderByComparator);

	/**
	 * Returns the last response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching response user
	 * @throws NoSuchresponseUserException if a matching response user could not be found
	 */
	public responseUser findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<responseUser>
				orderByComparator)
		throws NoSuchresponseUserException;

	/**
	 * Returns the last response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching response user, or <code>null</code> if a matching response user could not be found
	 */
	public responseUser fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<responseUser>
			orderByComparator);

	/**
	 * Returns the response users before and after the current response user in the ordered set where uuid = &#63;.
	 *
	 * @param responseUserId the primary key of the current response user
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next response user
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	public responseUser[] findByUuid_PrevAndNext(
			long responseUserId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<responseUser>
				orderByComparator)
		throws NoSuchresponseUserException;

	/**
	 * Removes all the response users where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of response users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching response users
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the response user in the entity cache if it is enabled.
	 *
	 * @param responseUser the response user
	 */
	public void cacheResult(responseUser responseUser);

	/**
	 * Caches the response users in the entity cache if it is enabled.
	 *
	 * @param responseUsers the response users
	 */
	public void cacheResult(java.util.List<responseUser> responseUsers);

	/**
	 * Creates a new response user with the primary key. Does not add the response user to the database.
	 *
	 * @param responseUserId the primary key for the new response user
	 * @return the new response user
	 */
	public responseUser create(long responseUserId);

	/**
	 * Removes the response user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user that was removed
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	public responseUser remove(long responseUserId)
		throws NoSuchresponseUserException;

	public responseUser updateImpl(responseUser responseUser);

	/**
	 * Returns the response user with the primary key or throws a <code>NoSuchresponseUserException</code> if it could not be found.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	public responseUser findByPrimaryKey(long responseUserId)
		throws NoSuchresponseUserException;

	/**
	 * Returns the response user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user, or <code>null</code> if a response user with the primary key could not be found
	 */
	public responseUser fetchByPrimaryKey(long responseUserId);

	/**
	 * Returns all the response users.
	 *
	 * @return the response users
	 */
	public java.util.List<responseUser> findAll();

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
	public java.util.List<responseUser> findAll(int start, int end);

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
	public java.util.List<responseUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<responseUser>
			orderByComparator);

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
	public java.util.List<responseUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<responseUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the response users from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of response users.
	 *
	 * @return the number of response users
	 */
	public int countAll();

}