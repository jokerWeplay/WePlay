package weplay.spring;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date [Thu May 15 11:03:17 CST 2014]
 * 业务实现类
 */
@org.springframework.stereotype.Controller
@RequestMapping("/Test")
public class TestController {
	
	public TestController(){
		System.out.println("weplay``````");
	}
	
	@RequestMapping(value="query")
	public String query( HttpServletRequest req, HttpServletResponse resp ) throws Exception {
		List<HelloWorld> list = new ArrayList<HelloWorld>();
		
		HelloWorld h1 = new HelloWorld();
		h1.setName("Joker");
		h1.setPwd("123");
		
		HelloWorld h2 = new HelloWorld();
		h2.setName("Mawenzhong");
		h2.setPwd("123");
		
		HelloWorld h3 = new HelloWorld();
		h3.setName("Wangxin");
		h3.setPwd("123");
		
		list.add(h1);
		list.add(h2);
		list.add(h3);
		
		System.out.println("3333333");
		
		req.setAttribute("list", list);
		return "/welcome"; 
	}
	
	@RequestMapping(value="queryJson")
	public @ResponseBody List queryJson( HttpServletRequest req, HttpServletResponse resp ) throws Exception {
		List<HelloWorld> list = new ArrayList<HelloWorld>();
		
		HelloWorld h1 = new HelloWorld();
		h1.setName("Joker");
		h1.setPwd("123");
		
		HelloWorld h2 = new HelloWorld();
		h2.setName("Mawenzhong");
		h2.setPwd("123");
		
		HelloWorld h3 = new HelloWorld();
		h3.setName("Wangxin");
		h3.setPwd("123");
		
		list.add(h1);
		list.add(h2);
		list.add(h3);
		
		req.setAttribute("list", list);
		return list; 
	}
}
