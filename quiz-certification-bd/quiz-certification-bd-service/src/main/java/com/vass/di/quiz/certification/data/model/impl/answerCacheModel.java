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

package com.vass.di.quiz.certification.data.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.vass.di.quiz.certification.data.model.answer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing answer in entity cache.
 *
 * @author dgarces
 * @generated
 */
public class answerCacheModel implements CacheModel<answer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof answerCacheModel)) {
			return false;
		}

		answerCacheModel answerCacheModel = (answerCacheModel)object;

		if (answerId == answerCacheModel.answerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, answerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{answerId=");
		sb.append(answerId);
		sb.append(", questionId=");
		sb.append(questionId);
		sb.append(", answer=");
		sb.append(answer);
		sb.append(", correct=");
		sb.append(correct);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public answer toEntityModel() {
		answerImpl answerImpl = new answerImpl();

		answerImpl.setAnswerId(answerId);
		answerImpl.setQuestionId(questionId);

		if (answer == null) {
			answerImpl.setAnswer("");
		}
		else {
			answerImpl.setAnswer(answer);
		}

		answerImpl.setCorrect(correct);

		answerImpl.resetOriginalValues();

		return answerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		answerId = objectInput.readLong();

		questionId = objectInput.readLong();
		answer = objectInput.readUTF();

		correct = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(answerId);

		objectOutput.writeLong(questionId);

		if (answer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answer);
		}

		objectOutput.writeBoolean(correct);
	}

	public long answerId;
	public long questionId;
	public String answer;
	public boolean correct;

}