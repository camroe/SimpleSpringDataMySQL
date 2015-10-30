package com.gophergroceries;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gophergroceries.entities.Post;
import com.gophergroceries.repository.PostRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/application-context.xml")
public class PostRepositoryTest {

	@Autowired
	PostRepository repository;

	@Test
	public void test() {
		Post post = new Post();
		post.setDate(new Date());
		post.setTitle("First Post");

		repository.save(post);

		Post dbpost = repository.findOne(post.getPostId());
		assertNotNull(dbpost);
		System.out.println(dbpost);
	}

}
