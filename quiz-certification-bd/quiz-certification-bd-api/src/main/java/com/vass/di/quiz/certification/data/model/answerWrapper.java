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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link answer}.
 * </p>
 *
 * @author dgarces
 * @see answer
 * @generated
 */
public class answerWrapper
	extends BaseModelWrapper<answer> implements answer, ModelWrapper<answer> {

	public answerWrapper(answer answer) {
		super(answer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("answerId", getAnswerId());
		attributes.put("questionId", getQuestionId());
		attributes.put("answer", getAnswer());
		attributes.put("correct", isCorrect());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long answerId = (Long)attributes.get("answerId");

		if (answerId != null) {
			setAnswerId(answerId);
		}

		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Boolean correct = (Boolean)attributes.get("correct");

		if (correct != null) {
			setCorrect(correct);
		}
	}

	/**
	 * Returns the answer of this answer.
	 *
	 * @return the answer of this answer
	 */
	@Override
	public String getAnswer() {
		return model.getAnswer();
	}

	/**
	 * Returns the answer ID of this answer.
	 *
	 * @return the answer ID of this answer
	 */
	@Override
	public long getAnswerId() {
		return model.getAnswerId();
	}

	/**
	 * Returns the correct of this answer.
	 *
	 * @return the correct of this answer
	 */
	@Override
	public boolean getCorrect() {
		return model.getCorrect();
	}

	/**
	 * Returns the primary key of this answer.
	 *
	 * @return the primary key of this answer
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the question ID of this answer.
	 *
	 * @return the question ID of this answer
	 */
	@Override
	public long getQuestionId() {
		return model.getQuestionId();
	}

	/**
	 * Returns <code>true</code> if this answer is correct.
	 *
	 * @return <code>true</code> if this answer is correct; <code>false</code> otherwise
	 */
	@Override
	public boolean isCorrect() {
		return model.isCorrect();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the answer of this answer.
	 *
	 * @param answer the answer of this answer
	 */
	@Override
	public void setAnswer(String answer) {
		model.setAnswer(answer);
	}

	/**
	 * Sets the answer ID of this answer.
	 *
	 * @param answerId the answer ID of this answer
	 */
	@Override
	public void setAnswerId(long answerId) {
		model.setAnswerId(answerId);
	}

	/**
	 * Sets whether this answer is correct.
	 *
	 * @param correct the correct of this answer
	 */
	@Override
	public void setCorrect(boolean correct) {
		model.setCorrect(correct);
	}

	/**
	 * Sets the primary key of this answer.
	 *
	 * @param primaryKey the primary key of this answer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the question ID of this answer.
	 *
	 * @param questionId the question ID of this answer
	 */
	@Override
	public void setQuestionId(long questionId) {
		model.setQuestionId(questionId);
	}

	@Override
	protected answerWrapper wrap(answer answer) {
		return new answerWrapper(answer);
	}

}