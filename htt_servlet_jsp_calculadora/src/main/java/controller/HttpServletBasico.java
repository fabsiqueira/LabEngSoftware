/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 
 */
@WebServlet({"*.action","/"})
public class HttpServletBasico extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req,
                       HttpServletResponse res){
        
        String path = req.getServletPath();
        ServletContext sc = req.getServletContext();
        System.out.println(path); 
        switch (path){
            case "/":
               try{
                    sc.getRequestDispatcher("/jsp/form.jsp").forward(req, res);
                } catch (Exception e){}
               break;
            case "/login.action":
                try{
                    req.setCharacterEncoding("UTF-8");
                    String id = req.getParameter("login");
                    String pass = req.getParameter("senha");
                    res.setContentType("text/html");
                    res.setCharacterEncoding("UTF-8");
                    req.setAttribute("login", id);
                    req.setAttribute("senha", pass);
                    sc.getRequestDispatcher("/jsp/resposta.jsp").forward(req, res);
                }catch (Exception e){}
            break;
            case "/calculo.action":
                try{
                req.setCharacterEncoding("UTF-8");
                    String op1 = req.getParameter("op1");
                    String op2 = req.getParameter("op2");
                    res.setContentType("text/html");
                    res.setCharacterEncoding("UTF-8");
                    req.setAttribute("op1", op1);
                    req.setAttribute("op2", op2);
                    sc.getRequestDispatcher("/jsp/resposta.jsp").forward(req, res);
                }catch (Exception e){}
                 case "/historico.action":
                try{
                    sc.getRequestDispatcher("/jsp/historico.jsp").forward(req, res);
                }catch (Exception e){}
            default:
                try{
                   sc.getRequestDispatcher("/jsp/nao_encontrado.jsp").forward(req, res);
                }catch (Exception e){}               
        }
        
    }  
}