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

import com.vass.di.quiz.certification.data.exception.NoSuchanswerException;
import com.vass.di.quiz.certification.data.model.answer;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the answer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dgarces
 * @see answerUtil
 * @generated
 */
@ProviderType
public interface answerPersistence extends BasePersistence<answer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link answerUtil} to access the answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the answers where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @return the matching answers
	 */
	public java.util.List<answer> findByQuestion(long questionId);

	/**
	 * Returns a range of all the answers where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>answerModelImpl</code>.
	 * </p>
	 *
	 * @param questionId the question ID
	 * @param start the lower bound of the range of answers
	 * @param end the upper bound of the range of answers (not inclusive)
	 * @return the range of matching answers
	 */
	public java.util.List<answer> findByQuestion(
		long questionId, int start, int end);

	/**
	 * Returns an ordered range of all the answers where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>answerModelImpl</code>.
	 * </p>
	 *
	 * @param questionId the question ID
	 * @param start the lower bound of the range of answers
	 * @param end the upper bound of the range of answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching answers
	 */
	public java.util.List<answer> findByQuestion(
		long questionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<answer>
			orderByComparator);

	/**
	 * Returns an ordered range of all the answers where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>answerModelImpl</code>.
	 * </p>
	 *
	 * @param questionId the question ID
	 * @param start the lower bound of the range of answers
	 * @param end the upper bound of the range of answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching answers
	 */
	public java.util.List<answer> findByQuestion(
		long questionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<answer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first answer in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answer
	 * @throws NoSuchanswerException if a matching answer could not be found
	 */
	public answer findByQuestion_First(
			long questionId,
			com.liferay.portal.kernel.util.OrderByComparator<answer>
				orderByComparator)
		throws NoSuchanswerException;

	/**
	 * Returns the first answer in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answer, or <code>null</code> if a matching answer could not be found
	 */
	public answer fetchByQuestion_First(
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<answer>
			orderByComparator);

	/**
	 * Returns the last answer in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answer
	 * @throws NoSuchanswerException if a matching answer could not be found
	 */
	public answer findByQuestion_Last(
			long questionId,
			com.liferay.portal.kernel.util.OrderByComparator<answer>
				orderByComparator)
		throws NoSuchanswerException;

	/**
	 * Returns the last answer in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answer, or <code>null</code> if a matching answer could not be found
	 */
	public answer fetchByQuestion_Last(
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<answer>
			orderByComparator);

	/**
	 * Returns the answers before and after the current answer in the ordered set where questionId = &#63;.
	 *
	 * @param answerId the primary key of the current answer
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next answer
	 * @throws NoSuchanswerException if a answer with the primary key could not be found
	 */
	public answer[] findByQuestion_PrevAndNext(
			long answerId, long questionId,
			com.liferay.portal.kernel.util.OrderByComparator<answer>
				orderByComparator)
		throws NoSuchanswerException;

	/**
	 * Removes all the answers where questionId = &#63; from the database.
	 *
	 * @param questionId the question ID
	 */
	public void removeByQuestion(long questionId);

	/**
	 * Returns the number of answers where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @return the number of matching answers
	 */
	public int countByQuestion(long questionId);

	/**
	 * Caches the answer in the entity cache if it is enabled.
	 *
	 * @param answer the answer
	 */
	public void cacheResult(answer answer);

	/**
	 * Caches the answers in the entity cache if it is enabled.
	 *
	 * @param answers the answers
	 */
	public void cacheResult(java.util.List<answer> answers);

	/**
	 * Creates a new answer with the primary key. Does not add the answer to the database.
	 *
	 * @param answerId the primary key for the new answer
	 * @return the new answer
	 */
	public answer create(long answerId);

	/**
	 * Removes the answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param answerId the primary key of the answer
	 * @return the answer that was removed
	 * @throws NoSuchanswerException if a answer with the primary key could not be found
	 */
	public answer remove(long answerId) throws NoSuchanswerException;

	public answer updateImpl(answer answer);

	/**
	 * Returns the answer with the primary key or throws a <code>NoSuchanswerException</code> if it could not be found.
	 *
	 * @param answerId the primary key of the answer
	 * @return the answer
	 * @throws NoSuchanswerException if a answer with the primary key could not be found
	 */
	public answer findByPrimaryKey(long answerId) throws NoSuchanswerException;

	/**
	 * Returns the answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param answerId the primary key of the answer
	 * @return the answer, or <code>null</code> if a answer with the primary key could not be found
	 */
	public answer fetchByPrimaryKey(long answerId);

	/**
	 * Returns all the answers.
	 *
	 * @return the answers
	 */
	public java.util.List<answer> findAll();

	/**
	 * Returns a range of all the answers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>answerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of answers
	 * @param end the upper bound of the range of answers (not inclusive)
	 * @return the range of answers
	 */
	public java.util.List<answer> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the answers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>answerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of answers
	 * @param end the upper bound of the range of answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of answers
	 */
	public java.util.List<answer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<answer>
			orderByComparator);

	/**
	 * Returns an ordered range of all the answers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>answerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of answers
	 * @param end the upper bound of the range of answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of answers
	 */
	public java.util.List<answer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<answer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the answers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of answers.
	 *
	 * @return the number of answers
	 */
	public int countAll();

}