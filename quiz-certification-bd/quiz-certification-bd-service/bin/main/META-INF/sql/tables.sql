create table QUIZ_answer (
	answerId LONG not null primary key,
	questionId LONG,
	answer VARCHAR(500) null,
	correct BOOLEAN
);

create table QUIZ_correctAnswer (
	correctId LONG not null primary key,
	questionId LONG,
	answerId LONG
);

create table QUIZ_question (
	questionId LONG not null primary key,
	question VARCHAR(500) null,
	category VARCHAR(75) null
);

create table QUIZ_responseUser (
	uuid_ VARCHAR(75) null,
	responseUserId LONG not null primary key,
	userId LONG,
	questionId LONG,
	answerId LONG,
	createDate DATE null,
	modifiedDate DATE null
);