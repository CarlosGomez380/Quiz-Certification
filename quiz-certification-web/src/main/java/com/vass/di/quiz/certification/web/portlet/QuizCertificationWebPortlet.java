package com.vass.di.quiz.certification.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.vass.di.quiz.certification.data.model.QuestionAnswer;
import com.vass.di.quiz.certification.data.service.questionLocalService;
import com.vass.di.quiz.certification.web.constants.QuizCertificationWebPortletKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Diana
 */
@Component(
		immediate = true,
		property = {
				"com.liferay.portlet.display-category=" + QuizCertificationWebPortletKeys.QUIZCERTIFICATION_CATEGORY,
				"com.liferay.portlet.header-portlet-css=/css/main.css",
				"com.liferay.portlet.instanceable=true",
				"javax.portlet.display-name=QuizCertificationWeb",
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/view.jsp",
				"javax.portlet.name=" + QuizCertificationWebPortletKeys.QUIZCERTIFICATIONWEB,
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
		)
public class QuizCertificationWebPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub

		//
		List<QuestionAnswer> listQuestion = questionLocalService.getQuestionAnswer(7,"Basic");
		
		//
		for (QuestionAnswer questionAnswer : listQuestion) {
			
			System.out.println(questionAnswer.toString());
			System.out.println("-----");
			//System.out.println("Regreso pregunta  "+questionAnswer.getQuestion().getQuestion()+" - Respuestas  "+questionAnswer.getListAnswer().toString());	
		}
		

		super.doView(renderRequest, renderResponse);
	}
	
	
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		System.out.println("Accion");
		super.processAction(actionRequest, actionResponse);
	}

	@Reference
	questionLocalService questionLocalService;


}