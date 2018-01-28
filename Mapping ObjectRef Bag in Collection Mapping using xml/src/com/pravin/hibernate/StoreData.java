package com.pravin.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
	Session session = new Configuration().configure()
		.buildSessionFactory()
		.openSession();
	Transaction transaction = session.beginTransaction();

	Answer answer1 = new Answer();
	answer1.setGivenAnswer("Gokhale");
	answer1.setPostBy("Amit");
	Answer answer2 = new Answer();
	answer2.setGivenAnswer("Kulkarni");
	answer2.setPostBy("Amar");

	ArrayList<Answer> arrayList = new ArrayList<>();
	arrayList.add(answer1);
	arrayList.add(answer2);

	Question question = new Question();
	question.setQname("Whtas your sirname?");
	question.setAnswers(arrayList);

	session.persist(question);
	transaction.commit();
	session.close();
	System.out.println("Success!");
    }
}
