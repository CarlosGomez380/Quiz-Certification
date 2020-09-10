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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.vass.di.quiz.certification.data.service.http.responseUserServiceSoap}.
 *
 * @author dgarces
 * @generated
 */
public class responseUserSoap implements Serializable {

	public static responseUserSoap toSoapModel(responseUser model) {
		responseUserSoap soapModel = new responseUserSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setResponseUserId(model.getResponseUserId());
		soapModel.setUserId(model.getUserId());
		soapModel.setQuestionId(model.getQuestionId());
		soapModel.setAnswerId(model.getAnswerId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static responseUserSoap[] toSoapModels(responseUser[] models) {
		responseUserSoap[] soapModels = new responseUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static responseUserSoap[][] toSoapModels(responseUser[][] models) {
		responseUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new responseUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new responseUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static responseUserSoap[] toSoapModels(List<responseUser> models) {
		List<responseUserSoap> soapModels = new ArrayList<responseUserSoap>(
			models.size());

		for (responseUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new responseUserSoap[soapModels.size()]);
	}

	public responseUserSoap() {
	}

	public long getPrimaryKey() {
		return _responseUserId;
	}

	public void setPrimaryKey(long pk) {
		setResponseUserId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getResponseUserId() {
		return _responseUserId;
	}

	public void setResponseUserId(long responseUserId) {
		_responseUserId = responseUserId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public long getAnswerId() {
		return _answerId;
	}

	public void setAnswerId(long answerId) {
		_answerId = answerId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _responseUserId;
	private long _userId;
	private long _questionId;
	private long _answerId;
	private Date _createDate;
	private Date _modifiedDate;

}