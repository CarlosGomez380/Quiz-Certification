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

package com.vass.di.quiz.certification.data.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link responseUser}.
 * </p>
 *
 * @author dgarces
 * @see responseUser
 * @generated
 */
public class responseUserWrapper
	extends BaseModelWrapper<responseUser>
	implements ModelWrapper<responseUser>, responseUser {

	public responseUserWrapper(responseUser responseUser) {
		super(responseUser);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("responseUserId", getResponseUserId());
		attributes.put("userId", getUserId());
		attributes.put("questionId", getQuestionId());
		attributes.put("answerId", getAnswerId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long responseUserId = (Long)attributes.get("responseUserId");

		if (responseUserId != null) {
			setResponseUserId(responseUserId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		Long answerId = (Long)attributes.get("answerId");

		if (answerId != null) {
			setAnswerId(answerId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	 * Returns the answer ID of this response user.
	 *
	 * @return the answer ID of this response user
	 */
	@Override
	public long getAnswerId() {
		return model.getAnswerId();
	}

	/**
	 * Returns the create date of this response user.
	 *
	 * @return the create date of this response user
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the modified date of this response user.
	 *
	 * @return the modified date of this response user
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this response user.
	 *
	 * @return the primary key of this response user
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the question ID of this response user.
	 *
	 * @return the question ID of this response user
	 */
	@Override
	public long getQuestionId() {
		return model.getQuestionId();
	}

	/**
	 * Returns the response user ID of this response user.
	 *
	 * @return the response user ID of this response user
	 */
	@Override
	public long getResponseUserId() {
		return model.getResponseUserId();
	}

	/**
	 * Returns the response user uuid of this response user.
	 *
	 * @return the response user uuid of this response user
	 */
	@Override
	public String getResponseUserUuid() {
		return model.getResponseUserUuid();
	}

	/**
	 * Returns the user ID of this response user.
	 *
	 * @return the user ID of this response user
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this response user.
	 *
	 * @return the user uuid of this response user
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this response user.
	 *
	 * @return the uuid of this response user
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the answer ID of this response user.
	 *
	 * @param answerId the answer ID of this response user
	 */
	@Override
	public void setAnswerId(long answerId) {
		model.setAnswerId(answerId);
	}

	/**
	 * Sets the create date of this response user.
	 *
	 * @param createDate the create date of this response user
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the modified date of this response user.
	 *
	 * @param modifiedDate the modified date of this response user
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this response user.
	 *
	 * @param primaryKey the primary key of this response user
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the question ID of this response user.
	 *
	 * @param questionId the question ID of this response user
	 */
	@Override
	public void setQuestionId(long questionId) {
		model.setQuestionId(questionId);
	}

	/**
	 * Sets the response user ID of this response user.
	 *
	 * @param responseUserId the response user ID of this response user
	 */
	@Override
	public void setResponseUserId(long responseUserId) {
		model.setResponseUserId(responseUserId);
	}

	/**
	 * Sets the response user uuid of this response user.
	 *
	 * @param responseUserUuid the response user uuid of this response user
	 */
	@Override
	public void setResponseUserUuid(String responseUserUuid) {
		model.setResponseUserUuid(responseUserUuid);
	}

	/**
	 * Sets the user ID of this response user.
	 *
	 * @param userId the user ID of this response user
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this response user.
	 *
	 * @param userUuid the user uuid of this response user
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this response user.
	 *
	 * @param uuid the uuid of this response user
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected responseUserWrapper wrap(responseUser responseUser) {
		return new responseUserWrapper(responseUser);
	}

}