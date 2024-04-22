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
	    
	    // CSRF対策(セキュリティ)
	    // - フォームからhidden要素で送られた値とセッションに格納された値が同一の時送信を受け入れる
	    request.setAttribute("_token", request.getSession().getId());
	    
	    // "おまじない"としてのインスタンスを生成
	    request.setAttribute("message", new Message());
	    
	    var rd = request.getRequestDispatcher("/WEB-INF/views/messages/new.jsp");
	    rd.forward(request, response);
	    
	    /* 以下はCreateServletへ移行 */
//		EntityManager em = DBUtil.createEntityManager();
//		em.getTransaction().begin();
//		
//		// Messageのインスタンスを生成
//		Message m = new Message();
//		
//		// mの各フィールドにデータを挿入
//		String title = "taro";
//		m.setTitle(title);
//		
//		String content = "hello";
//		m.setContent(content);
//		
//		// 現在の日時を取得
//		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
//	    m.setCreated_at(currentTime);
//	    m.setUpdated_at(currentTime);
//		
//	    // DBに保存
//	    em.persist(m);
//	    em.getTransaction().commit();
//		
//	    // 自動採番されたIDの値を表示
//	    response.getWriter().append(Integer.valueOf(m.getId()).toString());
//	    
//	    em.close();
	}

}
