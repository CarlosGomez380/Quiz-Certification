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
import com.vass.di.quiz.certification.data.model.QuestionAnswer;
import com.vass.di.quiz.certification.data.model.answer;
import com.vass.di.quiz.certification.data.model.question;
import com.vass.di.quiz.certification.data.service.base.questionLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the question local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.vass.di.quiz.certification.data.service.questionLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author dgarces
 * @see questionLocalServiceBaseImpl
 */
@Component(
		property = "model.class.name=com.vass.di.quiz.certification.data.model.question",
		service = AopService.class
		)
public class questionLocalServiceImpl extends questionLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.vass.di.quiz.certification.data.service.questionLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.vass.di.quiz.certification.data.service.questionLocalServiceUtil</code>.
	 */

	/**
	 * Metodo encargado de obtener las preguntas y posibles respuestas.
	 * @param cantQuestion
	 * @return
	 */
	@Override
	public List<QuestionAnswer> getQuestionAnswer(int cantQuestion,  String category){

		//listado de preguntas y respuestas
		List<QuestionAnswer> listQA = new ArrayList<QuestionAnswer>();

		//listado de preguntas
		List<question>listQuestion = getQuestion(cantQuestion, category);

		System.out.println("Preguntas "+ listQuestion.toString());

		for (question question : listQuestion) {

			//lista de respuestas asociadas a una pregunta
			List<answer>listAnswer = getAnswer(question.getPrimaryKey());

			System.out.println("Respuestas "+ listAnswer.toString());
			
			QuestionAnswer qa = new QuestionAnswer(question, listAnswer);

			listQA.add(qa);
		
		}
		
		System.out.println("Finalizo metodo con "+listQA.size()+" preguntas");
		return listQA;

	}


	/**
	 * Metodo encargado de obtener las respuestas asociadas a una pregunta
	 * @param idQuestion
	 * @return
	 */
	private List<answer> getAnswer(long idQuestion){

		List<answer> listAnswer = answerPersistence.findByQuestion(idQuestion);

		return listAnswer;
	}


	/**
	 * Metodo encargado de obtener las preguntas por categoria aleatorio
	 * @param cantQuestion cantidad de preguntas a devolver
	 * @return
	 */
	private List<question> getQuestion(int cantQuestion, String category){

		//total de preguntas existentes en la bd
		List<question> listAllQuestion = questionPersistence.findBycategory(category);


		int rank = listAllQuestion.size();

		System.out.println("Cantidad de preguntas existentes en la categoria: "+rank);

		if(!listAllQuestion.isEmpty()) {

			ArrayList<Integer> numQuestion = getNumberQuestion(rank, cantQuestion);

			System.out.println("Numeros aleatorios "+numQuestion.toString());

			List<question> listQuestion = new ArrayList<question>();
			for (int i = 0; i < cantQuestion; i++) {

				listQuestion.add(listAllQuestion.get(numQuestion.get(i)));

			}
			return listQuestion;
		}
		return null;

	}


	/**
	 * Metodo encargado de obtener el numero de las preguntas que se van a agregar 
	 * @param rank
	 * @return
	 */
	private ArrayList<Integer> getNumberQuestion(int rank, int cantQuestion) {

		ArrayList<Integer> alreadyUsedNumbers;
		System.out.println("rank "+rank);
		if(rank > 1) {
			// Número aleatorio entre 0 y 40, excluido el 40.  
			// Instanciamos la clase Random
			Random random = new Random();
			alreadyUsedNumbers = new ArrayList<Integer>();
			int randomNumber;

			System.out.println("Validando random "+alreadyUsedNumbers.size() + " cant "+cantQuestion);

			while (alreadyUsedNumbers.size() < cantQuestion) {


				randomNumber = random.nextInt(rank) ;

				System.out.println("Validando random "+randomNumber);
				// Si no lo hemos usado ya, lo usamos y lo metemos en el conjunto de usados.
				if (!alreadyUsedNumbers.contains(randomNumber)){
					alreadyUsedNumbers.add(randomNumber);
					System.out.println("Not Repeated Random Number "+randomNumber+" tamsta "+alreadyUsedNumbers.size());
				}

			}
		}else {
			alreadyUsedNumbers = new ArrayList<Integer>();
			alreadyUsedNumbers.add(0);
		}

		return alreadyUsedNumbers;
	}
}