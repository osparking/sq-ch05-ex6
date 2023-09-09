package main;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import service.CommentService;
import service.UserService;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		CommentService cmt = ctx.getBean(CommentService.class);
		UserService usr = ctx.getBean(UserService.class);
		boolean yesDiff = cmt.getRepository() != usr.getRepository();
		var ps = new PrintStream(System.out, true, UTF_8);
		ps.println("두 원형 빈은 다르다: " + yesDiff);
	}

}
