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
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.vass.di.quiz.certification.data.model.answer;
import com.vass.di.quiz.certification.data.model.responseUser;
import com.vass.di.quiz.certification.data.service.responseUserLocalServiceUtil;
import com.vass.di.quiz.certification.data.service.base.responseUserServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the response user remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.vass.di.quiz.certification.data.service.responseUserService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author dgarces
 * @see responseUserServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=quiz",
		"json.web.service.context.path=responseUser"
	},
	service = AopService.class
)
public class responseUserServiceImpl extends responseUserServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.vass.di.quiz.certification.data.service.responseUserServiceUtil</code> to access the response user remote service.
	 */
	
	/**
	 * Metodo que crea la respuesta del usuario.
	 * @param responseUserId, Id de la respuesta del usuario.
	 * @param userId, Id del usuario.
	 * @param questionId, Id de la pregunta a responder.
	 * @param answersId, Lista con los id de las respuestas del usuario a la pregunta.
	 */
	@Override
	public void createResponseUser (long responseUserId, long userId, long questionId, 
			List<Long> answersId) {
		
		responseUserLocalService.createResponseUser(responseUserId, userId, questionId, answersId);
	}
	
	/**
	 * Metodo encargado de obtener las respuestas correctas.
	 * @param answersId, Lista con los id de las respuestas hechas por el usuario.
	 * @return Objeto JSONArray con los id de las respuestas correctas.
	 */
	@Override
	public JSONArray checkResponse(List<Long> answersId) {
		return responseUserLocalService.checkResponse(answersId);
	}
}