create index IX_7EBCF83 on QUIZ_answer (questionId);

create index IX_9FCCD079 on QUIZ_correctAnswer (questionId);

create index IX_AAA9DF48 on QUIZ_question (category[$COLUMN_LENGTH:75$]);

create index IX_5D92E98 on QUIZ_responseUser (uuid_[$COLUMN_LENGTH:75$]);