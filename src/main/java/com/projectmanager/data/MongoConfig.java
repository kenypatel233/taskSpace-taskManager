package com.projectmanager.data;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.projectmanager.data.dao")
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    public MongoClient mongoClient() {
        MongoClientURI uri = new MongoClientURI(
                "" +"mongodb+srv://kenypatel233:vd7I8nBBvkpghmhy@cluster0.ccn2kjs.mongodb.net/?retryWrites=true&w=majority"
        );
        return new MongoClient(uri);
    }

    @Override
    protected String getDatabaseName() {
        return "taskmanager";
    }
}
