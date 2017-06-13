package me.sherafgan.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public interface TopicRepository extends CrudRepository<Topic, String> {
}
