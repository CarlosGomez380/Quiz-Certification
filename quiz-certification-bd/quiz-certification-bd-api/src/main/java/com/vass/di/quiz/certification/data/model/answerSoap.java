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
 * This class is used by SOAP remote services.
 *
 * @author dgarces
 * @generated
 */
public class answerSoap implements Serializable {

	public static answerSoap toSoapModel(answer model) {
		answerSoap soapModel = new answerSoap();

		soapModel.setAnswerId(model.getAnswerId());
		soapModel.setQuestionId(model.getQuestionId());
		soapModel.setAnswer(model.getAnswer());
		soapModel.setCorrect(model.isCorrect());

		return soapModel;
	}

	public static answerSoap[] toSoapModels(answer[] models) {
		answerSoap[] soapModels = new answerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static answerSoap[][] toSoapModels(answer[][] models) {
		answerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new answerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new answerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static answerSoap[] toSoapModels(List<answer> models) {
		List<answerSoap> soapModels = new ArrayList<answerSoap>(models.size());

		for (answer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new answerSoap[soapModels.size()]);
	}

	public answerSoap() {
	}

	public long getPrimaryKey() {
		return _answerId;
	}

	public void setPrimaryKey(long pk) {
		setAnswerId(pk);
	}

	public long getAnswerId() {
		return _answerId;
	}

	public void setAnswerId(long answerId) {
		_answerId = answerId;
	}

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public boolean getCorrect() {
		return _correct;
	}

	public boolean isCorrect() {
		return _correct;
	}

	public void setCorrect(boolean correct) {
		_correct = correct;
	}

	private long _answerId;
	private long _questionId;
	private String _answer;
	private boolean _correct;

}