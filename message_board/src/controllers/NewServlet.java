package controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Timestamp;
import models.Message;
import utils.DBUtil;


@WebServlet("/new")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public NewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = DBUtil.createEntityManager();
		em.getTransaction().begin();
		
		// Messageのインスタンスを生成
		Message m = new Message();
		
		// mの各フィールドにデータを挿入
		String title = "taro";
		m.setTitle(title);
		
		String content = "hello";
		m.setContent(content);
		
		// 現在の日時を取得
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
	    m.setCreated_at(currentTime);
	    m.setUpdated_at(currentTime);
		
	    // DBに保存
	    em.persist(m);
	    em.getTransaction().commit();
		
	    // 自動採番されたIDの値を表示
	    response.getWriter().append(Integer.valueOf(m.getId()).toString());
	    
	    em.close();
	}

}
