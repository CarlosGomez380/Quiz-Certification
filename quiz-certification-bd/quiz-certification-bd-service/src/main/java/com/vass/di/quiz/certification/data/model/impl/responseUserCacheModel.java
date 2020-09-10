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

import com.vass.di.quiz.certification.data.model.responseUser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing responseUser in entity cache.
 *
 * @author dgarces
 * @generated
 */
public class responseUserCacheModel
	implements CacheModel<responseUser>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof responseUserCacheModel)) {
			return false;
		}

		responseUserCacheModel responseUserCacheModel =
			(responseUserCacheModel)object;

		if (responseUserId == responseUserCacheModel.responseUserId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, responseUserId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", responseUserId=");
		sb.append(responseUserId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", questionId=");
		sb.append(questionId);
		sb.append(", answerId=");
		sb.append(answerId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public responseUser toEntityModel() {
		responseUserImpl responseUserImpl = new responseUserImpl();

		if (uuid == null) {
			responseUserImpl.setUuid("");
		}
		else {
			responseUserImpl.setUuid(uuid);
		}

		responseUserImpl.setResponseUserId(responseUserId);
		responseUserImpl.setUserId(userId);
		responseUserImpl.setQuestionId(questionId);
		responseUserImpl.setAnswerId(answerId);

		if (createDate == Long.MIN_VALUE) {
			responseUserImpl.setCreateDate(null);
		}
		else {
			responseUserImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			responseUserImpl.setModifiedDate(null);
		}
		else {
			responseUserImpl.setModifiedDate(new Date(modifiedDate));
		}

		responseUserImpl.resetOriginalValues();

		return responseUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		responseUserId = objectInput.readLong();

		userId = objectInput.readLong();

		questionId = objectInput.readLong();

		answerId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(responseUserId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(questionId);

		objectOutput.writeLong(answerId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long responseUserId;
	public long userId;
	public long questionId;
	public long answerId;
	public long createDate;
	public long modifiedDate;

}