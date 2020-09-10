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

package com.vass.di.quiz.certification.data.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.vass.di.quiz.certification.data.exception.NoSuchresponseUserException;
import com.vass.di.quiz.certification.data.model.impl.responseUserImpl;
import com.vass.di.quiz.certification.data.model.impl.responseUserModelImpl;
import com.vass.di.quiz.certification.data.model.responseUser;
import com.vass.di.quiz.certification.data.service.persistence.impl.constants.QUIZPersistenceConstants;
import com.vass.di.quiz.certification.data.service.persistence.responseUserPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the response user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dgarces
 * @generated
 */
@Component(service = responseUserPersistence.class)
public class responseUserPersistenceImpl
	extends BasePersistenceImpl<responseUser>
	implements responseUserPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>responseUserUtil</code> to access the response user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		responseUserImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the response users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching response users
	 */
	@Override
	public List<responseUser> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<responseUser> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<responseUser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<responseUser> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<responseUser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<responseUser> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<responseUser> list = null;

		if (useFinderCache) {
			list = (List<responseUser>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (responseUser responseUser : list) {
					if (!uuid.equals(responseUser.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_RESPONSEUSER_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(responseUserModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<responseUser>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching response user
	 * @throws NoSuchresponseUserException if a matching response user could not be found
	 */
	@Override
	public responseUser findByUuid_First(
			String uuid, OrderByComparator<responseUser> orderByComparator)
		throws NoSuchresponseUserException {

		responseUser responseUser = fetchByUuid_First(uuid, orderByComparator);

		if (responseUser != null) {
			return responseUser;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchresponseUserException(sb.toString());
	}

	/**
	 * Returns the first response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching response user, or <code>null</code> if a matching response user could not be found
	 */
	@Override
	public responseUser fetchByUuid_First(
		String uuid, OrderByComparator<responseUser> orderByComparator) {

		List<responseUser> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching response user
	 * @throws NoSuchresponseUserException if a matching response user could not be found
	 */
	@Override
	public responseUser findByUuid_Last(
			String uuid, OrderByComparator<responseUser> orderByComparator)
		throws NoSuchresponseUserException {

		responseUser responseUser = fetchByUuid_Last(uuid, orderByComparator);

		if (responseUser != null) {
			return responseUser;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchresponseUserException(sb.toString());
	}

	/**
	 * Returns the last response user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching response user, or <code>null</code> if a matching response user could not be found
	 */
	@Override
	public responseUser fetchByUuid_Last(
		String uuid, OrderByComparator<responseUser> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<responseUser> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public responseUser[] findByUuid_PrevAndNext(
			long responseUserId, String uuid,
			OrderByComparator<responseUser> orderByComparator)
		throws NoSuchresponseUserException {

		uuid = Objects.toString(uuid, "");

		responseUser responseUser = findByPrimaryKey(responseUserId);

		Session session = null;

		try {
			session = openSession();

			responseUser[] array = new responseUserImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, responseUser, uuid, orderByComparator, true);

			array[1] = responseUser;

			array[2] = getByUuid_PrevAndNext(
				session, responseUser, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected responseUser getByUuid_PrevAndNext(
		Session session, responseUser responseUser, String uuid,
		OrderByComparator<responseUser> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_RESPONSEUSER_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(responseUserModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(responseUser)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<responseUser> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the response users where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (responseUser responseUser :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(responseUser);
		}
	}

	/**
	 * Returns the number of response users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching response users
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RESPONSEUSER_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"responseUser.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(responseUser.uuid IS NULL OR responseUser.uuid = '')";

	public responseUserPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(responseUser.class);

		setModelImplClass(responseUserImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the response user in the entity cache if it is enabled.
	 *
	 * @param responseUser the response user
	 */
	@Override
	public void cacheResult(responseUser responseUser) {
		entityCache.putResult(
			entityCacheEnabled, responseUserImpl.class,
			responseUser.getPrimaryKey(), responseUser);

		responseUser.resetOriginalValues();
	}

	/**
	 * Caches the response users in the entity cache if it is enabled.
	 *
	 * @param responseUsers the response users
	 */
	@Override
	public void cacheResult(List<responseUser> responseUsers) {
		for (responseUser responseUser : responseUsers) {
			if (entityCache.getResult(
					entityCacheEnabled, responseUserImpl.class,
					responseUser.getPrimaryKey()) == null) {

				cacheResult(responseUser);
			}
			else {
				responseUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all response users.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(responseUserImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the response user.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(responseUser responseUser) {
		entityCache.removeResult(
			entityCacheEnabled, responseUserImpl.class,
			responseUser.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<responseUser> responseUsers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (responseUser responseUser : responseUsers) {
			entityCache.removeResult(
				entityCacheEnabled, responseUserImpl.class,
				responseUser.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, responseUserImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new response user with the primary key. Does not add the response user to the database.
	 *
	 * @param responseUserId the primary key for the new response user
	 * @return the new response user
	 */
	@Override
	public responseUser create(long responseUserId) {
		responseUser responseUser = new responseUserImpl();

		responseUser.setNew(true);
		responseUser.setPrimaryKey(responseUserId);

		String uuid = PortalUUIDUtil.generate();

		responseUser.setUuid(uuid);

		return responseUser;
	}

	/**
	 * Removes the response user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user that was removed
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	@Override
	public responseUser remove(long responseUserId)
		throws NoSuchresponseUserException {

		return remove((Serializable)responseUserId);
	}

	/**
	 * Removes the response user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the response user
	 * @return the response user that was removed
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	@Override
	public responseUser remove(Serializable primaryKey)
		throws NoSuchresponseUserException {

		Session session = null;

		try {
			session = openSession();

			responseUser responseUser = (responseUser)session.get(
				responseUserImpl.class, primaryKey);

			if (responseUser == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchresponseUserException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(responseUser);
		}
		catch (NoSuchresponseUserException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected responseUser removeImpl(responseUser responseUser) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(responseUser)) {
				responseUser = (responseUser)session.get(
					responseUserImpl.class, responseUser.getPrimaryKeyObj());
			}

			if (responseUser != null) {
				session.delete(responseUser);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (responseUser != null) {
			clearCache(responseUser);
		}

		return responseUser;
	}

	@Override
	public responseUser updateImpl(responseUser responseUser) {
		boolean isNew = responseUser.isNew();

		if (!(responseUser instanceof responseUserModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(responseUser.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					responseUser);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in responseUser proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom responseUser implementation " +
					responseUser.getClass());
		}

		responseUserModelImpl responseUserModelImpl =
			(responseUserModelImpl)responseUser;

		if (Validator.isNull(responseUser.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			responseUser.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (responseUser.getCreateDate() == null)) {
			if (serviceContext == null) {
				responseUser.setCreateDate(now);
			}
			else {
				responseUser.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!responseUserModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				responseUser.setModifiedDate(now);
			}
			else {
				responseUser.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (responseUser.isNew()) {
				session.save(responseUser);

				responseUser.setNew(false);
			}
			else {
				responseUser = (responseUser)session.merge(responseUser);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {responseUserModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((responseUserModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					responseUserModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {responseUserModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, responseUserImpl.class,
			responseUser.getPrimaryKey(), responseUser, false);

		responseUser.resetOriginalValues();

		return responseUser;
	}

	/**
	 * Returns the response user with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the response user
	 * @return the response user
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	@Override
	public responseUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchresponseUserException {

		responseUser responseUser = fetchByPrimaryKey(primaryKey);

		if (responseUser == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchresponseUserException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return responseUser;
	}

	/**
	 * Returns the response user with the primary key or throws a <code>NoSuchresponseUserException</code> if it could not be found.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user
	 * @throws NoSuchresponseUserException if a response user with the primary key could not be found
	 */
	@Override
	public responseUser findByPrimaryKey(long responseUserId)
		throws NoSuchresponseUserException {

		return findByPrimaryKey((Serializable)responseUserId);
	}

	/**
	 * Returns the response user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param responseUserId the primary key of the response user
	 * @return the response user, or <code>null</code> if a response user with the primary key could not be found
	 */
	@Override
	public responseUser fetchByPrimaryKey(long responseUserId) {
		return fetchByPrimaryKey((Serializable)responseUserId);
	}

	/**
	 * Returns all the response users.
	 *
	 * @return the response users
	 */
	@Override
	public List<responseUser> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<responseUser> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<responseUser> findAll(
		int start, int end, OrderByComparator<responseUser> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<responseUser> findAll(
		int start, int end, OrderByComparator<responseUser> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<responseUser> list = null;

		if (useFinderCache) {
			list = (List<responseUser>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RESPONSEUSER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RESPONSEUSER;

				sql = sql.concat(responseUserModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<responseUser>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the response users from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (responseUser responseUser : findAll()) {
			remove(responseUser);
		}
	}

	/**
	 * Returns the number of response users.
	 *
	 * @return the number of response users
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RESPONSEUSER);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "responseUserId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RESPONSEUSER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return responseUserModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the response user persistence.
	 */
	@Activate
	public void activate() {
		responseUserModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		responseUserModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, responseUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, responseUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, responseUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, responseUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			responseUserModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(responseUserImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = QUIZPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.vass.di.quiz.certification.data.model.responseUser"),
			true);
	}

	@Override
	@Reference(
		target = QUIZPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUIZPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RESPONSEUSER =
		"SELECT responseUser FROM responseUser responseUser";

	private static final String _SQL_SELECT_RESPONSEUSER_WHERE =
		"SELECT responseUser FROM responseUser responseUser WHERE ";

	private static final String _SQL_COUNT_RESPONSEUSER =
		"SELECT COUNT(responseUser) FROM responseUser responseUser";

	private static final String _SQL_COUNT_RESPONSEUSER_WHERE =
		"SELECT COUNT(responseUser) FROM responseUser responseUser WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "responseUser.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No responseUser exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No responseUser exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		responseUserPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	static {
		try {
			Class.forName(QUIZPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}