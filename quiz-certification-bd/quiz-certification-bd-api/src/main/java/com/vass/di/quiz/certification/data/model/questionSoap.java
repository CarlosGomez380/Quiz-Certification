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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.vass.di.quiz.certification.data.service.http.questionServiceSoap}.
 *
 * @author dgarces
 * @generated
 */
public class questionSoap implements Serializable {

	public static questionSoap toSoapModel(question model) {
		questionSoap soapModel = new questionSoap();

		soapModel.setQuestionId(model.getQuestionId());
		soapModel.setQuestion(model.getQuestion());
		soapModel.setCategory(model.getCategory());

		return soapModel;
	}

	public static questionSoap[] toSoapModels(question[] models) {
		questionSoap[] soapModels = new questionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static questionSoap[][] toSoapModels(question[][] models) {
		questionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new questionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new questionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static questionSoap[] toSoapModels(List<question> models) {
		List<questionSoap> soapModels = new ArrayList<questionSoap>(
			models.size());

		for (question model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new questionSoap[soapModels.size()]);
	}

	public questionSoap() {
	}

	public long getPrimaryKey() {
		return _questionId;
	}

	public void setPrimaryKey(long pk) {
		setQuestionId(pk);
	}

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public String getQuestion() {
		return _question;
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	private long _questionId;
	private String _question;
	private String _category;

}