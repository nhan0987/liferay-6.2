create table api_log (
	id_ LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	userAgent VARCHAR(75) null,
	ip VARCHAR(75) null,
	code_ VARCHAR(75) null,
	request VARCHAR(75) null,
	response VARCHAR(75) null
);