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
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.vass.di.quiz.certification.data.service.base.questionServiceBaseImpl;


import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the question remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.vass.di.quiz.certification.data.service.questionService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author dgarces
 * @see questionServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=quiz",
		"json.web.service.context.path=question"
	},
	service = AopService.class
)
public class questionServiceImpl extends questionServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.vass.di.quiz.certification.data.service.questionServiceUtil</code> to access the question remote service.
	 */
	
	
	/**
	 * Metodo remoto encargado de obtener las preguntas y posibles respuestas. 
	 * @param cantQuestion, cantidad de preguntas a mostrar.
	 * @param category, categoria a la que pertenecen las preguntas.
	 * @return Lista con el id de las preguntas y sus respectivas respuestas.
	 */
	@JSONWebService(method= "GET")
	public JSONArray getQuestionAnswer(int cantQuestion,  String category){
		

		JSONArray jsArray= JSONFactoryUtil.createJSONArray(questionLocalService.getQuestionAnswer(cantQuestion, category));
		
		JSONArray ans=JSONFactoryUtil.createJSONArray();
		
		for(int i=0; i<jsArray.length();i++) {
			JSONObject json = JSONFactoryUtil.createJSONObject();
			JSONArray arrayJson = JSONFactoryUtil.createJSONArray();
			JSONObject primero= jsArray.getJSONObject(i);
			
			JSONObject question=primero.getJSONObject("question");
			
			String questionId= question.get("questionId").toString();
			System.out.println("----------");
			System.out.println("QuestionId: " + questionId);
			json.put("QuestionId", questionId);
			
			JSONArray answers=primero.getJSONArray("listAnswer");		
			for(int j=0; j<answers.length();j++) {
				arrayJson.put(answers.getJSONObject(j).get("answerId").toString());
				System.out.println("AnswerId: " + answers.getJSONObject(j).get("answerId").toString());
			}
			
			json.put("AnswerId",(arrayJson));
			ans.put(json);
		}
		
		return ans;
	}

}