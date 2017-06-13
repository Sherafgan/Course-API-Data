package me.sherafgan.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);
}
