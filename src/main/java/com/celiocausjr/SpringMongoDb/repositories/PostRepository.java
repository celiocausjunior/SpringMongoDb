package com.celiocausjr.SpringMongoDb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.celiocausjr.SpringMongoDb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
