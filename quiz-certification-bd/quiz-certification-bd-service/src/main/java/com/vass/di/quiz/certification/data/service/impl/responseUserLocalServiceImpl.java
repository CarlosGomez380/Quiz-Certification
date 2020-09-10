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

package com.vass.di.quiz.certification.data.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.vass.di.quiz.certification.data.model.answer;
import com.vass.di.quiz.certification.data.model.question;
import com.vass.di.quiz.certification.data.model.responseUser;
import com.vass.di.quiz.certification.data.service.questionLocalServiceUtil;
import com.vass.di.quiz.certification.data.service.responseUserLocalServiceUtil;
import com.vass.di.quiz.certification.data.service.base.responseUserLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the response user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.vass.di.quiz.certification.data.service.responseUserLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author dgarces
 * @see responseUserLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.vass.di.quiz.certification.data.model.responseUser",
	service = AopService.class
)
public class responseUserLocalServiceImpl
	extends responseUserLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.vass.di.quiz.certification.data.service.responseUserLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.vass.di.quiz.certification.data.service.responseUserLocalServiceUtil</code>.
	 */
	
	/**
	 * Metodo que crea la respuesta del usuario.
	 * @param responseUserId, Id de la respuesta del usuario.
	 * @param userId, Id del usuario.
	 * @param questionId, Id de la pregunta a responder.
	 * @param answersId, Lista con los id de las respuestas del usuario a la pregunta.
	 */
	@Override
	public void createResponseUser (long responseUserId, long userId,  long questionId, 
			List<Long> answersId) {
		for(int i=0;i<answersId.size();i++) {
			responseUser responseUser= responseUserLocalServiceUtil.createresponseUser(responseUserId+i);
			responseUser.setUserId(userId);
			responseUser.setQuestionId(questionId);
			responseUser.setAnswerId(answersId.get(i));
			responseUser.setCreateDate(new Date() );
			responseUser.setModifiedDate(new Date());
			responseUserLocalServiceUtil.addresponseUser(responseUser);
		}
		
	}
	
	/**
	 * Metodo encargado de obtener las respuestas correctas.
	 * @param answersId, Lista con los id de las respuestas hechas por el usuario.
	 * @return Objeto JSONArray con los id de las respuestas correctas.
	 */
	@Override
	public JSONArray checkResponse(List<Long> answersId) {
		List<Long> ansArray=new ArrayList<Long>();
		long questionId= answerPersistence.fetchByPrimaryKey(answersId.get(0)).getQuestionId();
		for(int i=0; i<answersId.size();i++) {
			if(answerPersistence.fetchByPrimaryKey(answersId.get(i)).getCorrect()) {
				ansArray.add(answerPersistence.fetchByPrimaryKey(answersId.get(i)).getPrimaryKey());
			}
		}
		return JSONFactoryUtil.createJSONArray(ansArray);
	}
	
	
	
	
}