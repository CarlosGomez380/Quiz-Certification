package com.vass.di.quiz.certification.data.model;

import java.io.Serializable;
import java.util.List;

public class QuestionAnswer implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2440765369959110623L;

	private question question;
	
	private List<answer> listAnswer;
		
	
	/**
	 * @return the question
	 */
	public question getQuestion() {
		return question;
	}



	/**
	 * @param question the question to set
	 */
	public void setQuestion(question question) {
		this.question = question;
	}



	/**
	 * @return the listAnswer
	 */
	public List<answer> getListAnswer() {
		return listAnswer;
	}



	/**
	 * @param listAnswer the listAnswer to set
	 */
	public void setListAnswer(List<answer> listAnswer) {
		this.listAnswer = listAnswer;
	}



	/**
	 * 
	 */
	public QuestionAnswer() {
		super();
	}



	/**
	 * @param question
	 * @param listAnswer
	 * @param idAnswerCorrect
	 */
	public QuestionAnswer(com.vass.di.quiz.certification.data.model.question question, List<answer> listAnswer) {
		super();
		this.question = question;
		this.listAnswer = listAnswer;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuestionAnswer [question=" + question.toString() + ", listAnswer=" + listAnswer.toString() + "]";
	}
	
	
	
	
	

}
